package udemy.poo.codigo;
/*
    Programa que me de personas (nombre, apellidos, cedula)
 */
public class Persona {
    private String nombre, apellidoPaterno, apellidoMaterno;
    private  String cedula;

    public Persona(){

    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String cedula) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.cedula = cedula;
    }

    
}
