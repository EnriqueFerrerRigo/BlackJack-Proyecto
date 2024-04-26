package Clases;

//metodos de jugador: pedir carta, plantarse...
public class Jugador extends Persona implements OpcionesJugador{

    protected int dinero;
    public Jugador(String nombre, String apellido, int edad, int dinero) {
        super(nombre, apellido, edad);
        this.dinero = dinero;
    }

    @Override
    public void pedirCarta() {

    }

    @Override
    public void plantarse() {

    }

    @Override
    public void apostar() {

    }
}