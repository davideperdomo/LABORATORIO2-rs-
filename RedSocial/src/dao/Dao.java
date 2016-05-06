/**
 * Acceso de Información
 */
package dao;

import data.Usuario;
import java.io.*;
import java.util.ArrayList;

/**
 * Clase Data Acces Object
 * Conecta la aplicacion con la salida y entrada del archivo de persistencia
 * @author David
 */
public class Dao{
    /**
     * Guarda la informacion de un arreglo de objetos de la clase Usuario
     * @param usuarios Array que tiene almacenados los usuarios de la red social 
     */
    public void serializarUsuarios(ArrayList<Usuario> usuarios){
        try{
            ObjectOutputStream escribirUsuarios = new ObjectOutputStream(new FileOutputStream("DATABASE.txt"));
            escribirUsuarios.writeObject(usuarios);
            escribirUsuarios.close();
        }catch(Exception e){
            System.out.println("Error en serializacion");
        }
    }
    /**
     * Lee los objetos guardados en el archivo "DATABASE.txt"
     * @return Devuelve un array con los usuarios registrados
     */
    public ArrayList<Usuario> leerUsuarios(){
        ArrayList<Usuario> usuariosLeidos = null;
        try{
            ObjectInputStream leerObjeto = new ObjectInputStream(new FileInputStream("DATABASE.txt"));
            usuariosLeidos = (ArrayList<Usuario>) leerObjeto.readObject();
            leerObjeto.close();
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Error en lectura");
        }
        return usuariosLeidos;
    }
}
