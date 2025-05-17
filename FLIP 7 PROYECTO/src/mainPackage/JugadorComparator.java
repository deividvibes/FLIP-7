
package mainPackage;

import java.util.Comparator;
//https://www.w3schools.com/java/java_advanced_sorting.asp
/**
 *
 * @author USER
 */
public class JugadorComparator implements Comparator{

    @Override
    public int compare(Object a, Object b) {
        Jugador j1 = (Jugador) a;
        Jugador j2 = (Jugador) b;
        
        if(j1.puntuacion < j2.puntuacion) return 1;
        if(j1.puntuacion > j2.puntuacion) return -1;
        return 0;
        
    }
    
}
