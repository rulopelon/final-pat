var x = document.getElementById("escoger");

    const url = "/usuarios/getProfesores?id=" + localStorage.getItem("id")
	// se realiza la llamada al servidor
	fetch(url,{
		method:'GET',
		headers:{
		     'Content-Type': 'application/json; chartset=UTF-8'
		}
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
		let i = 0
		while(respuesta[i] != undefined){
			let option = document.createElement("option")
			option.text= respuesta[i].id
			x.add(option)
			i++
		} 
        
	}) 
	.catch(e=>{
		alert("Error de conexion")
        console.log(e);
	})
	
	
