
package pizzeria;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LaPizzeria {
    
    ArrayList<Pizza> pizz= new ArrayList<>();
    ArrayList<Vegetariana> pizzas = new ArrayList<>();
    ArrayList<Pepperoni> pizzasp = new ArrayList<>();
    ArrayList<Queso> pizzasq = new ArrayList<>();
    
    public void preparar(){
        Scanner  lectura = new Scanner(System.in);
        System.out.println("Tipo de pizza");
        int t = lectura.nextInt();
        switch(t){
            case 1 :
                Vegetariana pvegetariana = new Vegetariana();
                pizz.add(pvegetariana);  
                abrirImagen("vegetariana.jpeg");
                listaPasos();
            case 2 :
                Pepperoni ppepperoni = new Pepperoni();
                pizzasp.add(ppepperoni);
            case 3 :
                Queso pqueso = new Queso();
                pizzasq.add(pqueso);                                          
        }
        
        
    }
    public void hornear(){
        
    }
    public void cortar(){
        
    }
    public void empacar(){
        
    }
    public void listaPasos(){
        for(Pizza p : pizz){
            p.printIngredientes();
        }
    }
    
    public void abrirImagen(String archivo){

        try {
            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);
        }catch (IOException ex) {
            System.out.println(ex);
        }

    }     
}
