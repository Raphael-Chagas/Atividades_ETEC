import React from 'react';
import { View, Text, Image, StyleSheet, ScrollView } from 'react-native';

export default function App() {

  const personagens = [
    {
      nome: 'Homem-Aranha',
      imagem: 'https://i.imgur.com/1X4Jc3K.png',
    },
    {
      nome: 'Batman',
      imagem: 'https://i.imgur.com/0y0y0y0.png',
    },
    {
      nome: 'Superman',
      imagem: 'https://i.imgur.com/Qr71crq.png',
    },
    {
      nome: 'Capitão América',
      imagem: 'https://i.imgur.com/5cX1G6G.png',
    },
  ];

  return (
    <ScrollView contentContainerStyle={styles.container}>
      {personagens.map((item, index) => (
        <View key={index} style={styles.card}>
          <Image source={{ uri: item.imagem }} style={styles.image} />
          <Text style={styles.name}>{item.nome}</Text>
        </View>
      ))}
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    flexGrow: 1,
    backgroundColor: '#D3D3D3',
    alignItems: 'center',
    paddingTop: 40,
  },
  card: {
    alignItems: 'center',
    marginBottom: 30,
  },
  image: {
    width: 200,
    height: 200,
    resizeMode: 'contain',
  },
  name: {
    fontSize: 20,
    color: 'blue',
    fontWeight: 'bold',
    marginTop: 10,
  },
});