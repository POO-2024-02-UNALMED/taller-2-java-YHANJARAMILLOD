package test;
public class Auto {
    public static void main(String[] args) {
        String modelo;
        Integer precio;
        String marca;
        String cantidadCreados;
        Integer registro;
        Motor motor;
        Asiento[] asientos;  
    
        public int cantidadAsientos(Asiento[] Asiento){
            int contador=0;
            for(int i=0; i< Asiento.length;i++){
                if (Asiento[i] != null){
                    contador++;
                }
            }
            return contador;
        }
        verificarIntegridad(){
            for(int i=0; i<Asientos.length;i++){
                if (Asientos[i]==Motor.registro==this.Auto.registro){
                    return "Auto original";
                }else{
                    return "Las piezas no son originales";
                }
            }
        }
    }
}
                    
    


    
                

      
