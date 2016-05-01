package data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Usuario implements Serializable{
    private String nombre;
    private String nick;
    private int edad;
    private String clave;
    private String correo;
    
    private ArrayList<Comentario> comentarios = new ArrayList<>();
    private ArrayList<Fotografia> fotosPublicadas = new ArrayList<>();
    private ArrayList<Fotografia> fotosEtiquetadas;

    public Usuario(String nombre, String nick, int edad, String clave, String correo) {
        this.nombre = nombre;
        this.nick = nick;
        this.edad = edad;
        this.clave = clave;
        this.correo = correo;
    }
       
    
    public String getNombre() {
        return nombre;
    }

    public String getNick() {
        return nick;
    }

    public int getEdad() {
        return edad;
    }

    public String getClave() {
        return clave;
    }

    public String getCorreo() {
        return correo;
    }
    
    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public ArrayList<Fotografia> getFotosPublicadas() {
        return fotosPublicadas;
    }

    public ArrayList<Fotografia> getFotosEtiquetadas() {
        return fotosEtiquetadas;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        
    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void addComentarios(Comentario comentario) {
        this.comentarios.add(comentario);
    }

   

    public void setFotosEtiquetadas(Fotografia fotoEtiquetada) {
        this.fotosEtiquetadas.add(fotoEtiquetada);
    }

    public void addFotos(Fotografia foto) {
        this.fotosPublicadas.add(foto);
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", nick=" + nick + ", edad=" + edad + ", clave=" + clave + ", correo=" + correo + '}';
    }
    
    
}
