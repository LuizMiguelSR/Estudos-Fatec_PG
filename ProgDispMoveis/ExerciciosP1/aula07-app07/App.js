import React, { Component }  from 'react';
import { View, Text, Button, Switch, TextInput } from 'react-native';
import { Picker } from '@react-native-picker/picker';
import Slider from '@react-native-community/slider';
import {styles} from './Styles';
 
class App extends Component {
  constructor(props){
    super(props);
    this.state = {
      nomeUser: '',
      idadeUser: 0,
      sexoValor: '',
      escolaridadeValor: 0,
      valorLimite: 0.00,
      status: false,
      resultados: [],
      sexos: [
        { nome: 'Masculino', valor: 'masculino' },
        { nome: 'Feminino', valor: 'feminino' },
      ],
      escolaridades: [
        { nome: 'Ensino fundamental completo', valor: 'ensino fundamental completo' },
        { nome: 'Ensino fundamental incompleto', valor: 'ensino fundamental incompleto' },
        { nome: 'Ensino medio completo', valor: 'ensino medio completo' },
        { nome: 'Ensino medio incompleto', valor: 'ensino medio incompleto' },
        { nome: 'Ensino superior completo', valor: 'ensino superior completo' },
        { nome: 'Ensino superior incompleto', valor: 'ensino superior incompleto' },
      ],
    };
    this.formulario = this.formulario.bind(this);
  }

  formulario(){
    this.setState({resultados: [this.state.nomeUser, this.state.idadeUser, this.state.sexos[this.state.sexoValor].valor, this.state.escolaridades[this.state.escolaridadeValor].valor, this.state.valorLimite.toFixed(2), (this.state.status) ? "Sim" : "Não"]});
  }

  render(){
    let sexoItem = this.state.sexos.map((valor, chave) => {
      return <Picker.Item key={chave} value={chave} label={valor.nome} />;
    });
    let escolaridadeItem = this.state.escolaridades.map((valor, chave) => {
      return <Picker.Item key={chave} value={chave} label={valor.nome} />;
    });
    return(
      <View style={styles.container}>
        <Text style={styles.textoTittle}>Abertura de Conta</Text>

        <Text style={styles.textoDados}>Nome: </Text>
        <TextInput style={styles.input} placeholder="Seu nome" onChangeText={nomeUser => {this.setState({ nomeUser });}} />

        <Text style={styles.textoDados}>Idade: </Text>
        <TextInput style={styles.input} placeholder="Sua idade" onChangeText={idadeUser => {this.setState({ idadeUser });}} keyboardType="numeric" />

        <Text style={styles.textoDados}>Sexo: </Text>
        <Picker
          selectedValue={this.state.sexoValor}
          onValueChange={(itemValue, itemIndex) =>
          this.setState({ sexoValor: itemValue })
        }>
        {sexoItem}
        </Picker>

        <Text style={styles.textoDados}>Escolaridade: </Text>
        <Picker
          selectedValue={this.state.escolaridadeValor}
          onValueChange={(itemValue, itemIndex) =>
          this.setState({ escolaridadeValor: itemValue })
        }>
        {escolaridadeItem}
        </Picker>

        <Text style={styles.textoDados}>Limite: </Text>
        <Slider
          minimumValue={0}
          maximumValue={1000}
          step={100}
          onValueChange={ (valorSelecionado) => this.setState({valorLimite: valorSelecionado})}
          value={this.state.valorLimite}
        />
        <Text style={{textAlign: 'center', fontSize: 16}}>
          R$ {this.state.valorLimite.toFixed(2)}
        </Text>

        <Text style={styles.textoDados}>Brasileiro: </Text>
        <Switch 
          value={this.state.status}
          onValueChange={ (valorSwitch) => this.setState({status: valorSwitch})}
        />

        <Button onPress={this.formulario} title="Confirmar" />

        <Text style={styles.textoTittle1}>Dados informados</Text>
        
        <Text style={styles.textoDados}>Nome: {this.state.resultados[0]}</Text>
        <Text style={styles.textoDados}>Idade: {this.state.resultados[1]}</Text>
        <Text style={styles.textoDados}>Sexo: {this.state.resultados[2]}</Text>
        <Text style={styles.textoDados}>Escolaridade: {this.state.resultados[3]}</Text>
        <Text style={styles.textoDados}>Limite: R$ {this.state.resultados[4]}</Text>
        <Text style={styles.textoDados}>Brasileiro: {this.state.resultados[5]}</Text>
      </View>
    )
  }
}
export default App;