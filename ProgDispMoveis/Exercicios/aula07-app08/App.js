import React, { Component } from 'react';
import { View, ScrollView, Text, Image } from 'react-native';
import {styles} from './Styles';
 
class App extends Component{
  render(){
    return(
      <View style={styles.container}>
        <View style={styles.box}>
          <Text style={styles.textoTittle}>Anúncios</Text>
        </View>
        <View style={styles.box0}>
          <ScrollView horizontal={true} showsHorizontalScrollIndicator={false}>
            <View style={styles.box1}>
              <Image source={require('./relogio.jpg')} style={styles.imagem} />
              <Text style={styles.texto}>Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
            </View>
            <View style={styles.box1}>
              <Image source={require('./relogio.jpg')} style={styles.imagem} />
              <Text style={styles.texto}>Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
            </View>
            <View style={styles.box1}>
              <Image source={require('./relogio.jpg')} style={styles.imagem} />
              <Text style={styles.texto}>Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
            </View>
            <View style={styles.box1}>
              <Image source={require('./relogio.jpg')} style={styles.imagem} />
              <Text style={styles.texto}>Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
            </View>
            <View style={styles.box1}>
              <Image source={require('./relogio.jpg')} style={styles.imagem} />
              <Text style={styles.texto}>Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
            </View>
            <View style={styles.box1}>
              <Image source={require('./relogio.jpg')} style={styles.imagem} />
              <Text style={styles.texto}>Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
            </View>
            <View style={styles.box1}>
              <Image source={require('./relogio.jpg')} style={styles.imagem} />
              <Text style={styles.texto}>Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
            </View>
            <View style={styles.box1}>
              <Image source={require('./relogio.jpg')} style={styles.imagem} />
              <Text style={styles.texto}>Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
            </View>
          </ScrollView>
        </View>
      </View>
    )
  }
}
export default App;