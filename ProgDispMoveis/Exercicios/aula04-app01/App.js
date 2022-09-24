import React from 'react';
import { View, Text, Image } from 'react-native';
import {styles} from './Styles';

class App extends React.Component {
  render(){
    return (
      <View style={styles.container}>

        <View style={styles.viewMode}>
          <Image source={require('./minhaFoto.jpg')} style={styles.imagem} />
        </View>

        <View style={styles.dados}>
          <Text style={styles.textTittle}>Dados Pessoais</Text>
          <Text style={styles.text}>Luiz Miguel Santos Rodrigues</Text>
        </View>

        <View style={styles.dados}>
          <Text style={styles.textTittle}>Formação</Text>
          <Text style={styles.text}>
            Faculdade de Tecnologia de Praia Grande (Fatec)
            Graduação Tecnológica, Análise e Desenvolvimento de SistemasGraduação Tecnológica, Análise e Desenvolvimento de Sistemas
            2020 - 2023
          </Text>
        </View>

        <View style={styles.dados}>
          <Text style={styles.textTittle}>Experiência</Text>
          <Text style={styles.text}>
            Atualmente participando no desenvolvimento do novo site da Fatec Praia Grande, sou monitor da disciplina de Laboratório de Engenharia de Software.
          </Text>
        </View>

        <View style={styles.dados}>
          <Text style={styles.textTittle}>Projetos</Text>
          <Text style={styles.text}>
            Participação da criação e desenvolvimento, de um site integrado aos setores institucionais da Fatec Praia Grande.
          </Text>
        </View>
      </View>
    );
  }
}
export default App;
