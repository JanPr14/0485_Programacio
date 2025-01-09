package programacio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Carta {
    private String pal;
    private String valor;

    public Carta(String pal, String valor) {
        this.pal = pal;
        this.valor = valor;
    }

    public int obtenirValor() {
        switch (valor) {
            case "A": return 11; // L'As pot valer 1 o 11, però ajustarem a 1 si és necessari
            case "K":
            case "Q":
            case "J": return 10;
            default: return Integer.parseInt(valor);
        }
    }

    @Override
    public String toString() {
        return valor + " de " + pal;
    }
}

class Baralla {
    private ArrayList<Carta> cartes;

    public Baralla() {
        String[] pals = {"Cors", "Diamants", "Trèvols", "Piques"};
        String[] valors = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cartes = new ArrayList<>();

        for (String pal : pals) {
            for (String valor : valors) {
                cartes.add(new Carta(pal, valor));
            }
        }
        Collections.shuffle(cartes);
    }

    public Carta treureCarta() {
        return cartes.remove(0);
    }
}

class Jugador {
    private ArrayList<Carta> ma;
    private int puntuacio;

    public Jugador() {
        ma = new ArrayList<>();
        puntuacio = 0;
    }

    public void agafarCarta(Carta carta) {
        ma.add(carta);
        actualitzarPuntuacio();
    }

    private void actualitzarPuntuacio() {
        puntuacio = 0;
        int asos = 0;

        for (Carta carta : ma) {
            puntuacio += carta.obtenirValor();
            if (carta.obtenirValor() == 11) asos++;
        }

        while (puntuacio > 21 && asos > 0) {
            puntuacio -= 10; // Canviem l'As d'11 a 1
            asos--;
        }
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public Carta obtenirPrimeraCarta() {
        return ma.get(0);
    }

    public void mostrarMa() {
        for (Carta carta : ma) {
            System.out.println(carta);
        }
        System.out.println("Puntuació: " + puntuacio);
    }
}

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baralla baralla = new Baralla();

        Jugador jugador = new Jugador();
        Jugador crupier = new Jugador();

        // Repartim dues cartes al jugador i al crupier
        jugador.agafarCarta(baralla.treureCarta());
        jugador.agafarCarta(baralla.treureCarta());
        crupier.agafarCarta(baralla.treureCarta());
        crupier.agafarCarta(baralla.treureCarta());

        System.out.println("La teva mà:");
        jugador.mostrarMa();

        System.out.println("\nMà del crupier:");
        System.out.println(crupier.obtenirPrimeraCarta()); // Mostrar només una carta del crupier
        System.out.println("Carta oculta");

        // Torn del jugador
        while (jugador.getPuntuacio() < 21) {
            System.out.print("\nVols 'demanar' o 'plantar-te'? ");
            String accio = scanner.nextLine().toLowerCase();

            if (accio.equals("demanar")) {
                jugador.agafarCarta(baralla.treureCarta());
                System.out.println("\nLa teva mà:");
                jugador.mostrarMa();
            } else {
                break;
            }
        }

        // Verificar si el jugador ha superat 21
        if (jugador.getPuntuacio() > 21) {
            System.out.println("Has superat els 21. Perds!");
            return;
        }

        // Torn del crupier
        System.out.println("\nMà del crupier:");
        crupier.mostrarMa();

        while (crupier.getPuntuacio() < 17) {
            crupier.agafarCarta(baralla.treureCarta());
            System.out.println("\nMà del crupier:");
            crupier.mostrarMa();
        }

        // Resultat final
        if (crupier.getPuntuacio() > 21 || jugador.getPuntuacio() > crupier.getPuntuacio()) {
            System.out.println("\nEnhorabona, has guanyat!");
        } else if (jugador.getPuntuacio() == crupier.getPuntuacio()) {
            System.out.println("\nÉs un empat.");
        } else {
            System.out.println("\nHo sento, el crupier ha guanyat.");
        }

        scanner.close();
    }
}
