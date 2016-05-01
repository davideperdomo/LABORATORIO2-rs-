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
    int m;
    int opcion;
    public void usuarioMenu(){
        System.out.println("Nick?");
        String nick = lectura.next();
        do{
            System.out.println("Menu2?1.2.3.");
            opcion = lectura.nextInt();
            switch(opcion){
                case 1:
                    servicio.comentar(nick);
                    servicio.printComentarios(nick);
                    break;
                case 2:
                    servicio.subirFoto(nick);
                    break;
                case 3:
                    busquedas();
                    break;
            }
            System.out.println("continuar?1.");
            m = lectura.nextInt();
        }while(m==1);
    }
    
    public void busquedas(){
        do{
            System.out.println("Menubusquedas?1.2.3.4.");
            opcion = lectura.nextInt();
            switch(opcion){
                case 1:
                    servicio.buscarUsuarios();
                    break;
                case 2:
                    servicio.listarComentarios();
                    break;
                case 3:
                    servicio.listarFotos();
                    break;
                case 4:
                    servicio.buscar();
                    break;
            }
            System.out.println("continuar?1.");
            m = lectura.nextInt();
        }while(m==1);
    }
    
    public void menu(){
        do{
            System.out.println("Choice?1.2.3.");
            int opcion = lectura.nextInt();
            switch(opcion){
                case 1 :
                    servicio.crearUsuario();
                    break;
                case 2 :
                    usuarioMenu();
                    break;
                case 3:
                    busquedas();
            }
            System.out.println("continuar?1.");
            m = lectura.nextInt();
        }while(m==1);
        
    }

}
