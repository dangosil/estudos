// const btnCalc = document.querySelector('#calcular');
// const numero1 = document.getElementById('number1');
// const numero2 = document.getElementById('number2');
// const operacao = document.getElementById('operacao');
// const resultado = document.getElementById('resultado');

// btnCalc.addEventListener('click', mostrarNumeros)

// function mostrarNumeros() {
//     if(numero1.value == '' || numero2.value == ''){
//         alert("Digite os dois numeros")
//         return;
//     }
//     const number1AsNumber = Number(numero1.value);
//     const number2AsNumber = Number(numero2.value);
//     if (operacao.value == "+") {
//         resultado.value = number1AsNumber + number2AsNumber
//     } else if (operacao.value == "-") {
//         resultado.value = number1AsNumber - number2AsNumber
//     } else if (operacao.value == "/") {
//         resultado.value = number1AsNumber / number2AsNumber
//     } else if (operacao.value == "*") {
//         resultado.value = number1AsNumber * number2AsNumber
//     }else{
//         alert("Operação inválida")
//     }
// }

// // 2 == "2" true
// // 2 === "2" false

let n1 = document.getElementById("number1");
let n2 = document.getElementById("number2");
let op = document.getElementById("operacao");
let result = document.getElementById("resultado");
let calc = document.getElementById("calcular");

calc.addEventListener("click", mostrarNumeros);

function mostrarNumeros() {
    if(n1.value == '' || n2.value == '') {
        alert("Digite dois números");
        return;
    }

    let n1Number = Number(n1.value);
    let n2Number = Number(n2.value);

    if(op.value == "+") {
        result.value = n1Number + n2Number;
    } else if(op.value == "-") {
        result.value = n1Number - n2Number;
    } else if(op.value == "/") {
        result.value = n1Number / n2Number;
    } else if(op.value == "*") {
        result.value = n1Number * n2Number;
    } else{
        alert("Operação inválida");
    }
}