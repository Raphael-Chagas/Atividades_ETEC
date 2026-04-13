import { View, Text, TouchableOpacity, StyleSheet } from 'react-native';

export default function ServicesScreen({ navigation }) {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Serviços</Text>
      <Text style={styles.text}>
        Aqui estão os serviços oferecidos pelo aplicativo.
      </Text>

      <TouchableOpacity
        style={styles.button}
        onPress={() => navigation.navigate('Contact')}
      >
        <Text style={styles.buttonText}>Ir para Contato</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#FFF3E0',
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
    backgroundColor: '#FF9800',
    padding: 12,
    borderRadius: 8,
  },
  buttonText: {
    color: '#fff',
    fontWeight: 'bold',
  },
});