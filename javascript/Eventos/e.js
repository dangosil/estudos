function coordenadas(event) {
    const divCoordenadas = document.querySelector('.mouse-coordinates');
    const x = event.clientX;
    const y = event.clientY;
    alert(`X: ${x}, Y: ${y}`);
}

document.addEventListener('click', coordenadas);