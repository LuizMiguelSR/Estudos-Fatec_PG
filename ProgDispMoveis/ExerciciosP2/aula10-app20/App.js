import React, { Component } from 'react';
import { Text, View, StyleSheet, FlatList, ActivityIndicator } from 'react-native';
 
import api from './src/services/api';
import Buscas from './src/Filmes/index';
 
class App extends Component {
 
  constructor(props){
    super(props);
    this.state = {
      buscas: [],
      loading: true,
      user: ''
    };
  }

  async componentDidMount(){
    const response = await api.get(`/r-api/?api=filmes`);
    this.setState({
      buscas: response.data,
      loading: false
    });
  }
 
  render() {
 
    if(this.state.loading){
      return(
        <View style={{alignItems: 'center', justifyContent: 'center', flex:1}}>
          <ActivityIndicator color="#09A6FF" size={40}/>
        </View>
      )
    }else{
      return(
        <View style={styles.container}>
          <Text style={styles.titulo}>NerdolaFlix</Text>
          <View style={styles.line}/>
          <FlatList
          data={this.state.buscas}
          keyExtractor={item => item.id.toString() }
          renderItem={ ({item}) => <Buscas data={item} /> }
          />
  
        </View>
      )
    }
  }
}
 
const styles = StyleSheet.create({
  container:{
    flex:1,
    padding: 20,
    backgroundColor: '#0d1117',
    color: '#c9d1d9'
  },
  titulo:{
    fontSize: 24,
    padding: 15,
    textAlign: 'center',
    color: '#f40612',
    fontWeight: 'bold'
  },
  line:{
    borderBottomColor: '#ffffff',
    borderBottomWidth: StyleSheet.hairlineWidth,
    marginBottom: 20
  },
});
 
export default App;