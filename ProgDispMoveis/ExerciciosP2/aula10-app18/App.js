import React, { Component } from 'react';
import { View, StyleSheet, Text, ScrollView, Image, TextInput, Button } from 'react-native';

import moment from 'moment'; 
import api from './src/services/api';
 
class App extends Component {
 
  constructor(props){
    super(props);
    this.state = {
      buscas: [],
      user: ''
    };
  }

  buscarGithub = () => {
    api.get(`${this.state.user}`)
    .then(response => {
      this.setState({ buscas: response.data})
    })
  }
 
  render() {
    let date = moment(new Date(this.state.buscas.created_at)).format('DD/MM/YYYY')
    return(
      <ScrollView style={styles.container} >
          <Text style={styles.titulo}>Perfil dos Devs</Text>
          <View style={styles.line}/>

          <View style={styles.container2}>
            <Image source={{uri: (this.state.buscas.avatar_url) }} style={styles.imagem} />
          </View>

          <TextInput style={styles.input} placeholder="Digite seu Login no GitHub" onChangeText={user => {this.setState({ user });}} />

          <Button color="#30363d" borderColor='#c9d1d9' title="Buscar" onPress={this.buscarGithub} />
          
          <Text style={styles.descricao}>Id: {this.state.buscas.id}</Text>
          <Text style={styles.descricao}>Nome: {this.state.buscas.name}</Text>
          <Text style={styles.descricao}>Repositórios: {this.state.buscas.public_repos}</Text>
          <Text style={styles.descricao}>Criado em: {date}</Text>
          <Text style={styles.descricao}>Seguidores: {this.state.buscas.followers}</Text>
          <Text style={styles.descricao}>Seguindo: {this.state.buscas.following}</Text>
      </ScrollView>
    )
  }
}
 
const styles = StyleSheet.create({
  titulo:{
    fontSize: 18,
    padding: 15,
    textAlign: 'center',
    color: '#c9d1d9',
    fontWeight: 'bold'
  },
  line:{
    borderBottomColor: '#c9d1d9',
    borderBottomWidth: StyleSheet.hairlineWidth,
    marginBottom: 20
  },
  container:{
    flex: 1,
    padding: 20,
    backgroundColor: '#0d1117',
    color: '#c9d1d9'
  },
  container2:{
    justifyContent: 'center',
    alignItems: 'center',
  },
  descricao:{
    fontSize: 12,
    padding: 15,
    color: '#c9d1d9'
  },
  input:{
    fontSize: 14,
    padding: 15,
    borderColor: 'gray', borderWidth: 1,
    marginBottom: 10,
    marginTop: 10,
    color: '#c9d1d9'
  },
  imagem:{
    width: 150,
    height: 160,
    padding: 10,
    borderRadius: 80
  }
});
 
export default App;