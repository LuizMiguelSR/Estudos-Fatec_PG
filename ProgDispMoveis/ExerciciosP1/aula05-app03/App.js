import React from 'react';
import { View, Text, StyleSheet, TextInput, Button} from 'react-native';
 
export default class App extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      input1: 0,
      input2: 0,
      resultado: 0,
    };
    
    this.calcular = this.calcular.bind(this);
  }
 
  calcular(){
    this.setState({resultado: this.state.input1 * this.state.input2});
  }
 
  render(){
    return(
      <View style={styles.container}>
        <Text style={styles.texto}>Multiplicador de Numeros </Text>
        <TextInput style={styles.input} placeholder="Digite o primeiro número" onChangeText={input1 => {this.setState({ input1 });}} keyboardType="numeric" />
        <TextInput style={styles.input} placeholder="Digite o segundo número" onChangeText={input2 => {this.setState({ input2 });}} keyboardType="numeric" />
        <View style={styles.botao}>
          <Button title="Calcular" onPress={this.calcular} />
        </View>
        <Text style={styles.texto1}> Resultado: {this.state.resultado} </Text>
      </View>
    );
  }
}
 
const styles = StyleSheet.create({
  container:{
    flex: 1,
    marginTop: 40,
  },
  botao:{
    alignItems: 'center',
    margin: 30,
  },
  input:{
    height: 45,
    borderWidth: 1,
    borderColor: '#222',
    margin: 10,
    fontSize: 20,
    padding: 10,
  },
  texto:{
    textAlign: 'center',
    fontSize: 25,
    color: '#FFB51A',
    marginBottom: 30,
  },
  texto1:{
    textAlign: 'center',
    fontSize: 25,
    color: '#0CD846',
  }
});