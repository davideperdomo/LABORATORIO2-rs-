package figuras;

import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int m=0;
        do{
        System.out.println("Digite 1 para ingresar rectangulo, o 2 para ingresar triangulo");
        int s = lectura.nextInt(); 
        System.out.println("Ingrese la altura");
        double h = lectura.nextDouble();
        System.out.println("Ingrese el ancho");
        double w = lectura.nextDouble();
        switch(s){
            case 1:
                Rectangle rectangulo = new Rectangle(w,h,4);
                System.out.println("AREA:"+rectangulo.getArea()+"\nPERIMETRO: "+rectangulo.getPerimeter());
                break;
            case 2:
                System.out.println("Digite 1 si es Triangulo Rectangulo, o 2 si es Triangulo Escaleno ");
                int t = lectura.nextInt();
                Triangle triangulo = new Triangle(w,h,t,3);
                System.out.println("AREA: "+triangulo.getArea()+"\nPERIMETRO: "+triangulo.getPerimeter());
                break;
        }
        System.out.println("Desea concer el area y perimetro de otra figura?(1.Si - 2.No)");
        m= lectura.nextInt();
        }while(m==1);
    }
    
}
