//alert('Hola Mundo');

//prompt: metodo que muestra un cuadro de dialogo con un mensaje que solicita al usuario que ingrese algun texto
//document.querySelector(): permite seleccionar elementos del html
//innerHTML: Muestra el texto que introduje y elimina el contenido
//Con alt+39 pongo comillas simples
const nombre = prompt('¿Cual es tu nombre?');
document.querySelector('.contenido').innerHTML = `${nombre} esta aprendiendo JavaScript Moderno`;