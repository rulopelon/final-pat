// lo primero que hace es cargar el panel superior de la pestaña
var usuario = localStorage.getItem("usuario");

function reservar(){
	const url = "/reservas/realizarReserva/=" + localStorage.getItem("id") + "/" + document.getElementById("escoger").value;
	let fecha = document.getElementById("Fecha").value
	let hora = document.getElementById("Hora").value
	fecha = fecha.split("-")
	hora = hora.split(":")
	
	let mensaje ={
		dia: fecha[2],
		mes: fecha[1],
		ano: fecha[0],
		hora: hora[0],
		minuto: hora[1]
	}
	let mensajeEnviar = JSON.stringify(mensaje)
	// se realiza la llamada al servidor
	fetch(url,{
		method:'POST',
		headers:{
		     'Content-Type': 'application/json; chartset=UTF-8'
		},
		body: mensajeEnviar
	})
	.then(r=>{
		if(r.status ==200){
			return r.json()

		}else if(r.status==400){
            alert("El usuario o la contraseña no cumplen los requisitos")
        }else{
			alert("Ha ocurrido un error al enviar el usuario y contraseña")
		}
	})
	.then(respuesta=>{
        // falta tratamiento de datos recibido
        
	}) 
	.catch(e=>{
		alert("Error de conexion")
        console.log(e);
	})
}
