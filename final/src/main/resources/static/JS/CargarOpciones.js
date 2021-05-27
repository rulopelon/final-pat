var x = document.getElementById("escoger");



	let mensaje = {
		id: localStorage.getItem("id")
	}
    const url = "/usuarios/getProfesores"
	let mensajeEnviar = JSON.stringify(mensaje)
	// se realiza la llamada al servidor
	fetch(url,{
		method:'GET',
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
        console.log(respuesta)
        // falta tratamiento de datos recibido 
        // x.add(respuesta);
	}) 
	.catch(e=>{
		alert("Error de conexion")
        console.log(e);
	})
	
	if(localStorage.getItem(rol)=="alumno"){
		window.location.href = "\reservas.html";
	}
