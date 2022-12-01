import {StyleSheet} from 'react-native';

const styles = StyleSheet.create({
  container:{
    flex: 1
  },
  box:{
    height: 150,
  },
  textoTittle:{
    fontSize: 50,
    textAlign: 'center',
    color: 'orange',
    margin: 50,
  },
  imagem:{
    resizeMode: 'stretch',
    height: 120,
    width: 120,
    margin: 10,
    borderRadius: 5,
  },
  texto:{
    fontSize: 13,
    textAlign: 'center',
    margin: 10,
    color: 'black',
  },
  box0:{
    alignItems: 'center',
    height: 250,
    width: 395,
    margin: 10,
    borderColor: 'black',
  },
  box1:{
    alignItems: 'center',
    backgroundColor: '#eaeaea',
    height: 250,
    width: 200,
    marginRight: 10,
    marginLeft: 10,
  },
})
export {styles};