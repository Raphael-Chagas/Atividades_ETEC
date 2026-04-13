import { View, Text, TouchableOpacity, StyleSheet } from 'react-native';

export default function FinalScreen({ navigation }) {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Final</Text>
      <Text style={styles.text}>
        Você chegou ao final do aplicativo!
      </Text>

      <TouchableOpacity
        style={styles.button}
        onPress={() => navigation.navigate('Home')}
      >
        <Text style={styles.buttonText}>Voltar ao Início</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#EDE7F6',
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
    backgroundColor: '#673AB7',
    padding: 12,
    borderRadius: 8,
  },
  buttonText: {
    color: '#fff',
    fontWeight: 'bold',
  },
});