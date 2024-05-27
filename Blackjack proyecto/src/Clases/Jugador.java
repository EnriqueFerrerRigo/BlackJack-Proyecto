/*
package Clases;

import java.util.Scanner;

public class Jugador extends Persona {
    Scanner sc = new Scanner(System.in);
    protected int dinero;

    public Jugador(String nombre, String apellido, int edad, int dinero) {
        super(nombre, apellido, edad);
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    @Override
    public void cogerCarta(String carta) {
        recibirCarta(carta);
        System.out.println("El jugador " + getNombre() + " ha recibido la carta: " + carta);
    }

    public void plantarse() {
        System.out.println("El jugador " + getNombre() + " se ha plantado.");
    }

    public void apostar() {
        System.out.println("Tu saldo actual para apostar es: " + dinero);
        System.out.println("Apuesta la cantidad que desees: ");
        int apuesta = sc.nextInt();
        if (apuesta <= dinero) {
            dinero -= apuesta;
            System.out.println("Tu saldo actual es: " + dinero);
        } else {
            System.out.println("No tienes suficiente dinero para realizar esa apuesta");
        }
    }

    public int calcularPuntuacion(Mazo mazo) {
        int puntuacion = 0;
        for (String carta : mano) {
            int valorCarta = mazo.obtenerValorCarta(carta);
            puntuacion += valorCarta;
        }
        return puntuacion;
    }

}*/
package Clases;

import java.util.Scanner;

public class Jugador extends Persona {
    private int dinero;
    private int apuesta;
    private Scanner sc = new Scanner(System.in);

    public Jugador(String nombre, String apellido, int edad, int dinero) {
        super(nombre, apellido, edad);
        this.dinero = dinero;
        this.apuesta = 0;
    }

    public int getDinero() {
        return dinero;
    }

    public void apostar() {
        System.out.println("Tu saldo actual para apostar es: " + dinero);
        System.out.println("Apuesta la cantidad que desees: ");
        int apuesta = sc.nextInt();
        if (apuesta <= dinero) {
            dinero -= apuesta;
            this.apuesta = apuesta;
            System.out.println("Tu saldo actual es: " + dinero);
        } else {
            System.out.println("No tienes suficiente dinero para realizar esa apuesta");
        }
    }

    public int getApuesta(){
        return apuesta;
    }

    public void ganarApuesta(){
        int ganancia = apuesta * 2;
        dinero += ganancia;
        System.out.println("¡Felicidades! Has ganado " + ganancia + ". Tu saldo actual es: " + dinero);
    }

    @Override
    public void cogerCarta(String carta) {
        recibirCarta(carta);
        System.out.println("El jugador " + getNombre() + " ha recibido la carta: " + carta);
    }
}



