import React, { Component } from 'react';
import { View, StyleSheet, ScrollView } from 'react-native';
 
class App extends Component{
  render(){
    return(
      <View style={styles.container}>
        <ScrollView horizontal={true} showsHorizontalScrollIndicator={false}>
          <View style={styles.box1}></View>
          <View style={styles.box2}></View>
          <View style={styles.box3}></View>
          <View style={styles.box4}></View>
          <View style={styles.box1}></View>
          <View style={styles.box2}></View>
          <View style={styles.box3}></View>
          <View style={styles.box4}></View>
        </ScrollView>
      </View>
    )
  }
}
 
const styles = StyleSheet.create({
  container:{
    flex: 1
  },
  box1:{
    backgroundColor: 'red',
    height: 250,
    width: 100,
  },
  box2:{
    backgroundColor: 'green',
    height: 250,
    width: 100,
  },
  box3:{
    backgroundColor: 'yellow',
    height: 250,
    width: 100,
  },
  box4:{
    backgroundColor: 'blue',
    height: 250,
    width: 100,
  }
})
 
export default App;
