import { View, Text, TouchableOpacity, StyleSheet } from 'react-native';

export default function HomeScreen({ navigation }) {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Tela Inicial</Text>
      <Text style={styles.text}>
        Bem-vindo ao aplicativo! Clique abaixo para continuar.
      </Text>

      <TouchableOpacity
        style={styles.button}
        onPress={() => navigation.navigate('About')}
      >
        <Text style={styles.buttonText}>Ir para Sobre</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#E3F2FD',
    padding: 20,
  },
  title: {
    fontSize: 26,
    fontWeight: 'bold',
  },
  text: {
    marginVertical: 15,
    textAlign: 'center',
  },
  button: {
    backgroundColor: '#2196F3',
    padding: 12,
    borderRadius: 8,
  },
  buttonText: {
    color: '#fff',
    fontWeight: 'bold',
  },
});