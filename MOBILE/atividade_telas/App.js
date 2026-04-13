import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

// Importação das telas
import HomeScreen from './screens/Homescreen';
import AboutScreen from './screens/Aboutscreen';
import ServicesScreen from './screens/Servicesscreen';
import ContactScreen from './screens/ContactScreen';
import FinalScreen from './screens/FinalScreen';

// Criando o Stack
const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator
        initialRouteName="Home"
        screenOptions={{
          headerTitleAlign: 'center',
          headerStyle: { backgroundColor: '#2196F3' },
          headerTintColor: '#fff',
        }}
      >
        <Stack.Screen
          name="Home"
          component={HomeScreen}
          options={{ title: 'Início' }}
        />

        <Stack.Screen
          name="About"
          component={AboutScreen}
          options={{ title: 'Sobre' }}
        />

        <Stack.Screen
          name="Services"
          component={ServicesScreen}
          options={{ title: 'Serviços' }}
        />

        <Stack.Screen
          name="Contact"
          component={ContactScreen}
          options={{ title: 'Contato' }}
        />

        <Stack.Screen
          name="Final"
          component={FinalScreen}
          options={{ title: 'Final' }}
        />
      </Stack.Navigator>
    </NavigationContainer>
  );
}