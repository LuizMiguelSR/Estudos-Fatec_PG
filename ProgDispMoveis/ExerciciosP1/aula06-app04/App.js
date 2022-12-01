import React from 'react';
import { View, Text, StyleSheet, TextInput, Button, Image} from 'react-native';

export default class App extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      input1: 0,
      input2: 0,
      resultado: "",
      resultado1: 0,
    };
    
    this.calcular = this.calcular.bind(this);
  }
 
  calcular(){
    resultado1 = this.state.input1 / this.state.input2;
    if(this.state.input1 == this.state.input2){
      this.setState({resultado: "Tanto faz!"});
    } else if(resultado1 < 0.7) {
      this.setState({resultado: "Alcool"});
    } else {
      this.setState({resultado: "Gasolina"});
    }

  }
 
  render(){
    return(
      <View style={styles.container}>
        <Text style={styles.texto}>Alcool ou Gasolina </Text>

        <View style={styles.imagemPosto}>
          <Image source={require('./bombaPosto.jpg')} style={styles.imagem} />
        </View>
      
        <TextInput style={styles.input} placeholder="Preço do Alcool" onChangeText={input1 => {this.setState({ input1 });}} keyboardType="numeric" />

        <TextInput style={styles.input} placeholder="Preço da Gasolina" onChangeText={input2 => {this.setState({ input2 });}} keyboardType="numeric" />

        <View style={styles.botao}>
          <Button title="Verificar" onPress={this.calcular} />
        </View>

        <Text style={styles.texto1}> O melhor é {this.state.resultado} </Text>
      </View>
    );
  }
}
 
const styles = StyleSheet.create({
  container:{
    flex: 1,
    marginTop: 30,
    padding: 20,
  },
  imagemPosto: {
    alignItems: 'center',
    marginTop: 20,
  },
  botao: {
    alignItems: 'center',
    marginTop: 20,
    marginBottom: 20,
  },
  imagem: {
    width: 200,
    height: 200,
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
  },
  texto1:{
    textAlign: 'center',
    fontSize: 25,
    color: '#0CD846',
  }
});