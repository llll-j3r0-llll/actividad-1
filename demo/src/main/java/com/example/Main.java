package com.example;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Lionel Messi", 33, "Delantero", 10, "Barcelona");
        Jugador jugador2 = new Jugador("Cristiano Ronaldo", 35, "Delantero", 7, "Juventus");
  
        jugador1.mostrarinformacion();
        jugador2.mostrarinformacion();

        jugador1.setEquipo("PSG");
        jugador2.setEquipo("Manchester United");


    }

}