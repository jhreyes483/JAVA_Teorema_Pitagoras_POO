
package teorema.de.pitagoras;

import java.util.Scanner;


 
 // Atributos
public class Triangulo {
    
    double raiz, solucion; 
    Scanner leer = new Scanner (System.in);
    
    private double num1;
    private double num2;
 
 
//Constructores
public Triangulo(double pNum1, double pNum2){
    
num1 = pNum1;
num2 = pNum2;
 }

// Metodos
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }



    public void hipotenusa(){ 
   
        System.out.println("El valor del primer cateto es :" +(int)num1);
        System.out.println("El valor del segundo cateto es :"+(int)num2);
        
    //Ecuacion de teorema de pitegoras
     solucion=((num1*num1)+(num2*num2));


        //System.out.println("el valor de solucion es "+solucion);
        //Raiz cuadrada
        raiz = Math.sqrt(solucion);
        
        System.out.println("El valor de la hipotenusa es :"+raiz);
    }
    
public void Espacion(){System.out.println("");
}
}
 
