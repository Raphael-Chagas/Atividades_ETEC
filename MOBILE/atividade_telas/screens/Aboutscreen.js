import { View, Text, TouchableOpacity, StyleSheet } from 'react-native';

export default function AboutScreen({ navigation }) {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Sobre</Text>
      <Text style={styles.text}>
        Este aplicativo demonstra navegação entre telas.
      </Text>

      <TouchableOpacity
        style={styles.button}
        onPress={() => navigation.navigate('Services')}
      >
        <Text style={styles.buttonText}>Ir para Serviços</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#E8F5E9',
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
    backgroundColor: '#4CAF50',
    padding: 12,
    borderRadius: 8,
  },
  buttonText: {
    color: '#fff',
    fontWeight: 'bold',
  },
});