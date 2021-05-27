var hora = 9
var minuto = 0

document.getElementById("09:00").style.backgroundColor= "lightblue";

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

