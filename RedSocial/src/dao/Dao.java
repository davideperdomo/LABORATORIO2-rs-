
package dao;

import data.Usuario;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Dao{
    public void serializarUsuarios(ArrayList<Usuario> usuarios){
        try{
            ObjectOutputStream escribirUsuarios = new ObjectOutputStream(new FileOutputStream("DATABASE.txt"));
            escribirUsuarios.writeObject(usuarios);
            escribirUsuarios.close();
        }catch(Exception e){
            System.out.println("Error en serializacion");
        }
    }
    
    public ArrayList<Usuario> leerUsuarios(){
        ArrayList<Usuario> usuariosLeidos = null;
        try{
            ObjectInputStream leerObjeto = new ObjectInputStream(new FileInputStream("DATABASE.txt"));
            usuariosLeidos = (ArrayList<Usuario>) leerObjeto.readObject();
            leerObjeto.close();
        }catch(Exception e){
            System.out.println("Error en lectura");
        }
        return usuariosLeidos;
    }
}
