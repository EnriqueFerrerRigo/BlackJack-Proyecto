package Clases;

import java.util.Scanner;

//metodos de jugador: pedir carta, plantarse...
public class Jugador extends Persona implements OpcionesJugador{
    Scanner sc = new Scanner(System.in);
    protected int dinero;
    public Jugador(String nombre, String apellido, int edad, int dinero) {
        super(nombre, apellido, edad, dinero);
        this.dinero = dinero;
    }

    @Override
    public void pedirCarta() {
        System.out.println("Has pedido carta adicional. " + getCarta());
    }

    @Override
    public void plantarse() {
        System.out.println("El jugador " + getNombre() + " se ha plantado.");
    }

    @Override
    public void apostar() {
        System.out.println("Tu saldo actual para apostar es: " + dinero);
        System.out.println("Apuesta la cantidad que desees: ");
        int apuesta = sc.nextInt();
        if(apuesta <= dinero){
            dinero -= apuesta;
            System.out.println("Has realizado una apuesta de " + apuesta);
            System.out.println("Tu saldo actual es: " + dinero);
        }else{
            System.out.println("No tienes suficiente dinero para realizar esa apuesta");
        }

    }
}