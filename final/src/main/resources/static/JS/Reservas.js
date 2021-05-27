// lo primero que hace es cargar el panel superior de la pestaña
var usuario = localStorage.getItem("usuario");

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
