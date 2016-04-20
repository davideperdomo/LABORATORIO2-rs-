
package pizzeria;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LaPizzeria {
    
    ArrayList<Pizza> pizzas= new ArrayList<>();
    
    public void pedido(){
        Scanner  lectura = new Scanner(System.in);
        System.out.println("Tipo de pizza (1.Vegetariana - 2.Pepperoni - 3.Queso)");
        int t = lectura.nextInt();
        switch(t){
            case 1 :
                Vegetariana pvegetariana = new Vegetariana();
                abrirImagen("vegetariana.jpeg");
                preparar(pvegetariana);
                break; 
            case 2 :
                Pepperoni ppepperoni = new Pepperoni();
                abrirImagen("pepperoni.jpeg");
                preparar(ppepperoni);
                break;
            case 3 :
                Queso pqueso = new Queso(); 
                abrirImagen("queso.jpeg");
                preparar(pqueso);
                break;
        }
        
        
    }
    
    public void mashMasa(Pizza p){
        System.out.println("MASA\n"+p.getMasa());
    }
    
    public void addSalsa(Pizza p){
        System.out.println("SALSA\n"+p.getSalsa());
    }
    
    public void addIngredientes(Pizza p){
        System.out.println("INGREDIENTES");
        for(String s:p.getIngredientes()){
            System.out.println(s);
        }
    }
    
    public void hornear(Pizza p){
            System.out.println("HORNEAR\n"+p.getTiempodehornear()+" minutos");
    }
    
    public void cortar(){
        System.out.println("CORTAR\n1 minuto");
    }
    public void empacar(){
        System.out.println("EMPACAR\n1 minuto");
    }

    
    public void abrirImagen(String archivo){

        try {
            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);
        }catch (IOException ex) {
            System.out.println(ex);
        }catch (IllegalArgumentException e){
            System.out.println("ERROR: Imagen no disponible");
        }

    }
    
    public void preparar(Pizza p){
        mashMasa(p);
        addSalsa(p);
        addIngredientes(p);
        hornear(p);
        cortar();
        empacar();
        pizzas.add(p);
              
    }
}
