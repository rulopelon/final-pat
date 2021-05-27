actualizar();

function actualizar(){

    var hora = 9
    var minuto = 0

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
    var url = ""
    if(localStorage.getItem("rol") == "alumno"){
        url = "/reservas/getReservasAlumno?id=" + localStorage.getItem("id")
    }else{
        url = "/reservas/getReservasProfesor?id=" + localStorage.getItem("id")
    }
   
    fetch(url,{
		method:'GET',
		headers:{
		     'Content-Type': 'application/json; chartset=UTF-8'
		}
	})
	.then(r=>{
		if(r.status ===200){
            return r.json()
		}else if(r.status==400){
            alert("Error")
        }else{
			alert("Ha ocurrido un error")
		}
	})
	.then(respuesta=>{
        console.log(respuesta)
        // falta tratamiento de datos recibido 
        let i = 0
        let hoy =  new Date()
        while(respuesta[i] != undefined){
            let horat
            let minutot
            let dia
            let mes
            let ano
            

            if(respuesta[i].hora < 10){
                horat = "0" + respuesta[i].hora
            }else{
                horat = respuesta[i].hora
            }

            if(respuesta[i].minuto < 10){
                minutot = "00"
            }else if (respuesta[i].minuto < 20){
                minutot = "10"
            } else if (respuesta[i].minuto < 30){
                minutot = "20"
            } else if (respuesta[i].minuto < 40){
                minutot = "30"
            } else if (respuesta[i].minuto < 50){
                minutot = "40"
            } else {
                minutot = "50"
            }

            dia = respuesta[i].dia
            mes = respuesta[i].mes
            ano = respuesta[i].ano

            console.log(dia)
            console.log(hoy.getDate())
            


            if (dia == hoy.getDate() && mes == (hoy.getMonth()+1) && ano == hoy.getFullYear()){
                console.log("hola")
                console.log(horat)
                console.log(minutot)
                document.getElementById(horat +":"+ minutot).style.backgroundColor = "rgb(237, 120, 153)"
            }
            i++
        }
	}) 
	.catch(e=>{
		alert("Error de conexion")
        console.log(e);
	})
    
	
}
