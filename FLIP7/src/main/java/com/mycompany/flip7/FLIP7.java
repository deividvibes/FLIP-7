/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flip7;

/**
 *
 * @author USER
 */
public class FLIP7 {

    public static void main(String[] args) {
        Juego run = new Juego();
        Jugador j1 = new Jugador("David");
        run.agregarJugador(j1);
        run.hitJugador(j1);
        run.hitJugador(j1);
        run.hitJugador(j1);
        run.hitJugador(j1);
        run.hitJugador(j1);
        run.hitJugador(j1);
        j1.retirarse();
    }
}
