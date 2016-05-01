
package servicio;

import dao.Dao;
import data.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Servicios {
    Dao dao = new Dao();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    //ArrayList<Comentario> comentarios = new ArrayList<>();
    Scanner lectura = new Scanner(System.in);
    
    public void crearUsuario(){
        System.out.println("Nombre? ");
        String nombre = lectura.next();
        System.out.println("Nick' ");
        String nick = lectura.next();
        System.out.println("edad? ");
        int edad = lectura.nextInt();
        System.out.println("clave? ");
        String clave = lectura.next();
        System.out.println("correo? ");
        String correo = lectura.next();
        Usuario usuario = new Usuario(nombre, nick, edad, clave, correo);
        usuarios.add(usuario);
    }
    
    public void comentar(){
        System.out.println("Nick");
        String nick = lectura.next();
        for(Usuario u : usuarios){
            if(u.getNick().equals(nick)){
                Comentario comentario = new Comentario();
                System.out.println("texto? ");
                String texto = lectura.next();
                System.out.println("fecha? ");
                String fecha = lectura.next();
                comentario.setTexto(texto);
                comentario.setFecha(fecha);
                u.addComentarios(comentario);
            }
        }
    }
    
    public void printComentarios(){
        ArrayList<Comentario> comentarios;
        System.out.println("Nick");
        String nick = lectura.next();
        for(Usuario u : usuarios){
            if(u.getNick().equals(nick)){
                comentarios = u.getComentarios();
                for(Comentario c : comentarios){
                    System.out.println(c);
                }
            }
        }
    }
    
    public void subirFoto(){
        System.out.println("Nick");
        String nick = lectura.next();
        for(Usuario u : usuarios){
            if(u.getNick().equals(nick)){
                Fotografia foto = new Fotografia();
                System.out.println("titulo?");
                String nombre = lectura.next();
                System.out.println("descripcion?");
                String descripcion = lectura.next();
                foto.setNombre(nombre);
                foto.setDescripcion(descripcion);
                u.addFotos(foto);
                System.out.println("error");
                etiquetarFoto(foto);
                
            }
        }
    }
    
    public void etiquetarFoto(Fotografia foto){
        //ArrayList<Usuario> etiquetados;
        System.out.println("cuantos etiquetados?");
        int n = lectura.nextInt();
        for(int i =0; 2<n;i++){
            System.out.println("nick etiquetado "+(i+1)+"?");
            String nick = lectura.next();
            for(Usuario u : usuarios){
                if(u.getNick().equals(nick)){
                    System.out.println("coordenadax");
                    int coorx = lectura.nextInt();
                    System.out.println("coordenaday");
                    int coory = lectura.nextInt();
                    foto.addEtiquetas(new Etiqueta(coorx,coory));
                }               
            }
        }
        
    }
            
}
