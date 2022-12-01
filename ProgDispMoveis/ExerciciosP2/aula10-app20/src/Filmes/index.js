import React, {Component} from 'react';
import {View, Text, StyleSheet, Image, TouchableOpacity, Modal, Pressable} from 'react-native';
 
class Filmes extends Component{

  state = {
    modalVisible: false
  };

  setModalVisible = (visible) => {
    this.setState({ modalVisible: visible });
  }
  
  render(){
    const { modalVisible } = this.state;
    const {nome, foto, sinopse} = this.props.data;
    return(
      <View>
        <View>
          <Text style={styles.titulo}>{nome}</Text>

            <TouchableOpacity onPress={() => this.setModalVisible(true)}>
              <Text style={styles.btnText}>Acessar Sinopse</Text>
            </TouchableOpacity>
          <View style={styles.container2}>
            <Image source={{uri: foto }} style={styles.imagem} />
          </View>
        </View>
        <Modal
          animationType="slide"
          visible={modalVisible}
          onRequestClose={() => {
            Alert.alert("Modal has been closed.");
            this.setModalVisible(!modalVisible);
          }}
        >
          <View style={styles.container}>
            <Text style={styles.titulo2}>NerdolaFlix</Text>
            <View style={styles.line}/>
            <Text style={styles.titulo}>{nome} - Sinopse</Text>
            <View style={styles.container3}>
              <Text style={styles.sinopse}>{sinopse}</Text>
            </View>
            <View style={styles.container2}>
              <Pressable
                  style={[styles.button, styles.buttonClose]}
                  onPress={() => this.setModalVisible(!modalVisible)}
              >
                  <Text style={styles.textStyle}>Voltar</Text>
              </Pressable>
            </View>
          </View>
        </Modal>
      </View>
    );
  }
}
 
const styles = StyleSheet.create({
  titulo:{
    fontSize: 18,
    paddingTop: 15,
    textAlign: 'center',
    color: '#ffffff',
    fontWeight: 'bold'
  },
  btnText:{
    fontSize: 14,
    padding: 15,
    textAlign: 'center',
    color: '#f40612'
  },
  container2:{
    justifyContent: 'center',
    alignItems: 'center',
  },
  imagem:{
    width: 250,
    height: 160,
    borderRadius: 12,
    marginBottom: 10
  },
  container:{
    flex:1,
    padding: 20,
    backgroundColor: '#0d1117',
    color: '#c9d1d9'
  },
  container3:{
    height: 340,
    marginTop: 10,
    padding: 20,
    backgroundColor: '#fff',
    borderRadius: 12
  },
  titulo2:{
    fontSize: 24,
    padding: 15,
    textAlign: 'center',
    color: '#f40612',
    fontWeight: 'bold'
  },
  sinopse:{
    fontSize: 14,
    padding: 5,
    textAlign: 'center',
    color: 'black'
  },
  line:{
    borderBottomColor: '#ffffff',
    borderBottomWidth: StyleSheet.hairlineWidth,
    marginBottom: 20
  },
  button: {
    marginTop: 10,
    width: 100,
    borderRadius: 20,
    padding: 10,
    elevation: 2,
  },
  buttonClose: {
    backgroundColor: "#f40612"
  },
  textStyle: {
    color: "white",
    fontWeight: "bold",
    textAlign: "center"
  },
});
 
export default Filmes;