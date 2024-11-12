package test;
public class Asiento{
    String color;
    Integer precio;
    Integer registro;

    public void cambiarColor(String color){
        if (color=="rojo" || color=="verde" || color=="amaramillo" || color=="negro" || color=="blanco"){
            this.color=color;
        }  
    }
}