function alcoolValeAPena(alcool, gasolina) {
  return alcool <= 0.7 * gasolina;
}
function estadosVantajosos(estados) {
  let resposta = [];

  for (let i = 0; i < estados.length; i++) {
    if (alcoolValeAPena(estados[i].alcool, estados[i].gasolina)) {
      resposta.push(estados[i].sigla);
    }
  }
  return resposta;
}

// Teste
let dados = [
  { sigla: "SP", alcool: 4.50, gasolina: 6.00 },
  { sigla: "RJ", alcool: 5.50, gasolina: 6.00 },
  { sigla: "MG", alcool: 4.00, gasolina: 6.00 }
];
console.log(estadosVantajosos(dados));