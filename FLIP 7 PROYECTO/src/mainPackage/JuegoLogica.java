/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class JuegoLogica {
    Mazo mazo = new Mazo();
    ArrayList<Jugador> jugadores = new ArrayList<>();
    //HashSet<Jugador> jugadores = new HashSet<>();
    
    
    //Variables utiles para aplicar efectos a otro jugador(FT o FZ)
    
    //ESTA LOGICA TENDRA QUE CAMBIAR AL USAR INTERFAZ
    Jugador j2 = null;
    Scanner sc = new Scanner(System.in);
    String aliasBuscado;
    
    //
    boolean rondaActiva;
    String tomarRetirar;
    
    public String hitJugador(Jugador j){
        //https://www.w3schools.com/java/java_switch.asp
        //Verificar que no se haya retirado, que exista
        //llamar al metodo tomarcarta de jugador y de mazo
        String carta = mazo.tomarCarta();
        switch(carta){
                case "SC":
                    j.secondChance();
                    break;
                case "X2":
                    j.X2();
                    break;
                case "FT":
                    j2 = null;
                    System.out.println("Elegir a que jugador ponerle el flip three");

                    aliasBuscado = sc.nextLine();
                    for(Jugador pj:jugadores){
                        if(pj.alias.equals(aliasBuscado)){
                            j2 = pj;
                        }
                    }
                   //tirar excepcion si j2 es null
                    int i = 0;
                    while(!j2.retirado && i < 3){
                        hitJugador(j2);
                        i++;
                    }
                    break;
                case "FZ":
                    j2 = null;
                    System.out.println("Elegir a que jugador ponerle el freeze");
                    aliasBuscado = sc.nextLine();
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
        return carta;
    }
    
    /**
     *
     * @param j Jugador que será añadido a la partida
     * 
     */
    public void agregarJugador(Jugador j){
        //que no se repita el alias
        jugadores.add(j);
        System.out.println(j.alias.toUpperCase() + " Se ha unido a la mesa.");
    }
    


    
    public ArrayList<Jugador> puntuacionFinal(){
        Comparator JC = new JugadorComparator();
        
        jugadores.sort(JC);
        return jugadores;
    }
}
