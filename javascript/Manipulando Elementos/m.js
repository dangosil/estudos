
// function mudarTitulo() {
//     let titulo = document.getElementById('titulo');
//     console.log(titulo);
//     titulo.textContent = "Novo título";
//     const intros = document.getElementsByClassName("intro");
//     console.log(intros);
// }

// let botao = document.getElementById("change-button");
// console.log(botao);
// let intros = document.getElementsByClassName("intro");
// console.log(intros);
// let titulo = document.querySelector("h1");
// console.log(titulo);

// function mensagemTexto() {
//     let mensagem = document.getElementById("welcome-div");
//     mensagem.textContent = "Boas vindas";
// }
// mensagemTexto();

// function mudarAtributos() {
//     let titulo = document.getElementById('titulo');
//     titulo.textContent = "Título após a mudança";
//     titulo.setAttribute('class', 'titulo-estilizado');

//     let imagem = document.getElementById('imagem');
//     imagem.setAttribute('src', 'https://picsum.photos/300');
//     imagem.setAttribute('alt', 'Nova Imagem Placeholder');
// }

// function mudarCor() {
//     let novaCor = document.getElementById('change-color');
//     // novaCor.setAttribute('class', 'nova-Cor');
//     novaCor.style.backgroundColor = 'green';
// }

// function mudarEstilo() {
//     let titulo = document.getElementById('titulo');
//     titulo.style.color = 'blue';
//     titulo.style.backgroundColor = 'black';
//     titulo.style.padding = '10px';
//     titulo.style.borderRadius = '5px';
//     titulo.style.textAlign = 'center';
// }

// function removerEstilo() {
//     let titulo = document.getElementById('titulo');
//     titulo.style.color = '';
//     titulo.style.backgroundColor = ''; 
//     titulo.style.padding = ''; 
//     titulo.style.borderRadius = '';
//     titulo.style.textAlign = ''; 
// }

// function removerEstilo() {
//     let titulo = document.getElementById('titulo');
//     titulo.removeAttribute('style');
// }

// function aplicarCor() {
//     let corSelecionada = document.getElementById('corSelecionada').value;
//     let welcomeDiv = document.getElementById('welcome-div');
//     welcomeDiv.style.backgroundColor = corSelecionada;
// }

// let contador = 0;
// function addItem() {
//     let novoItem = document.createElement('p');
//     novoItem.textContent = 'Item ' + (++contador);
//     document.getElementById('lista').appendChild(novoItem);
// }
// function removerUltimoItem() {
//     let lista = document.getElementById('lista');
//     if (lista.lastChild.nodeName === 'P') {
//         lista.removeChild(lista.lastChild);
//         --contador;
//     }
// }


// let contador = 0;
// function addItens() {
//     let input = document.getElementById("new-item").value;
//     let ul = document.getElementById("lista");
//     let li = document.createElement("li");
//     li.textContent = input;
//     ul.appendChild(li);

//     let remover = document.createElement("button");
//     remover.textContent = "Remover";
//     remover.addEventListener("click", function() {
//         ul.removeChild(li); 
//     });

//     li.appendChild(remover);

//     document.getElementById("new-item").value = "";
// }

let element = document.getElementById("div");
let x = 0;
let y = 0;

document.addEventListener('keydown', function(event) {
    switch(event.key) {
        case 'ArrowUp':
            y -= 10;
            break;
        case 'ArrowDown':
            y += 10;
            break;
        case 'ArrowLeft':
            x -= 10;
            break;
        case 'ArrowRight':
            x += 10;
            break;
    }
    element.style.transform = `translate(${x}px, ${y}px)`;
});