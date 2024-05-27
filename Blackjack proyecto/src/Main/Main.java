/*
package Main;

import Clases.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mazo mazo = new Mazo();
        Crupier Jose = new Crupier("Jose", "Patricio", 21);
        Jugador Ismael = new Jugador("Ismael", "Benitez", 20, 3000);

        Juego juego = new Juego(mazo, Jose);
        juego.agregarJugador(Ismael);

        juego.iniciarJuego();

        menu(Ismael, juego, mazo);
    }

    public static void menu(Jugador j1, Juego juego, Mazo mazo) {
        Scanner sc = new Scanner(System.in);
        boolean continuarJuego = true;

        while (continuarJuego) {
            System.out.println("Reparto inicial de cartas: el jugador recibe dos cartas boca arriba y el crupier una boca arriba y otra boca abajo");
            juego.repartirCartasIniciales();

            int puntuacionJugador = j1.calcularPuntuacion(mazo);
            System.out.println("El valor de las dos cartas del jugador es " + puntuacionJugador);

            if (puntuacionJugador > 21) {
                System.out.println("El jugador se ha pasado de 21. Ha perdido.");
                continuarJuego = false;
                break;
            }

            String cartaVisibleCrupier = juego.getCrupier().obtenerPrimeraCartaVisible();
            int valorCartaVisibleCrupier = juego.getMazo().obtenerValorCarta(cartaVisibleCrupier);
            System.out.println("El valor de la carta del crupier es " + valorCartaVisibleCrupier);

            boolean turnoJugador = true;
            while (turnoJugador) {
                System.out.println("-------------------------------");
                System.out.println("1. Pedir una carta adicional");
                System.out.println("2. Plantarse");
                System.out.println("3. Salir del juego");
                System.out.println("--------------------------------");
                System.out.print("Selecciona una opción: ");

                int eleccion = sc.nextInt();

                switch (eleccion) {
                    case 1:
                        juego.pedirCartaAdicional(j1);
                        puntuacionJugador = j1.calcularPuntuacion(mazo);
                        System.out.println("El valor de las cartas del jugador es " + puntuacionJugador);
                        if (puntuacionJugador > 21) {
                            System.out.println("El jugador ha superado 21. Ha perdido.");
                            turnoJugador = false;
                            continuarJuego = false;
                        }
                        break;
                    case 2:
                        turnoJugador = false;
                        break;
                    case 3:
                        turnoJugador = false;
                        continuarJuego = false;
                        System.out.println("Partida terminada.");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                }
            }

            if (continuarJuego) {
                juego.getCrupier().revelarTodasCartas();
                // Aquí puedes agregar la lógica para el turno del crupier y determinar el ganador.
            }

            if (continuarJuego) {
                System.out.println("¿Deseas jugar otra ronda? 1 - Sí | 2 - No");
                int respuesta = sc.nextInt();
                if (respuesta != 1) {
                    continuarJuego = false;
                }
            }
        }

        System.out.println("¡Gracias por jugar!");
    }
}
*/
package Main;

import Clases.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mazo mazo = new Mazo();
        Crupier Jose = new Crupier("Jose", "Patricio", 21);
        Jugador Ismael = new Jugador("Ismael", "Benitez", 20, 3000);

        Juego juego = new Juego(mazo, Jose);
        juego.agregarJugador(Ismael);

        juego.iniciarJuego();

        menu(Ismael, juego, mazo);
    }

    public static void menu(Jugador j1, Juego juego, Mazo mazo) {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        boolean continuarJuego = true;

        while (continuarJuego) {
            System.out.println("Reparto inicial de cartas: el jugador recibe dos cartas boca arriba y el crupier una boca arriba y otra boca abajo");

            int puntuacionJugador = j1.calcularPuntuacion(mazo);
            System.out.println("El valor de las dos cartas del jugador es " + puntuacionJugador);

            if (puntuacionJugador > 21) {
                System.out.println("El jugador se ha pasado de 21. Ha perdido.");
                continuarJuego = false;
                break;
            }

            String cartaVisibleCrupier = juego.getCrupier().obtenerPrimeraCartaVisible();
            int valorCartaVisibleCrupier = juego.getMazo().obtenerValorCarta(cartaVisibleCrupier);
            System.out.println("El valor de la carta del crupier es " + valorCartaVisibleCrupier);

            boolean turnoJugador = true;
            while (turnoJugador) {
                System.out.println("-------------------------------");
                System.out.println("1. Pedir una carta adicional");
                System.out.println("2. Plantarse");
                System.out.println("3. Salir del juego");
                System.out.println("--------------------------------");
                System.out.print(" \nSelecciona una opción: ");

                eleccion = sc.nextInt();

                switch (eleccion) {
                    case 1:
                        juego.pedirCartaAdicional(j1);
                        puntuacionJugador = j1.calcularPuntuacion(mazo);
                        System.out.println("El valor de las cartas del jugador es " + puntuacionJugador);
                        if (puntuacionJugador > 21) {
                            System.out.println("El jugador ha superado 21. Ha perdido.");
                            turnoJugador = false;
                            continuarJuego = false;
                        }
                        break;
                    case 2:
                        turnoJugador = false;
                        break;
                    case 3:
                        turnoJugador = false;
                        continuarJuego = false;
                        System.out.println("Partida terminada.");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                }
            }

            if (continuarJuego) {
                juego.terminarTurnoJugador();

                int puntuacionCrupier = juego.getCrupier().calcularPuntuacion(juego.getMazo());
                System.out.println("La puntuacion total del crupier es " + puntuacionCrupier);

                if (puntuacionCrupier > 21 || puntuacionJugador > puntuacionCrupier) {
                    System.out.println("¡El jugador ha ganado!");
                } else if (puntuacionJugador == puntuacionCrupier) {
                    System.out.println("Empate.");
                } else {
                    System.out.println("El crupier ha ganado.");
                }
            }

            if (continuarJuego) {
                System.out.println("¿Deseas jugar otra ronda? 1 - Sí | 2 - No");
                int respuesta = sc.nextInt();
                if (respuesta != 1) {
                    continuarJuego = false;
                } else {
                    juego.iniciarJuego();
                }
            }
        }

        System.out.println("¡Gracias por jugar!");
    }
}
