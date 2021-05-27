var rol = localStorage.getItem("rol");


document.getElementById("Cola").style.display="none"
if(rol=="profesor"){
    console.log("hola")
    document.getElementById("Reservas").style.display="none"
}