
package servicio;

import dao.Dao;
import data.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Servicios {
    Dao dao = new Dao();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Comentario> comentarios = new ArrayList<>();
    BufferedReader lectura= new BufferedReader(new InputStreamReader(System.in));

//
    public void serializar(){
        dao.serializarUsuarios(usuarios);
    }
    
    public void deserializar(){
        this.usuarios=dao.leerUsuarios();
    }
    public void crearUsuario() throws IOException{
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
        Usuario usuario = new Usuario(nombre, nick, edad, clave, correo);
        usuarios.add(usuario);
    }
    
    public void comentar(String nick) throws IOException{
        for(Usuario u : usuarios){
            if(u.getNick().equals(nick)){
                Comentario comentario = new Comentario();
                System.out.println("Texto ");
                String texto = lectura.readLine();
                System.out.println("Fecha ");
                String fecha = lectura.readLine();;
                comentario.setTexto(texto);
                comentario.setFecha(fecha);
                u.addComentarios(comentario);
            }
        }
    }
    
    public void printComentarios(String nick){
        ArrayList<Comentario> comentarios;
        for(Usuario u : usuarios){
            if(u.getNick().equals(nick)){
                comentarios = u.getComentarios();
                for(Comentario c : comentarios){
                    System.out.println(c);
                }
            }
        }
    }
    
    public void subirFoto(String nick) throws IOException{
        for(Usuario u : usuarios){
            if(u.getNick().equals(nick)){
                Fotografia foto = new Fotografia();
                System.out.println("titulo?");
                String nombre = lectura.readLine();
                System.out.println("Desea añadir descripcion?1.Si");
                int choice = Integer.parseInt(lectura.readLine());
                String descripcion;
                if(choice==1){
                    System.out.println("Ingrese descripcion");
                    descripcion = lectura.readLine();
                }else{ descripcion = "No hay descripcion";}
                foto.setNombre(nombre);
                foto.setDescripcion(descripcion);
                u.addFotos(foto);
                etiquetarFoto(foto);
            }
        }
    }
    
    public void etiquetarFoto(Fotografia foto) throws IOException{
        //ArrayList<Usuario> etiquetados;
        System.out.println("Ingrese cuantos etiquetados hay en la foto");
        int n = Integer.parseInt(lectura.readLine());
        for(int i =0; i<n;i++){
            System.out.println("Ingrese nick etiquetado "+(i+1)+"  ");
            String nick = lectura.readLine();;
            for(Usuario u : usuarios){
                if(u.getNick().equals(nick)){
                    System.out.println("Ingreese coordenada x");
                    int coorx = Integer.parseInt(lectura.readLine());
                    System.out.println("Ingrese coordenada y");
                    int coory = Integer.parseInt(lectura.readLine());
                    foto.addEtiquetas(new Etiqueta(coorx,coory));
                    u.setFotosEtiquetadas(foto);
                }               
            }
        }
        
    }
    
    public void buscarUsuarios() throws IOException{
        System.out.println("Ingrese Nick del usuario a buscar");
        String nick = lectura.readLine();
        for(Usuario u : usuarios){
            if(u.getNick().equals(nick)){
                System.out.println(u);
            }
        }
    }
    
    public void listarComentarios() throws IOException{
        System.out.println("Ingrese nick de usuario a consultar comentarios");
        String nick = lectura.readLine();
        for(Usuario u : usuarios){
            if(u.getNick().equals(nick)){
                ArrayList<Comentario> comentarios = u.getComentarios();
                for(Comentario c : comentarios){
                    System.out.println(c);
                }
            }
        }
    }
    //
    public void listarFotos() throws IOException{
        System.out.println("Ingrese nick de usuario a buscar fotos");
        String nick = lectura.readLine();
        for(Usuario u : usuarios){
            if(u.getNick().equals(nick)){
                System.out.println("Publicadas: "+u.getFotosPublicadas());
                System.out.println("Etiquetadas: "+u.getFotosEtiquetadas());
            }
        }
    }
    
    public void buscar() throws IOException{
        System.out.println("Ingrese palabra a buscar en comentarios");
        String palabra = lectura.readLine();
        for(Usuario u : usuarios){
            ArrayList<Comentario> comentarios = u.getComentarios();
            for(Comentario c : comentarios){
                String[]palabras=c.getTexto().split(" ");
                for(String i: palabras){
                    if(i.equals(palabra)){
                        System.out.println(c.getTexto());
                    }
                }
            }
            
            
        }
    }
            
}
