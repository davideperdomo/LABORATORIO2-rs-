package pizzeria;

import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Scanner  lectura = new Scanner(System.in);
        LaPizzeria lapizzeria = new LaPizzeria();
        int m;
        do{
        lapizzeria.pedido();
        System.out.println("Desea preparar otra pizza? (1.SI - 2.NO)");
        m = lectura.nextInt();
        }while(m==1);
    }
    
}
