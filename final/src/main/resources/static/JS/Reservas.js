// lo primero que hace es cargar el panel superior de la pestaña
var usuario = localStorage.getItem("usuario");
fetch('localhost:8080/usuarios/infocabecera/'+usuario,{
	method:'GET'
})
.then(r=>{
	if(r.status == 200){
		return r.json();
	}else{
		alert("ha ocurrido un problema con su consulta")
	}
})
.then(respuesta=>{
	var panel_superior =document.getElementById("panel-superior");
	//se añade el nombre de usuario
	panel_superior.innerHTML("<div class=\"container-fluid align-text-top\">"+respuesta.fecha+"");
	panel_superior.innerHTML("<div class=\"container-fluid align-text-top\">"+respuesta.nombre+" "+respuesta.apellido);
	
})
.catch(e=>{
	alert("Error de conexion")
    console.log(e);
});
function reservar(fila,cola){
	fetch('localhost:8080/usuarios/reservar/'+fila+'/'+cola,{
		method:'GET'
	})
	.then(r=>{
		if(r.status ==200){
			return r.json;
		}else{
			alert("ha ocurrido un error")
		}
	})
	.then(respuesta=>{
		
	})
	.catch(e=>{
		alert("Error de conexion")
        console.log(e);
	})
}
