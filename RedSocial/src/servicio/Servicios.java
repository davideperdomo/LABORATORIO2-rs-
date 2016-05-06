
package servicio;

import Excepcion.ExcepcionSistema;
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
    //ArrayList<Comentario> comentarios = new ArrayList<>();
    BufferedReader lectura= new BufferedReader(new InputStreamReader(System.in));

    public void serializar(){
        dao.serializarUsuarios(usuarios);
    }
    
    public void deserializar(){
        this.usuarios=dao.leerUsuarios();
    }
    public void crearUsuario() throws IOException{
        try{
        System.out.println("Nombre: ");
        String nombre = lectura.readLine();
        if(nombre.length()>100){
            throw new ExcepcionSistema("El nombre tener menos de 100 caracteres");}
        System.out.println("Nick: ");
        String nick = lectura.readLine();
        for(Usuario u: usuarios){
            if(u.getNick().equalsIgnoreCase(nick)==true){
                throw new ExcepcionSistema(nick+" ya está usado");}}
        System.out.println("edad: ");
        int edad = 0;
        try {edad = Integer.parseInt(lectura.readLine());
        } catch (IOException ex) {System.out.println("Formato invalido");}
        if(edad<18){throw new ExcepcionSistema("Debe ser mayor de 18 años");}
        System.out.println("clave: ");
        String clave = lectura.readLine();
        if(clave.equals("123456")){throw new ExcepcionSistema("Clave insegura");}
        System.out.println("correo: ");
        String correo = lectura.readLine();
        if(correo.indexOf("@")==-1){throw new ExcepcionSistema("Formato invalido");}
        Usuario usuario = new Usuario(nombre, nick, edad, clave, correo);
        usuarios.add(usuario);
        }catch(ExcepcionSistema es){System.out.println(es);}
    }
    
    public void comentar(String nick) throws IOException{
        try{
        for(Usuario u : usuarios){
            if(u.getNick().equals(nick)){
                Comentario comentario = new Comentario();
                System.out.println("Texto ");
                String texto = lectura.readLine();
                if(texto.length()>200){
                    throw new ExcepcionSistema("El comentario debe tener menos de 200 caracteres");}
                System.out.println("Fecha ");
                String fecha = lectura.readLine();;
                comentario.setTexto(texto);
                comentario.setFecha(fecha);
                u.addComentarios(comentario);
            }
        }}catch(ExcepcionSistema es){System.out.println(es);}
        
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
        try{
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
                    if(descripcion.length()>200){
                        throw new ExcepcionSistema("La descripcion debe tener menos de 200 caracteres");}
                }else{ descripcion = "No hay descripcion";}
                foto.setNombre(nombre);
                foto.setDescripcion(descripcion);
                u.addFotos(foto);
                etiquetarFoto(foto);
            }
        }}catch(ExcepcionSistema es){System.out.println(es);}
    }
    
    public void etiquetarFoto(Fotografia foto) throws IOException{
        try{
        System.out.println("Ingrese cuantos etiquetados hay en la foto(2 a 5 etiquetados)");
        int n = Integer.parseInt(lectura.readLine());
        if(n<2){throw new ExcepcionSistema("Deben haber mas de 2 etiquetados");}
        if(n>5){throw new ExcepcionSistema("Deben haber menos de 5 etiqutados");}
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
        }}catch(ExcepcionSistema es){System.out.println(es);}
        
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
