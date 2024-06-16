/*
let tempos = [9, 8, 4, 10];
let menorTempo = tempos[0];

for (let i = 0; i < tempos.length; i++) {
    console.log(tempos[i]);

    if(tempos[i] < menorTempo) {
        menorTempo = tempos[i];
    }
}

console.log("O menor tempo é ", menorTempo);

*/

let menorTempo = Infinity;

for(let i = 0; i < 3; i++) {
    let tempos = prompt("Digite o tempo:");

    if(Number(tempos) < menorTempo) {
        menorTempo = tempos;
    }
}

console.log("O menor tempo é", menorTempo, "minutos.");