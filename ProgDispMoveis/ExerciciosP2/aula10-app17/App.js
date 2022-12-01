import React, { Component } from 'react';
import { View, StyleSheet, Text, ScrollView, TextInput, Button, Image } from 'react-native';
 
import api from './src/services/api';
 
class App extends Component {
 
  constructor(props){
    super(props);
    this.state = {
      buscas: [],
      cep: ''
    };
  }

  buscarCep = () => {
    api.get(`${this.state.cep}/json`)
    .then(response => {
      this.setState({ buscas: response.data})
    })
  }
 
  render() {
    return(
      <ScrollView style={styles.container} >
          <Text style={styles.titulo}>CEP X Endereço</Text>
          <View style={styles.line}/>

          <View style={styles.imagemEntrega}>
            <Image source={require('./entrega.png')} style={styles.imagem} />
          </View>

          <TextInput style={styles.input} placeholder="Digite o CEP" onChangeText={cep => {this.setState({ cep });}} keyboardType="numeric"/>

          <Button color="#0f8abe" borderColor='#c9d1d9' title="Buscar" onPress={this.buscarCep} />
          
          <Text style={styles.descricao}>CEP: {this.state.buscas.cep}</Text>
          <Text style={styles.descricao}>Logradouro: {this.state.buscas.logradouro}</Text>
          <Text style={styles.descricao}>Bairro: {this.state.buscas.bairro}</Text>
          <Text style={styles.descricao}>Cidade: {this.state.buscas.localidade}</Text>
          <Text style={styles.descricao}>Estado: {this.state.buscas.uf}</Text>
      </ScrollView>
    )
  }
}
 
const styles = StyleSheet.create({
  titulo:{
    fontSize: 18,
    padding: 15,
    textAlign: 'center',
    color: '#19416b'
  },
  line:{
    borderBottomColor: '#19416b',
    borderBottomWidth: StyleSheet.hairlineWidth,
  },
  container:{
    flex: 1,
    padding: 20,
    backgroundColor: '#ffd400'
  },
  descricao:{
    fontSize: 12,
    padding: 15,
    color: '#19416b'
  },
  imagem: {
    width: 200,
    height: 200
  },
  imagemEntrega: {
    alignItems: 'center',
  },
  input:{
    fontSize: 14,
    padding: 15,
    borderColor: '#19416b', borderWidth: 1,
    marginBottom: 10,
    color: '#19416b'
  }
});
 
export default App;