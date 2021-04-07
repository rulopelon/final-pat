function EnviarLogIn(url){

    const User = {
        "username" : document.getElementById("username").value,
        "passwd"   : document.getElementById("password").value
    }
	let mensaje = {
		usuario:User.username,
		passwd:User.passwd
	}
	
	let mensajeEnviar = Json.stringify(mensaje)
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

		}else{
			alert("Ha ocurrido un error al enviar el usuario y contraseña")
		}
	})
	.then(respuesta=>{
		return respuesta
	}) 
	.catch(e=>{
		alert("Error de conexion")
	})
    console.log(User)
    return respuesta
}
