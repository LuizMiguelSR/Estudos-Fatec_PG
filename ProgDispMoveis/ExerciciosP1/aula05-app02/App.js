import React from 'react';
import { View, Text, StyleSheet, Pressable} from 'react-native';
 
export default class App extends React.Component{
  constructor(props) {
        super(props)
        this.state = { count: 0 }
    }
    adicionar (){
        this.setState({
            count: this.state.count+1
        })
    }
    remover (){
        this.setState({
            count: this.state.count-1
        })
    }
  render(){
    return(
      <View style={styles.container}>
        <Text style={styles.texto}>Contador de Pessoas</Text>
        <Text style={styles.textoCont}> {this.state.count} </Text>
        <View style={styles.areaBotao}>
          <Pressable style={styles.botao1} onPress={() => this.adicionar()}>
            <Text style={styles.textoBotao}>+</Text>
          </Pressable>
          <Pressable style={styles.botao2} onPress={() => this.remover()}>
            <Text style={styles.textoBotao}>-</Text>
          </Pressable>
        </View>
      </View>
    );
  }
}
 
const styles = StyleSheet.create({
  container:{
    flex: 1,
    marginTop: 60,
  },
  areaBotao:{
    alignItems: 'center',
  },
  texto:{
    textAlign: 'center',
    fontSize: 25,
    color: '#FFB51A',
  },
  textoCont:{
    textAlign: 'center',
    fontSize: 55,
    color: '#E61802',
    borderWidth: 2,
    margin: 50,
  },
  botao1:{
    width: 80,
    height: 40,
    margin: 10,
    backgroundColor: '#0CD846'
  },
  botao2:{
    width: 80,
    height: 40,
    margin: 10,
    backgroundColor: '#FF5C4A',
  },
  textoBotao:{
    textAlign: 'center',
    textAlignVertical: 'center',
    height: 30,
    fontSize: 28,
  }
});