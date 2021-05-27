var rol = localStorage.getItem("rol");


document.getElementById("Cola").style.display="none"
if(rol=="profesor"){
    document.getElementById("Reservas").style.display="none"
}