package domina;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersona;
    
    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementar el valor por cada objeto nuevo
        Persona.contadorPersona++;
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}
