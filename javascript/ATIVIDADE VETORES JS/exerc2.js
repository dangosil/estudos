/*
let avaliacao = [3, 5, 7, 9];
let maiorAvaliacao = avaliacao[0];

for(i = 0; i < avaliacao.length; i++) {
    console.log(avaliacao[i]);

    if(avaliacao[i] > maiorAvaliacao) {
        maiorAvaliacao = avaliacao[i];
    }
}

console.log("A maior avaliação é ", maiorAvaliacao);

*/

let maiorAvaliacao = 0;

for(let i = 0; i < 4; i++) {
    let avaliacao = prompt("Digite a avaliação:");

    if(Number(avaliacao) > maiorAvaliacao) {
        maiorAvaliacao = avaliacao;
    }
}
console.log("A maior avaliação é ", maiorAvaliacao);