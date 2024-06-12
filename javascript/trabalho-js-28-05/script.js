// DANIEL GOMES, CAIO BRAGA, JOÃO LUIZ, EURICO

// Função que recebe um número e retorna true se for par. Caso contrário, retorne false.

function ehPar(numero) {
    if(numero % 2 == 0) {
        return true;
    } else {
        return false;
    }
}

// Função que recebe um número e verifique se ele é primo. Caso o número seja primo, retorne true. Senão, retorne false.
function ehPrimo(numero) {
    for(let i = numero-1; i >=2 ; i--){
        if(numero % i == 0){
            return false;
        }
    }
    return true;
}

// Função que recebe um vetor e retorna a soma de todos os elementos.
function somaVetor(vetor) {
    let soma = 0;
    for(let contador = 0; contador < vetor.length; contador++){
        soma = soma + vetor[contador];
    }
    return soma;
}

// Função que recebe um vetor e retorna o maior elemento.
function getMaior(arr) {
    let maior = arr[0];
    for(let contador = 0; contador < arr.length; contador++){
        if(maior < arr[contador]) {
        maior = arr[contador];
    }
    }
    return maior;
    
}

// Função que recebe um número e imprime fizz se o número for divisível por 3, se for divisível por 5 imprime buzz, se for divisível por 3 e 5 imprime fizzbuzz, caso contrário imprime o próprio número. 
function fizzBuzz(numero) {
    if (numero % 5 == 0 && numero % 3 == 0){
        return "fizzbuzz";
    } else if(numero % 3 == 0){
        return "fizz";
    } else if(numero % 5 == 0){
        return "buzz";
    }   else{
        return numero;
    }
}

// Função que recebe um vetor e verifica se ele é palíndromo. Caso seja, retorne true. Senão, retorne false. Um palíndromo é uma palavra, frase ou número que é igual quando lido de trás para frente.
function ehPalindromo(vetor) {
    for(let i = 0; i < vetor.length / 2; i++) {
        if(vetor[i] !== vetor[vetor.length - 1 - i]) {
            return false;
        } 
    }
    return true;
}