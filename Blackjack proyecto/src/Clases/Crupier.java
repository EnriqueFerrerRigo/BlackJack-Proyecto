/*
package Clases;

import java.util.ArrayList;

public class Crupier extends Persona {
    private String cartaOculta;

    public Crupier(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public void revelarTodasCartas() {
        for (String carta : mano) {
            System.out.println("Carta del crupier: " + carta);
        }
    }

    @Override
    public void cogerCarta(String carta) {
        recibirCarta(carta);
        System.out.println("El crupier ha recibido la carta: " + carta);
    }

    public void repartir(Mazo mazo, ArrayList<Jugador> jugadores) {
        for (Jugador jugador : jugadores) {
            for (int i = 0; i < 2; i++) {
                String carta = mazo.repartirCarta();
                jugador.cogerCarta(carta);
            }
        }

        String cartaBocaArriba = mazo.repartirCarta();
        cogerCarta(cartaBocaArriba);

        cartaOculta = mazo.repartirCarta();
        System.out.println("El crupier ha recibido una carta oculta.");
    }

    public void darCarta(Jugador jugador, String carta) {
        jugador.recibirCarta(carta);
        System.out.println("El crupier ha dado la carta " + carta + " al jugador " + jugador.getNombre());
    }

    public void barajar(Mazo mazo) {
        mazo.barajar();
    }

    public void revelarCarta() {
        System.out.println("El crupier ha revelado su carta oculta: " + cartaOculta);
    }

    public void setCartaOculta(String carta) {
        this.cartaOculta = carta;
    }

    public String obtenerPrimeraCartaVisible() {
        if (!mano.isEmpty()) {
            return mano.get(0);
        }
        return null;
    }
}
*/
package Clases;

import java.util.ArrayList;

public class Crupier extends Persona {
    private boolean cartaOcultaRevelada = false;
    private String cartaOculta;

    public Crupier(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public void revelarPrimeraCarta() {
        if (!mano.isEmpty()) {
            System.out.println("La carta del crupier es: " + mano.get(0));
        } else {
            System.out.println("El crupier no tiene cartas para revelar.");
        }
    }

    @Override
    public void cogerCarta(String carta) {
        recibirCarta(carta);
        System.out.println("El crupier ha recibido la carta: " + carta);
    }

    public void repartir(Mazo mazo, ArrayList<Jugador> jugadores) {
        for (Jugador jugador : jugadores) {
            for (int i = 0; i < 2; i++) {
                String carta = mazo.repartirCarta();
                jugador.cogerCarta(carta);
            }
        }
        String cartaBocaArriba = mazo.repartirCarta();
        cogerCarta(cartaBocaArriba);

        cartaOculta = mazo.repartirCarta();
        System.out.println("El crupier ha recibido una carta oculta.");
    }

    public void revelarCarta() {
        if (!cartaOcultaRevelada) {
            mano.add(cartaOculta);
            cartaOcultaRevelada = true;
            System.out.println("El crupier ha revelado su carta oculta: " + cartaOculta);
        }
    }
    public void barajar(Mazo mazo){
        mazo.barajar();
    }
    public String obtenerPrimeraCartaVisible() {
        if (!mano.isEmpty()) {
            return mano.get(0);
        }
        return null;
    }
}


