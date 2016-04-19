
package pizzeria;

import java.util.ArrayList;
import java.util.Scanner;

public class LaPizzeria {
    
    ArrayList<Vegetariana> pizzas = new ArrayList<>();
    
    public void preparar(){
        Scanner  lectura = new Scanner(System.in);
        System.out.println("Tipo de pizza");
        int t = lectura.nextInt();
        switch(t){
            case 1 :
                Vegetariana pvegetariana = new Vegetariana();
                pizzas.add(pvegetariana);
                System.out.println("Tipo de pizza");
        }
        
    }
    public void hornear(){
        
    }
    public void cortar(){
        
    }
    public void empacar(){
        
    }
    public void listaPasos(){
               for(Vegetariana p : pizzas){
                   p.printIngredientes();
               }
    }
}
