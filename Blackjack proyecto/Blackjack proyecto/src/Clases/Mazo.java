package Clases;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Mazo {
   private ArrayList<Integer> cartas;
   private HashMap<String, Integer> valorCartas;


    public Mazo(){
        ArrayList<String> barajar = new ArrayList<>();
        HashMap<String, Integer> valorCartas = new HashMap<>();
        inicializarMazo();
        barajar();
    }



    private void inicializarMazo(){
        for(int i = 1; i <= 13; i++){
            cartas.add(i);
        }
        valorCartas.put("As", 1);
        valorCartas.put("2", 2);
        valorCartas.put("3", 3);
        valorCartas.put("4", 4);
        valorCartas.put("5", 5);
        valorCartas.put("6", 6);
        valorCartas.put("7", 7);
        valorCartas.put("8", 8);
        valorCartas.put("9", 9);
        valorCartas.put("10", 10);
        valorCartas.put("J", 11);
        valorCartas.put("Q", 12);
        valorCartas.put("K", 13);
    }

    public void barajar(){
        Collections.shuffle(cartas);
    }

    public int repartirCarta(){
        if (cartas.isEmpty()){
            throw new IllegalStateException("El mazo está vacío. No hay cartas para repartir");
        }
        int carta = cartas.remove(0);
        return carta;
    }


}
