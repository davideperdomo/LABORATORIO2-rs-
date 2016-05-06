/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import data.Comentario;
import data.Usuario;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader lectura= new BufferedReader(new InputStreamReader(System.in));
            //Scanner numero=new Scanner(System.in);
            System.out.println("titulo?");
            String nombre = lectura.readLine();
            System.out.println("Desea añadir descripcion?1.Si");
            int choice = Integer.parseInt(lectura.readLine());
            String descripcion;
            if(choice==1){
                System.out.println("Ingrese descripcion");
                descripcion = lectura.readLine();
            }else{ descripcion = "No hay descripcion";}
        }catch (NumberFormatException e) {
            System.out.println("Opcion Invalida");}
    }
    
}
