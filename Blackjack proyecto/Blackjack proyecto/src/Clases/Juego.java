package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    //el proyecto está estimado para que sea 1v1, ya que así es más simple
    //controlar el flujo de la partida, quién gana, etc..
    Scanner sc = new Scanner(System.in);
    private Mazo mazo;
    private Crupier crupier;
    private ArrayList<Jugador> jugadores;

    public Juego(Mazo mazo) {
        this.mazo = mazo;
        this.crupier = new Crupier();
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);

    }

    public void iniciarJuego() {
        // Inicializar el juego: Repartir cartas iniciales a todos los jugadores y al crupier
        // + 2 cartas a cada jugador y crupier

        repartirNuevaMano();
    }

    public void repartirNuevaMano() {
        for (Jugador jugador : jugadores) {
            jugador.recibirCarta(mazo.repartirCarta());
        }
        crupier.recibirCarta(mazo.repartirCarta());
        for (Jugador jugador : jugadores) {
            jugador.recibirCarta(mazo.repartirCarta());
        }
        crupier.recibirCarta(mazo.repartirCarta());
    }



    public void pedirCartaAdicional(Jugador jugador) {
        jugador.recibirCarta(mazo.repartirCarta());
    }

    public void terminarTurnoJugador() {
        for(Jugador jugador : jugadores){
            System.out.println("Turno de " + jugador.getNombre() + "Desea pedir carta adicional? (S/N)");
            String respuesta;

        }
    }

}
