/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import data.Comentario;
import data.Usuario;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.text.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
        /*try {
            BufferedReader lectura= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nombre: ");
            String nombre = lectura.readLine();
            System.out.println("Nick: ");
            String nick = lectura.readLine();
            System.out.println("edad: ");
            int edad = 0;
            try {edad = Integer.parseInt(lectura.readLine());
            } catch (IOException ex) {System.out.println("Formato invalido");}
            System.out.println("clave: ");
            String clave = lectura.readLine();;
            System.out.println("correo: ");
            String correo = lectura.readLine();
            }catch (NumberFormatException e) {
            System.out.println("Opcion Invalida");}
        int[] enteros = {1,6};
        System.out.println(Arrays.toString(enteros));+*/
        //Date f = ;
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = date.format(new Date());
        System.out.println(fecha);
    }
    
}
