import React from 'react';
import { View, Text, StyleSheet, Button, Image} from 'react-native';
 
export default class App extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      resultado: 0,
    };
    
    this.calcular = this.calcular.bind(this);
  }
 
  calcular(){
    resultado = Math.floor(Math.random() * 10);
    this.setState({resultado});
  }
 
  render(){
    return(
      <View style={styles.container}>
        <Text style={styles.texto}>Jogo do Nº Aleatório</Text>
        <View style={styles.imagemCharada}>
          <Image source={require('./charada.jpg')} style={styles.imagem} />
        </View>
        <Text style={styles.texto2}>Pense em um número de 0 a 10</Text>
        <Text style={styles.texto1}> {this.state.resultado} </Text>
        <View style={styles.botao}>
          <Button title="DESCOBRIR" onPress={this.calcular} />
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
  imagemCharada: {
    alignItems: 'center',
    marginTop: 20,
  },
  botao: {
    alignItems: 'center',
    marginTop: 20,
    marginBottom: 20,
  },
  texto:{
    textAlign: 'center',
    fontSize: 25,
    color: '#FFB51A',
  },
  texto1:{
    marginTop: 30,
    textAlign: 'center',
    fontSize: 25,
    color: '#0CD846',
  },
  texto2:{
    textAlign: 'center',
    fontSize: 20,
    color: '#2a9d8f',
    marginTop: 30,
  },
  imagem: {
    width: 200,
    height: 200,
  },
});