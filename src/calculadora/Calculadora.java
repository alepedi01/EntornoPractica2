//clase calculadora para llamarla desde método public static void main (String[] arg) {..} de clase principal
package calculadora;

public class Calculadora {
// clase con constructor pasando dos numeros reales, setters , getters y métodos para devolver el resultado de sumar, restar , multiplicar y dividir

    private String nombre;
    private double numero1;
    private double numero2;

    

    public Calculadora(String nombre, double numero1, double numero2) {
        this.nombre = nombre;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora(double numero1, double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
    public Calculadora (){
        
    }
    
    
    // getters and setters

    public String getNombre() {
        return nombre;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    
    //métodos ariméticos

    public double suma() {
        double suma=numero1+numero2;
        return suma;
    }

    public double resta() {
        double resta=numero1-numero2;
        return resta;
    }
    
    /*
    public double multiplicacion(){
        double multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    public double division() {
        double division=numero1/numero2;
        return division;
    }
    */

}