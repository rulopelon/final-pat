
var nombre = localStorage.getItem("nombre");
var apellido = localStorage.getItem("apellido");
var rol = localStorage.getItem("rol");


document.getElementById("nombre").innerHTML = nombre + " " + apellido;
document.getElementById("rol").innerHTML = rol;

