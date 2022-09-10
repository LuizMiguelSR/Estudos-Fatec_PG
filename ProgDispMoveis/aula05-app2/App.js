import React, { Component } from 'react';
import { View, Text, StyleSheet, TextInput, Button} from 'react-native';
 
class App extends Component{
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
        <View style={styles.container1}>
          <Text style={styles.texto}> Multiplicador de Números </Text>
        </View>

        <View style={styles.container2}>
          <TextInput style={styles.input} placeholder="Digite o primeiro número" onChangeText={input1 => {this.setState({ input1 });}} keyboardType="numeric" />
          <TextInput style={styles.input} placeholder="Digite o segundo número" onChangeText={input2 => {this.setState({ input2 });}} keyboardType="numeric" />
        </View>

        <View style={styles.container3}>
          <Button title="Calcular" onPress={this.calcular} />
        </View>

        <View style={styles.container4}>
          <Text style={styles.texto1}> Resultado: {this.state.resultado} </Text>
        </View>
      </View>
    );
  }
}
 
const styles = StyleSheet.create({
  container:{
    flex: 1,
    marginTop: 40,
  },
  container1:{
    marginBottom: 30,
  },
  container2:{
    marginBottom: 30,
  },
  container3:{
    marginRight: 50,
    marginLeft: 50,
    display: 'block',
    textAlign: 'center',
  },
  container4:{
    marginTop: 30,
    textAlign: 'center',
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
    color: '#FFB51A ',
  },
  texto1:{
    textAlign: 'center',
    fontSize: 25,
    color: '#0CD846',
  }
})
 
export default App;