/*
package Clases;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<String> cartasDisponibles;
    private String[] cartas = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Mazo() {
        cartasDisponibles = new ArrayList<>();
        inicializarMazo();
        barajar();
    }

    private void inicializarMazo() {
        Collections.addAll(cartasDisponibles, cartas);
    }

    public void barajar() {
        Collections.shuffle(cartasDisponibles);
    }

    public String repartirCarta() {
        if (cartasDisponibles.isEmpty()) {
            throw new IllegalStateException("No hay cartas disponibles en el mazo.");
        }
        return cartasDisponibles.remove(0);
    }

    public int obtenerValorCarta(String carta) {
        if (carta.equals("As")) {
            return 1; // Valor fijo para el As
        } else if (carta.equals("J") || carta.equals("Q") || carta.equals("K")) {
            return 10;
        } else {
            return Integer.parseInt(carta);
        }
    }
}*/
package Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Mazo {
    private HashMap<String, Integer> valorCartas;
    private String[] cartas = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private ArrayList<String> cartasDisponibles;

    public Mazo() {
        cartasDisponibles = new ArrayList<>();
        valorCartas = new HashMap<>();
        inicializarMazo();
        barajar();
    }

    private void inicializarMazo() {
        for (String carta : cartas) {
            int valor;
            switch (carta) {
                case "J":
                case "Q":
                case "K":
                    valor = 10;
                    break;
                case "As":
                    valor = 1;
                    break;
                default:
                    valor = Integer.parseInt(carta);
            }
            valorCartas.put(carta, valor);
            cartasDisponibles.add(carta);
        }
    }

    public void barajar() {
        Collections.shuffle(cartasDisponibles);
    }

    public String repartirCarta() {
        if (cartasDisponibles.isEmpty()) {
            throw new IllegalStateException("No hay cartas disponibles en el mazo.");
        }
        return cartasDisponibles.remove(0);
    }

    public int obtenerValorCarta(String carta) {
        return valorCartas.get(carta);
    }
}