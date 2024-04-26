package Clases;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Mazo {
    //hashmap con los valores de las cartas, As,2,3,4,5,6,7,8,9,10,J,Q,K + array, cuando reparta la carta, que compare el valor con el hashmap
    // arraylist de strings


    public Mazo(){
        ArrayList<String> barajar = new ArrayList<>();
        HashMap<String, Integer> valorCartas = new HashMap<>();
        inicializarMazo();
        barajar();
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



    private void inicializarMazo(){
        for(int i = 1; i <= 13; i++){
            
        }
    }

    public void barajar(){
        Collections.shuffle(mazo);
    }


}
