package backend.es.habccode.sistema.reserva.hotel.model;
import java.util.Objects;


/**
 * Clase Users
 * @author Habccode
 * @version 1.0
 */
public class Users {
    // le empleamos para guardar los datos de los usuarios
    private String usuario;
    private String Contrasenia;
    private String email;
   

    /**
     * Constructor vacio de la clase Users
     */
    // lo empleamos para guardar los datos de los usuarios
    public Users() {
    }
    


    /**
     * Constructor de la clase Users
     * @param usuario
     */
    public Users(String email) {
        this.email = email;
    }


    /**
     * Constructor de la clase Users
     * @param usuario
     * @param Contrasenia
     * @param email
     */
    public Users(String usuario, String Contrasenia, String email) {
        this.usuario = usuario;
        this.Contrasenia = Contrasenia;
        this.email = email;
}



    // Getters y Setters
    public String getusuario() {
        return this.usuario;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return this.Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Users usuario(String usuario) {
        setusuario(usuario);
        return this;
    }

    public Users Contrasenia(String Contrasenia) {
        setContrasenia(Contrasenia);
        return this;
    }

    public Users email(String email) {
        setEmail(email);
        return this;
    }




    /**
     * Compara dos objetos Users
     * @param o objeto a comparar
     * @return true si son iguales, false si no
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Users)) {
            return false;
        }
        Users users = (Users) o;
        return Objects.equals(email, users.email);
    }


    /**
     * Devuelve el hashcode del objeto
     * @return hashcode del objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(email);
    }


    /**
     * Devuelve una cadena con los datos del objeto
     * @return cadena con los datos del objeto
     */
    @Override
    public String toString() {
        return  getusuario() + "," + getContrasenia() + "," + getEmail() + "\n";
    }



 }
