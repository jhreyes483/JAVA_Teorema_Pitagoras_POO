//main
package teorema.de.pitagoras;

public class TeoremaDePitagoras {

    public static void main(String[] args) {
        
        
     Triangulo Triangulo1 = new Triangulo(2,3); 
        System.out.println("Triangulo 1");
     Triangulo1.hipotenusa();
      Triangulo1.Espacion();
     
     Triangulo Triangulo2 = new Triangulo(9,8);
        System.out.println("Triangulo 2");
        Triangulo2.hipotenusa();
        Triangulo2.Espacion();
        
        Triangulo Triangulo3 = new Triangulo(4,3);
        System.out.println("Triangulo 3");
        Triangulo3.hipotenusa();
        Triangulo3.Espacion();
      
    }
    
}
