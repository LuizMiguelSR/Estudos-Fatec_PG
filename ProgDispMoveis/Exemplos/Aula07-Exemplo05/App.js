import React, { Component } from 'react';
import { View, StyleSheet, Text} from 'react-native';
 
import {Picker} from '@react-native-picker/picker';
 
export default class App extends Component {
 render(){
  return (
    <View style={styles.container}>
      <Text style={styles.logo}>Menu Pizza</Text>
 
      <Picker>
        <Picker.Item key={1} value={1} label="Calabresa" />
        <Picker.Item key={2} value={2} label="Mussarela" />
        <Picker.Item key={3} value={3} label="Portuguesa" />
      </Picker>
 
    </View>
   );
 }
}
 
const styles = StyleSheet.create({
  container:{
    flex:1,
    marginTop: 20,
  },
  logo:{
    textAlign: 'center',
    fontSize: 28,
    fontWeight: 'bold'
  },
  pizzas:{
    marginTop: 15,
    fontSize: 25,
    textAlign: 'center'
  }
});

