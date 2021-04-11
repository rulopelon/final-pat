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
		return respuesta
	}) 
	.catch(e=>{
		alert("Error de conexion")
        console.log(e);
	})
    console.log(usuario);
}

