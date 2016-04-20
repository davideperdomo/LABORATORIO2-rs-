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

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public int getTiempodehornear() {
        return tiempodehornear;
    }

    
    
}
