import React, { Component } from 'react';
import { View, StyleSheet, FlatList, Text } from 'react-native';
 
class App extends Component{
 
  constructor(props) {
    super(props);
    this.state = {
      feed:[
        {id: 1, nome: 'Joseffe', idade: 32, email: 'joseffe@gmail.com'},
        {id: 2, nome: 'João', idade: 17, email: 'joao@gmail.com'},
        {id: 3, nome: 'Maria', idade: 22, email: 'maria@gmail.com'},
        {id: 4, nome: 'Joaquim', idade: 42, email: 'joaquim@gmail.com'},
        {id: 5, nome: 'Paulo', idade: 36, email: 'paulo@gmail.com'},
      ]
    }
  }
 
  render(){
    return(
      <View style={styles.container}>
        <FlatList 
        data={this.state.feed}
        keyExtractor={(item) => item.id}
        renderItem={ ({item}) => <Pessoa data={item}/>}
        />
      </View>
    )
  }
}
 
const styles = StyleSheet.create({
  container:{
    flex: 1
  },
})
 
export default App;
 
class Pessoa extends Component{
  render(){
    return(
      <View>
        <Text> Nome: {this.props.data.nome} </Text>
        <Text> Idade: {this.props.data.idade} </Text>
        <Text> E-mail: {this.props.data.email} </Text>
      </View>
    );
  }
}

