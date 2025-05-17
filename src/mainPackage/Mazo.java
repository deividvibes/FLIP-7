/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author USER
 */
public class Mazo implements IOperacionesCartas{
    //Este mapa sera de donde iremos sacando cartas
    HashMap<String, Integer> deck = new HashMap<>();
    
    //Al llegar a 0,
    int total_cartas;
    
    //cuando se agote el mazo, esta variable nos ayudara a inicializarlo mas rapido.
    HashMap<String, Integer> descarte;
    
    //En lugar de hacer shuffle, es posible ir añadiendo a un mapa las cartas descartadas.
    //asi, nos ahorramos el eliminar las cartas de la mano de cada jugador.
    
    public Mazo(){
        deck.put("0", 1);
        deck.put("1", 1);
        deck.put("2", 2);
        deck.put("3", 3);
        deck.put("4", 4);
        deck.put("5", 5);
        deck.put("6", 6);
        deck.put("7", 7);
        deck.put("8", 8);
        deck.put("9", 9);
        deck.put("10", 10);
        deck.put("11", 11);
        deck.put("12", 12);
        deck.put("SC", 0);
        deck.put("FT", 0);
        deck.put("FZ", 0);
        deck.put("+2", 1);
        deck.put("+4", 1);
        deck.put("+6", 1);
        deck.put("+8", 1);
        deck.put("+10", 1);
        deck.put("X2", 1);
        //shuffle = (HashMap<String, Integer>) deck.clone();

        total_cartas = 94;
    }

    @Override
    public String tomarCarta() {
        if(total_cartas == 0){
            this.restaurarMazo();
            for(Integer i:deck.values()){
                total_cartas += i;
            }
        }
        

        ArrayList<String> disponibles = new ArrayList<>();
        for(String s:deck.keySet()){
            if(deck.get(s) > 0){
                disponibles.add(s);
            }
        }
        //https://www.geeksforgeeks.org/generating-random-numbers-in-java/
        Random r = new Random();
        
        int i = r.nextInt(disponibles.size());
        
        String carta = disponibles.get(i);
        int cartas_restantes = deck.get(carta);
        cartas_restantes--;
        deck.replace(carta, cartas_restantes);
                
        return carta;
    }

    @Override
    public void restaurarMazo() {
        //https://www.geeksforgeeks.org/hashmap-clone-method-in-java/
        deck  = (HashMap<String, Integer>) descarte.clone();
        descarte.clear();
        //Eliminar las cartas que esten en las manos de los jugadores
    }
    
}
