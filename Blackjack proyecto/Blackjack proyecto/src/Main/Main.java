package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mazo mazo = new Mazo();
        Juego juego = new Juego(mazo);

        boolean salir = false;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Repartir una nueva mano");
            System.out.println("2. Pedir una carta adicional");
            System.out.println("3. Quedarse con la mano actual");
            System.out.println("4. Salir del juego");
            System.out.print("Selecciona una opción: ");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    juego.repartirNuevaMano(); //
                    break;
                case 2:
                    juego.pedirCartaAdicional();
                    break;
                case 3:
                    juego.terminarTurnoJugador();
                    break;
                case 4:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        }
    }
}