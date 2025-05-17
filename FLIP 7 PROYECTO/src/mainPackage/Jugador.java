/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;



/**
 *
 * @author USER
 */
public class Jugador {
    ArrayList<ImageView> mano_image = new ArrayList<>();
    Label puntosL;
    Label Accion;
    Rectangle retiradoCuadro;
    Button botonFlip;
    
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
                Accion.setText("El jugador ha sacado un " + carta + " y  ha gastado su segunda vida");

                mano.remove("SC");
            }
            else{
                this.puntos_mano = 0;
                this.modificadores = 0;
                Accion.setText("El jugador ha sacado un " + carta + " y  ha perdido esta ronda");
                this.retirarse();
            }
            
        }
        else{
            if(this.flip >= 7){
                Accion.setText("FLIP 7, El jugador tiene 7 cartas numericas y obtiene 15 puntos extra");
                
                modificadores += 15;
            }
            mano.add(carta);
            Accion.setText("El jugador ha sacado un " + carta);
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
        Accion.setText("EL JUGADOR HA OBTENIDO UN SECOND CHANCE");
    }
    
    public void X2() {
        mano.add("X2");
        Accion.setText("EL JUGADOR HA OBTENIDO UN X2");
    }
    
    public void retirarse(){

        this.retiradoCuadro.setOpacity(0.20);
        if(mano.contains("X2")){
            puntos_mano *= 2;
        }
        //Accion.setText("Jugador: " + this.alias + " se retira");
        puntuacion += puntos_mano;
        puntuacion += modificadores;
        puntos_mano = 0;
        modificadores = 0;
        flip = 0;
        for(String s:mano){
            
            if(Mazo.descarte.keySet().contains(s)){
                int cant = Mazo.descarte.get(s);
                Mazo.descarte.replace(s, cant+1);
            }
            else{
                Mazo.descarte.put(s, 1);
            }
        }
        
        mano.clear();
        retirado = true;
    }
    
    
}
