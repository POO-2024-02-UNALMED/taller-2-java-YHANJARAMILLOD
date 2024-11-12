package test;
public class Auto {
    String modelo;
    int precio;
    String marca;
    String cantidadCreados;
    int registro;
    Motor motor;
    Asiento[] asientos;  
    
    int cantidadAsientos(){
        int contador=0;
        for(int i=0; i< asientos.length;i++){
            if (asientos[i] != null){
                contador++;
            }
        }
        return contador;
    }
    String verificarIntegridad(){
        int contador=0;
        String respuesta="Las piezas no son originales";
        for(int i=0; i<asientos.length;i++){
            if (asientos[i].registro==motor.registro && motor.registro==this.registro){
                contador++;
            }
        }
        if (contador==asientos.length){
            respuesta = "Auto original";
        }
        return respuesta;
    }    
}



                    
    


    
                

      
