import React from "react";
import { StyleSheet, Text, TextInput, View, Button, Alert, Image } from "react-native";

export default class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      altura: 0,
      massa: 0,
      resultado: 0,
      resultTexto: "Digite os valores corretamente"
    };
    this.calcular = this.calcular.bind(this);
  }

  calcular() {
    this.state.resultado =
      this.state.massa / (this.state.altura * this.state.altura);

    if (this.state.massa < 10 || this.state.massa > 200) {
      console.log(this.state.massa);
      Alert.alert("Erro!", "Verifique valor do peso.");
      this.state.resultTexto = "Verifique valor do peso.";
      this.state.resultado = 0;
    } else if (this.state.altura < 1 || this.altura > 3) {
      Alert.alert("Erro!", "Verifique valor da altura.");
      this.state.resultTexto = "Verifique valor da altura.";
      this.state.resultado = 0;
    } else if (isNaN(this.state.altura)) {
      Alert.alert("Erro!", "Altura deve ser separada por '.' \nEx: 1.56");
      this.state.resultTexto = "Verifique valor da altura.";
      this.state.resultado = 0;
    } else if (this.state.resultado < 16) {
      this.state.resultTexto = "Muito abaixo do peso!";
    } else if (this.state.resultado < 17) {
      this.state.resultTexto = "Moderadamente abaixo do peso!";
    } else if (this.state.resultado < 18.5) {
      this.state.resultTexto = "Abaixo do peso!";
    } else if (this.state.resultado < 25) {
      this.state.resultTexto = "Saudável!";
    } else if (this.state.resultado < 30) {
      this.state.resultTexto = "Sobrepeso!";
    } else if (this.state.resultado < 35) {
      this.state.resultTexto = "Obesidade Grau 1°!";
    } else if (this.state.resultado < 40) {
      this.state.resultTexto = "Obesidade Grau 2°!";
    } else {
      this.setState.resultTexto = "Obesidade Grau 3°";
    }
    this.setState(this.state);
  }
  
  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.textoTittle}>Cálculo do IMC</Text>
        <View style={styles.imagemIMC}>
          <Image source={require('./imc.jpg')} style={styles.imagem} />
        </View>
        <View style={styles.entrada}>
          <TextInput
            autoCapitalize="none"
            placeholder="Informe seu peso:"
            keyboardType="numeric"
            style={styles.input}
            onChangeText={massa => {
              this.setState({ massa });
            }}
          />

          <TextInput
            autoCapitalize="none"
            placeholder="Informe sua altura:"
            keyboardType="numeric"
            style={styles.input}
            onChangeText={altura => {
              this.setState({ altura });
            }}
          />
        </View>
        <View style={styles.botao}>
          <Button onPress={this.calcular} title="Calcular" />
        </View>
        <Text style={styles.resultado}>{this.state.resultado.toFixed(2)}</Text>
        <Text style={styles.resultado}>{this.state.resultTexto}</Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    marginTop: 40,
  },
  entrada: {
    justifyContent: "center",
    alignItems: "center"
  },
  textoTittle:{
    fontSize: 30,
    textAlign: "center",
    color: "orange",
  },
  imagemIMC: {
    alignItems: 'center',
    marginTop: 20,
  },
  imagem: {
    width: 300,
    height: 200,
  },
  botao: {
    alignItems: 'center',
    marginTop: 20,
    marginBottom: 20,
  },
  input: {
    height: 50,
    textAlign: "center",
    fontSize: 25,
    marginTop: 10
  },
  resultado: {
    alignSelf: "center",
    color: "black",
    fontSize: 20,
    fontWeight: "bold",
    padding: 0
  }
});
