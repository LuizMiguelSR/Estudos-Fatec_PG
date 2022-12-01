import React, { Component }  from 'react';
import { View, Text, Button, TextInput } from 'react-native';
import { Picker } from '@react-native-picker/picker';
import {styles} from './Styles';
import api from './src/services/api';

class App extends Component {
  constructor(props){
    super(props);
    this.state = {
      qtdeMoeda: 0.00,
      deValor: '',
      paraValor: '',
      resultado: '',
      buscas: [],
    };
  }

  calculo = () => {
    api.get(`${this.state.deValor}-${this.state.paraValor}`).then(response => { this.setState({ buscas: response.data}) });

    if(this.state.deValor == 'BRL' && this.state.paraValor == 'USD') {

      this.setState({ resultado: 'US$ ' + (this.state.qtdeMoeda * this.state.buscas.BRLUSD.ask).toFixed(2)});

    } else if (this.state.deValor == 'BRL' && this.state.paraValor == 'EUR') {

      this.setState({ resultado: (this.state.qtdeMoeda * this.state.buscas.BRLEUR.ask).toFixed(2) + ' €'});

    } else if (this.state.deValor == 'BRL' && this.state.paraValor == 'BRL') {

      this.setState({ resultado: 'Valores da mesma moeda'});

    } else if (this.state.deValor == 'BRL' && this.state.paraValor == 'BTC') {

      this.setState({ resultado: 'A API não retorna essa conversão kkkkk' });

    } else if (this.state.deValor == 'EUR' && this.state.paraValor == 'BTC') {

      this.setState({ resultado: 'A API não retorna essa conversão kkkkk' });

    } else if (this.state.deValor == 'USD' && this.state.paraValor == 'BTC') {

      this.setState({ resultado: 'A API não retorna essa conversão kkkkk' });

    } else if (this.state.deValor == 'BTC' && this.state.paraValor == 'BTC') {

      this.setState({ resultado: 'Valores da mesma moeda' });

    } else if (this.state.deValor == 'BTC' && this.state.paraValor == 'USD') {

      this.setState({ resultado: 'US$ ' + (this.state.qtdeMoeda * this.state.buscas.BTCUSD.ask).toFixed(2)});

    } else if (this.state.deValor == 'BTC' && this.state.paraValor == 'EUR') {

      this.setState({ resultado: (this.state.qtdeMoeda * this.state.buscas.BTCEUR.ask).toFixed(2) + ' €'});

    } else if (this.state.deValor == 'BTC' && this.state.paraValor == 'BRL') {

      this.setState({ resultado: 'R$ ' + (this.state.qtdeMoeda * this.state.buscas.BTCBRL.ask).toFixed(2)});

    } else if (this.state.deValor == 'USD' && this.state.paraValor == 'USD') {

      this.setState({ resultado: 'Valores da mesma moeda' });

    } else if (this.state.deValor == 'USD' && this.state.paraValor == 'EUR') {

      this.setState({ resultado: (this.state.qtdeMoeda * this.state.buscas.USDEUR.ask).toFixed(2) + ' €'});

    } else if (this.state.deValor == 'USD' && this.state.paraValor == 'BRL') {

      this.setState({ resultado: 'R$ ' + (this.state.qtdeMoeda * this.state.buscas.USDBRL.ask).toFixed(2)});

    } else if (this.state.deValor == 'EUR' && this.state.paraValor == 'EUR') {

      this.setState({ resultado: 'Valores da mesma moeda'});

    } else if (this.state.deValor == 'EUR' && this.state.paraValor == 'BRL') {

      this.setState({ resultado: 'R$ ' + (this.state.qtdeMoeda * this.state.buscas.EURBRL.ask).toFixed(2)});

    } else if (this.state.deValor == 'EUR' && this.state.paraValor == 'USD') {

      this.setState({ resultado: 'US$ ' + (this.state.qtdeMoeda * this.state.buscas.EURUSD.ask).toFixed(2)});

    }
  }

  render(){
    return (
      <View style={styles.container}>

        <Text style={styles.textoTittle}>Conversor de Moedas</Text>

        <Text style={styles.textoTittle1}>Valor: </Text>
        <TextInput style={styles.input} placeholder="Qtde a ser convertido" onChangeText={qtdeMoeda => {this.setState({ qtdeMoeda });}} keyboardType="numeric" />

        <Text style={styles.textoDados}>De: </Text>
        <Picker
          selectedValue={this.state.deValor}
          onValueChange={(itemValue, itemIndex) =>
          this.setState({ deValor: itemValue })
        }>
          <Picker.Item key={1} value={'USD'} label="Dólar" />
          <Picker.Item key={2} value={'EUR'} label="Euro" />
          <Picker.Item key={3} value={'BTC'} label="Bitcoin" />
          <Picker.Item key={4} value={'BRL'} label="Real" />
        </Picker>
        
        <Text style={styles.textoDados}>Para: </Text>
        <Picker
          selectedValue={this.state.paraValor}
          onValueChange={(itemValue, itemIndex) =>
          this.setState({ paraValor: itemValue })
        }>
          <Picker.Item key={1} value={'USD'} label="Dólar" />
          <Picker.Item key={2} value={'EUR'} label="Euro" />
          <Picker.Item key={3} value={'BTC'} label="Bitcoin" />
          <Picker.Item key={4} value={'BRL'} label="Real" />
        </Picker>

        <View style={styles.viewMode}></View>

        <Button title="Converter" onPress={this.calculo} />

        <Text style={styles.texto1}> Resultado</Text>
        <Text style={styles.texto1}> {this.state.resultado} </Text>

      </View>
    );
  }
}
export default App;
