/**
 * data Información de la aplicación
 */
package data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase Usuario que implementa la interfaz serializable
 * Guarda la informacion de los usuarios, los comentarios, 
 * las fotos publicadas y las fotos en los que etiquetado
 * @author David
 */
public class Usuario implements Serializable{
    private String nombre;
    private String nick;
    private int edad;
    private String clave;
    private String correo;
    private Comentario coment;
    private ArrayList<Comentario> comentarios = new ArrayList<>();
    private ArrayList<Fotografia> fotosPublicadas = new ArrayList<>();
    private ArrayList<Fotografia> fotosEtiquetadas = new ArrayList<>();

    /**Constructor de Usuario
     * Ingresa los datos personales del objeto Usuario
     * @param nombre
     * @param nick
     * @param edad
     * @param clave
     * @param correo 
     */
    public Usuario(String nombre, String nick, int edad, String clave, String correo) {
        this.nombre = nombre;
        this.nick = nick;
        this.edad = edad;
        this.clave = clave;
        this.correo = correo;
    }
    /**
     * 
     * @return Devuelve el nombre del usuario 
     */   
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return Devuelve el nick del usuario
     */
    public String getNick() {
        return nick;
    }
    /**
     * 
     * @return Devuelve la edad del usuario en tipo entero
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @return Devuelve la clave del usuario
     */
    public String getClave() {
        return clave;
    }
    /**
     * 
     * @return Devuelve el correo del uusuario 
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * 
     * @return Devuelve un array con los comentarios publicados por el usuario 
     */
    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }
    /**
     * 
     * @return Devuelve un array con las fotos publicadas por el usuario
     */
    public ArrayList<Fotografia> getFotosPublicadas() {
        return fotosPublicadas;
    }
    /**
     * 
     * @return Devuelve un array con las fotos en las que está etiquetado el usuario
     */
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
    /**
     * El metodo agrega el comentario al array de comentarios
     * @param comentario Comentario publicado por el usuario
     */
    public void addComentarios(Comentario comentario) {
        this.comentarios.add(comentario);
    }
    /**
     * El metodo agrega la fotografia al array de fotos en donde esta etiquetado
     * @param fotoEtiquetada Fotografia en la que aparece el usuario
     */
    public void setFotosEtiquetadas(Fotografia fotoEtiquetada) {
        this.fotosEtiquetadas.add(fotoEtiquetada);
    }
    /**
     * El metodo agrega la fotografia al array de fotos publicadas
     * @param foto Fotografia publicada
     */
    public void addFotos(Fotografia foto) {
        this.fotosPublicadas.add(foto);
    }
    /**
     * Se sobre escribe el metodo de la clase predeterminada Object
     * @return Devuelve un String con los datos del usurio(Excepto la clave) 
     */
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", nick=" + nick + ", edad=" + edad + ", correo=" + correo + '}';
    }
    
    
}
