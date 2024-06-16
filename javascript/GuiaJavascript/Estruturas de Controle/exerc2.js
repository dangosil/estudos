let diasSemanaTexto = prompt("Qual o dia da semana?");

switch(diasSemanaTexto) {
    case "Domingo":
        console.log(1);
        break;
    case "Segunda":
        console.log(2);
        break;
    case "Terça":
        console.log(3);
        break;
    case "Quarta":
        console.log(4);
        break;
    case "Quinta":
        console.log(5);
        break;
    case "Sexta":
        console.log(6);
        break;
    case "Sábado":
        console.log(7);
        break;
    default:
        console.log("Dia inválido");
}