function calcularDistancias(vetor) {
  let resultado = [];

  for (let i = 0; i < vetor.length; i++) {
    if (vetor[i] === 0) {
      resultado.push(0);
    } else {
      let distancia = 1000;

      for (let j = 0; j < vetor.length; j++) {
        if (vetor[j] === 0) {
          let d = Math.abs(i - j);
          if (d < distancia) {
            distancia = d;
          }
        }
      }

      if (distancia > 9) distancia = 9;
     resultado.push(distancia);
    }
  }
  return resultado;
}
console.log(calcularDistancias([-1, -1, 0, -1, 0]));