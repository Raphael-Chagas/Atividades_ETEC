import { View, Text, TouchableOpacity, StyleSheet } from 'react-native';

export default function ContactScreen({ navigation }) {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Contato</Text>
      <Text style={styles.text}>
        Entre em contato conosco para mais informações.
      </Text>

      <TouchableOpacity
        style={styles.button}
        onPress={() => navigation.navigate('Final')}
      >
        <Text style={styles.buttonText}>Ir para Final</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#FCE4EC',
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
    backgroundColor: '#E91E63',
    padding: 12,
    borderRadius: 8,
  },
  buttonText: {
    color: '#fff',
    fontWeight: 'bold',
  },
});