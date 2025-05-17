/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPackage;

import java.util.ArrayList;
import java.util.HashSet;
import javafx.scene.image.ImageView;

/**
 *
 * @author USER
 */
public class Jugador {
    ArrayList<ImageView> mano_image = new ArrayList<>();
    
    HashSet<String> mano = new HashSet<>();
    String alias;
    int puntos_mano;
    int modificadores;
    int flip;
    
    int puntuacion;
    boolean retirado;
    
    public Jugador(String alias){
        this.alias = alias;
        this.puntos_mano = 0;
        this.puntuacion = 0;
        this.retirado = false;
        this.flip = 0;
    }
    
    public void recibirCarta(String carta){
        
        if(mano.contains(carta)){
            if(mano.contains("SC")){
                System.out.println("El jugador ha sacado un " + carta + " y  ha gastado su segunda vida");
                mano.remove("SC");
            }
            else{
                this.puntos_mano = 0;
                this.modificadores = 0;
                System.out.println("El jugador ha sacado un " + carta + " y  ha perdido esta ronda");
                this.retirarse();
            }
            
        }
        else{
            if(this.flip >= 7){
                System.out.println("FLIP 7, El jugador tiene 7 cartas numericas y obtiene 15 puntos extra");
                
                modificadores += 15;
            }
            mano.add(carta);
            System.out.println("El jugador ha sacado un " + carta);
            //Tal vez el if no es necesario
            if(carta.startsWith("+")){
                carta = carta.replace("+", "");
                int punto = Integer.parseInt(carta);
                modificadores += punto;
            }
            else{
               int punto = Integer.parseInt(carta);
               this.flip++;
                puntos_mano += punto;  
            }
            
        }
        
        //Sumar la puntuacion correspondiente.
    }

    public void secondChance() {
        mano.add("SC");
        System.out.println("EL JUGADOR HA OBTENIDO UN SECOND CHANCE");
    }
    
    public void X2() {
        mano.add("X2");
        System.out.println("EL JUGADOR HA OBTENIDO UN X2");
    }
    
    public void retirarse(){
        if(mano.contains("X2")){
            puntos_mano *= 2;
        }
        System.out.println("Jugador: " + this.alias + " se retira");
        puntuacion += puntos_mano;
        puntuacion += modificadores;
        puntos_mano = 0;
        modificadores = 0;
        flip = 0;
        
        mano.clear();
        retirado = true;
    }
    
    
}
