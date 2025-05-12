/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flip7;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Juego {
    Mazo mazo = new Mazo();
    
    HashSet<Jugador> jugadores = new HashSet<>();
    
    
    //Variables utiles para aplicar efectos a otro jugador(FT o FZ)
    Jugador j2 = null;
    Scanner buscarPJ = new Scanner(System.in);
    String aliasBuscado;
    
    
    public void hitJugador(Jugador j){
        //https://www.w3schools.com/java/java_switch.asp
        //Verificar que no se haya retirado, que exista
        //llamar al metodo tomarcarta de jugador y de mazo
        String carta = mazo.tomarCarta();
        switch(carta){
                case "SC":
                    j.secondChance();
                    break;
                case "FT":
                    j2 = null;
                    System.out.println("Elegir a que jugador ponerle el flip three");

                    aliasBuscado = buscarPJ.nextLine();
                    for(Jugador pj:jugadores){
                        if(pj.alias.equals(aliasBuscado)){
                            j2 = pj;
                        }
                    }
                   //tirar excepcion si j2 es null
                    int i = 0;
                    while(!j2.retirado && i < 3){
                        hitJugador(j2);
                    }
                    break;
                case "FZ":
                    j2 = null;
                    System.out.println("Elegir a que jugador ponerle el flip three");
                    aliasBuscado = buscarPJ.nextLine();
                    for(Jugador pj:jugadores){
                        if(pj.alias.equals(aliasBuscado)){
                            j2 = pj;
                        }
                    }
                   //tirar excepcion si j2 es null
                    j2.retirarse();
                    break;
                
                default:
                    j.recibirCarta(carta);
        }
    }
    
    public void agregarJugador(Jugador j){
        //que no se repita el alias
        jugadores.add(j);
        System.out.println(j.alias + " Se ha unido a la mesa.");
    }
    
    
    public void reiniciarRonda(){
        
    }
    
    public void puntuacionFinal(){
        
    }
}
