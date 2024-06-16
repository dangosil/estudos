let pontuacoes = [5, 3, 10, 11, 2, 3];
let somaTotal = 0;


for(let i = 0; i < pontuacoes.length; i++) {

    let somaAtual = pontuacoes[i] + pontuacoes[i + 1] + pontuacoes[i + 2];

    if(somaAtual > somaTotal) {
        somaTotal = somaAtual;
    }
   
}

console.log("A soma das três maiores pontuações consecutivas é", somaTotal);