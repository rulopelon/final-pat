var hora = 9
var minuto = 0

actualizar();


function actualizar(){

    for(i = 0; i<11; i ++){
        for (j = 0; j<6; j++){
            if(hora<10){
                horat = "0" + hora
            }else{
                horat = hora
            }
            if (minuto < 10){
                minutot = "0" + minuto;
            }else{
                minutot = minuto;
            }
            document.getElementById(horat +":"+ minutot).style.backgroundColor = "lightblue";
            minuto = minuto+10
        }
        minuto= 0;
        hora = hora +1
    }

    let url = ""
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
        console.log(respuesta)
        // falta tratamiento de datos recibido 
        // x.add(respuesta);
	}) 
	.catch(e=>{
		alert("Error de conexion")
        console.log(e);
	})
	
}
