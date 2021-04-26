
var nombre = localStorage.getItem("nombre");
var apellido = localStorage.getItem("apellido");
var rol = localStorage.getItem("rol");


document.getElementById("nombre").innerHTML = nombre + " " + apellido;
document.getElementById("rol").innerHTML = rol;

var x = document.getElementById("escoger");
var option = document.createElement("option");
option.text = "prueba";
x.add(option);