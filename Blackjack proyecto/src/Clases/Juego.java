/*
package Clases;

import java.util.ArrayList;

public class Juego {
    private Mazo mazo;
    private Crupier crupier;
    private ArrayList<Jugador> jugadores;

    public Juego(Mazo mazo, Crupier crupier) {
        this.mazo = mazo;
        this.crupier = crupier;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void iniciarJuego() {
        System.out.println("Antes de empezar, por favor, realiza tu apuesta:");
        for (Jugador jugador : jugadores) {
            jugador.apostar();
        }
        crupier.repartir(mazo, jugadores);
    }

    public void repartirCartasIniciales() {
        crupier.repartir(mazo, jugadores);
    }

    public Crupier getCrupier() {
        return crupier;
    }

    public Mazo getMazo() {
        return mazo;
    }

    public void pedirCartaAdicional(Jugador jugador) {
        String carta = mazo.repartirCarta();
        jugador.recibirCarta(carta);
    }

    public void terminarTurnoJugador() {
        for (Jugador jugador : jugadores) {
            jugador.plantarse();
        }
        crupier.revelarCarta();
    }
}*/
package Clases;

import java.util.ArrayList;

public class Juego {
    private Mazo mazo;
    private Crupier crupier;
    private ArrayList<Jugador> jugadores;

    public Juego(Mazo mazo, Crupier crupier) {
        this.mazo = mazo;
        this.crupier = crupier;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void iniciarJuego() {
        System.out.println("Antes de empezar, por favor, realiza tu apuesta:");
        for (Jugador jugador : jugadores) {
            jugador.apostar();
        }
        crupier.barajar(mazo);
        repartirCartasIniciales();
    }

    public void repartirCartasIniciales() {
        crupier.repartir(mazo, jugadores);
    }

    public void pedirCartaAdicional(Jugador jugador) {
        String carta = mazo.repartirCarta();
        jugador.recibirCarta(carta);
    }

    public void terminarTurnoJugador() {
        crupier.revelarCarta();
        System.out.println("El valor de las cartas del crupier es " + crupier.calcularPuntuacion(mazo));
    }

    public Crupier getCrupier() {
        return crupier;
    }

    public Mazo getMazo() {
        return mazo;
    }
}

