import React, { Component }  from 'react';
import { View, Text, Button, TextInput } from 'react-native';
import { Picker } from '@react-native-picker/picker';
import {styles} from './Styles';

class App extends Component {
  constructor(props){
    super(props);
    this.state = {
      qtdeMoeda: 0.00,
      deValor: 1,
      paraValor: 1,
      resultado: '',
    };
    this.calculo = this.calculo.bind(this);
  }

  calculo(){
    if(this.state.deValor == 3 && this.state.paraValor == 1) {

      this.setState({ resultado: 'US$ ' + (this.state.qtdeMoeda * 0.19).toFixed(2)});

    } else if (this.state.deValor == 3 && this.state.paraValor == 2) {

      this.setState({ resultado: (this.state.qtdeMoeda * 0.20).toFixed(2) + ' €'});

    } else if (this.state.deValor == 3 && this.state.paraValor == 3) {

      this.setState({ resultado: 'R$ ' + (this.state.qtdeMoeda * 1.00).toFixed(2)});

    } else if (this.state.deValor == 2 && this.state.paraValor == 1) {

      this.setState({ resultado: 'US$ ' + (this.state.qtdeMoeda * 0.97).toFixed(2)});

    } else if (this.state.deValor == 2 && this.state.paraValor == 2) {

      this.setState({ resultado: (this.state.qtdeMoeda * 1.00).toFixed(2) + ' €'});

    } else if (this.state.deValor == 2 && this.state.paraValor == 3) {

      this.setState({ resultado: 'R$ ' + (this.state.qtdeMoeda * 5.10).toFixed(2)});

    } else if (this.state.deValor == 1 && this.state.paraValor == 1) {

      this.setState({ resultado: 'US$ ' + (this.state.qtdeMoeda * 1.00).toFixed(2)});

    } else if (this.state.deValor == 1 && this.state.paraValor == 2) {

      this.setState({ resultado: (this.state.qtdeMoeda * 1.03).toFixed(2) + ' €'});

    } else if (this.state.deValor == 1 && this.state.paraValor == 3) {

      this.setState({ resultado: 'R$ ' + (this.state.qtdeMoeda * 5.26).toFixed(2)});

    }
  }

  render(){
    return (
      <View style={styles.container}>

        <Text style={styles.textoTittle}>Conversor de Moedas</Text>
        <Text style={styles.textoTittle2}>Dólar, Real e Euro</Text>

        <Text style={styles.textoTittle1}>Valor: </Text>
        <TextInput style={styles.input} placeholder="Qtde a ser convertido" onChangeText={qtdeMoeda => {this.setState({ qtdeMoeda });}} keyboardType="numeric" />

        <Text style={styles.textoDados}>De: </Text>
        <Picker
          selectedValue={this.state.deValor}
          onValueChange={(itemValue, itemIndex) =>
          this.setState({ deValor: itemValue })
        }>
          <Picker.Item key={1} value={1} label="Dólar" />
          <Picker.Item key={2} value={2} label="Euro" />
          <Picker.Item key={3} value={3} label="Real" />
        </Picker>
        
        <Text style={styles.textoDados}>Para: </Text>
        <Picker
          selectedValue={this.state.paraValor}
          onValueChange={(itemValue, itemIndex) =>
          this.setState({ paraValor: itemValue })
        }>
          <Picker.Item key={1} value={1} label="Dólar" />
          <Picker.Item key={2} value={2} label="Euro" />
          <Picker.Item key={3} value={3} label="Real" />
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
