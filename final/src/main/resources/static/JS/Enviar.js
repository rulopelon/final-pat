function EnviarLogIn(url){

    const usuario = {
        "username" : document.getElementById("username").value,
        "passwd"   : document.getElementById("password").value
    }

	let mensaje = {
		usuario: usuario.username,
		passwd:  usuario.passwd
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
		localStorage.setItem("id",respuesta.id);
		localStorage.setItem("passwd",respuesta.contrasena);
		localStorage.setItem("nombre",respuesta.nombre);
		localStorage.setItem("apellido",respuesta.apellido);
		localStorage.setItem("rol",respuesta.rol);
		localStorage.setItem("correo",respuesta.correo);
		
		console.log("Hola")
		if(localStorage.getItem("rol")=="alumno"){
			window.location.href = "\Home.html";
		}
		if(localStorage.getItem("rol")=="profesor"){
			window.location.href = "\Home.html";
		}
	}) 
	.catch(e=>{
		alert("Error de conexion")
        console.log(e);
	})
	
	
}
function RecuperarContrasena(){
	var usuario = document.getElementById("username").value
	if(usuario == null){
		alert("Introduzca su usuario en la casilla")
		
	}
	// se realiza la llamada a la base  de datos
	fetch("/login/recuperar?user="+usuario,{
		method:'GET'
	})
	.then(r=>{
		if(r.status == 200){
			confirm("Compruebe su correo, contraseña cambiada")
		}
	})
	.catch(e=>{
		alert("Ha ocurrido un error")
		console.error(e);
	});
	
	
}
