package pizzeria;

import java.util.ArrayList;


public class Pizza {
    protected String masa;
    protected String salsa;
    protected ArrayList<String> ingredientes = new ArrayList<>();
    protected int tiempodehornear;

    public Pizza() {
        this.masa = "Regular";
        this.salsa = "Tomate";
    }
    
    public String tiempoHornear(){
        String t = "tiempo de horneado: " +tiempodehornear+ " minutos ";
        return t;
    }
    
    public void printIngredientes(){
        System.out.println("INGREDIENTES");
        for(String i : ingredientes){
            System.out.println(i);
        }
    }

}
