package Clases;

import java.util.ArrayList;

//se extiende a crupier y jugador
//nombre, edad, etc...
public class Persona {

    private String nombre,apellido;

    private int edad;

    protected ArrayList<Integer> mano;

    public Persona (String nombre, String apellido, int edad, int carta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mano = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void recibirCarta (int carta){
        mano.add(carta);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
