/*
package Clases;

import java.util.ArrayList;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected ArrayList<String> mano;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mano = new ArrayList<>();
    }

    public abstract void cogerCarta(String carta);

    public void recibirCarta(String carta) {
        mano.add(carta);
    }

    public int calcularPuntuacion(Mazo mazo) {
        int puntuacion = 0;
        for (String carta : mano) {
            puntuacion += mazo.obtenerValorCarta(carta);
        }
        return puntuacion;
    }

    public String getNombre() {
        return nombre;
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
*/
package Clases;

import java.util.ArrayList;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    protected ArrayList<String> mano;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mano = new ArrayList<>();
    }

    public abstract void cogerCarta(String carta);

    public void recibirCarta(String carta) {
        mano.add(carta);
    }

    public String getNombre() {
        return nombre;
    }

    public int calcularPuntuacion(Mazo mazo) {
        int puntuacion = 0;
        for (String carta : mano) {
            puntuacion += mazo.obtenerValorCarta(carta);
        }
        return puntuacion;
    }
}
