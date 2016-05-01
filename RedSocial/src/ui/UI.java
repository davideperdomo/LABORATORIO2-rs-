/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;
import servicio.Servicios;

/**
 *
 * @author David
 */
public class UI {
    Servicios servicio = new Servicios();
    Scanner lectura = new Scanner(System.in);
    
    public void menu(){
        int m=0;
        do{
            System.out.println("Choice1.2.3.");
            int opcion = lectura.nextInt();
            switch(opcion){
                case 1 :
                    servicio.crearUsuario();
                    break;
                case 2 :
                    //login
                    servicio.comentar();
                    servicio.printComentarios();
                case 3:
                    servicio.subirFoto();
            }
            System.out.println("continuar?1.");
            m = lectura.nextInt();
        }while(m==1);
        
    }

}
