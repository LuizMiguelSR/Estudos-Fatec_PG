import React, {Component} from 'react';
import {View, Text, StyleSheet} from 'react-native';
import {styles} from './styles'
 
class Pessoa extends Component{
    render(){
      return(
        <View style={styles.areaPessoa}>
          <Text style={styles.textoPessoa}> Nome: {this.props.data.nome} </Text>
          <Text style={styles.textoPessoa}> Idade: {this.props.data.idade} </Text>
          <Text style={styles.textoPessoa}> E-mail: {this.props.data.email} </Text>
        </View>
      );
    }
  }
 
export default Pessoa;
