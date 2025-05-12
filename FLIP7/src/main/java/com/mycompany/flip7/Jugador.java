/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flip7;

import java.util.HashSet;

/**
 *
 * @author USER
 */
public class Jugador {
    HashSet<String> mano = new HashSet<>();
    String alias;
    int puntos_mano;
    
    int puntuacion;
    boolean retirado;
    
    public Jugador(String alias){
        this.alias = alias;
        this.puntos_mano = 0;
        this.puntuacion = 0;
        this.retirado = false;
    }
    
    public void recibirCarta(String carta){
        if(mano.contains(carta)){
            if(mano.contains("SC")){
                System.out.println("El jugador ha sacado un " + carta + " y  ha gastado su segunda vida");
            }
            else{
                retirado = true;
                System.out.println("El jugador ha sacado un " + carta + " y  ha perdido esta ronda");
            }
            
        }
        else{
            mano.add(carta);
            System.out.println("El jugador ha sacado un " + carta);
            //Tal vez el if no es necesario
            if(carta.startsWith("+")){
                carta = carta.replace("+", "");
            }
            int punto = Integer.parseInt(carta);
            puntos_mano += punto;
        }
        
        //Sumar la puntuacion correspondiente.
    }

    void secondChance() {
        mano.add("SC");
    }
    
    public void retirarse(){
        System.out.println("Jugador: " + this.alias + " se retira y suma " + this.puntos_mano);
        puntuacion += puntos_mano;
        puntos_mano = 0;
        retirado = true;
    }
    
    
}
