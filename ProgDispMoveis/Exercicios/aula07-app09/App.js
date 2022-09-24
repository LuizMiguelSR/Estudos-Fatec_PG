import React, { Component } from 'react';
import { View, ScrollView, Text } from 'react-native';
import {styles} from './Styles';
 
class App extends Component{
  render(){
    return(
      <View style={styles.container}>
        <View style={styles.box}>
          <Text style={styles.textoTittle}>Vagas</Text>
        </View>
        <View style={styles.box0}>
          <ScrollView showsVerticalScrollIndicator={false}>
            <View style={styles.box1}>
              <Text style={styles.textoTittle2}>Desenvolvedor BackEnd</Text>
              <Text style={styles.textoTittle3}>Salário: R$ 3.000,00</Text>
              <Text style={styles.textoTittle4}>Descrição: Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
              <Text style={styles.  textoTittle4}>Contato: Velit quis aute enim commodo. </Text>
            </View>
            <View style={styles.box1}>
              <Text style={styles.textoTittle2}>Engenheiro de Dados</Text>
              <Text style={styles.textoTittle3}>Salário: R$ 5.000,00</Text>
              <Text style={styles.textoTittle4}>Descrição: Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
              <Text style={styles.  textoTittle4}>Contato: Velit quis aute enim commodo. </Text>
            </View>
            <View style={styles.box1}>
              <Text style={styles.textoTittle2}>Desenvolvedor FrontEnd</Text>
              <Text style={styles.textoTittle3}>Salário: R$ 4.000,00</Text>
              <Text style={styles.textoTittle4}>Descrição: Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
              <Text style={styles.textoTittle4}>Contato: Velit quis aute enim commodo. </Text>
            </View>
            <View style={styles.box1}>
              <Text style={styles.textoTittle2}>Desenvolvedor Backend</Text>
              <Text style={styles.textoTittle3}>Salário: R$ 3.000,00</Text>
              <Text style={styles.textoTittle4}>Descrição: Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
              <Text style={styles.  textoTittle4}>Contato: Velit quis aute enim commodo. </Text>
            </View>
            <View style={styles.box1}>
              <Text style={styles.textoTittle2}>Desenvolvedor Backend</Text>
              <Text style={styles.textoTittle3}>Salário: R$ 3.000,00</Text>
              <Text style={styles.textoTittle4}>Descrição: Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
              <Text style={styles.  textoTittle4}>Contato: Velit quis aute enim commodo. </Text>
            </View>
            <View style={styles.box1}>
              <Text style={styles.textoTittle2}>Desenvolvedor Backend</Text>
              <Text style={styles.textoTittle3}>Salário: R$ 3.000,00</Text>
              <Text style={styles.textoTittle4}>Descrição: Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
              <Text style={styles.  textoTittle4}>Contato: Velit quis aute enim commodo. </Text>
            </View>
            <View style={styles.box1}>
              <Text style={styles.textoTittle2}>Desenvolvedor Backend</Text>
              <Text style={styles.textoTittle3}>Salário: R$ 3.000,00</Text>
              <Text style={styles.textoTittle4}>Descrição: Velit quis aute enim commodo. Magna fugiat exercitation cupidatat incididunt nisi anim quis laborum labore velit.</Text>
              <Text style={styles.  textoTittle4}>Contato: Velit quis aute enim commodo. </Text>
            </View>
          </ScrollView>
        </View>
      </View>
    )
  }
}
export default App;