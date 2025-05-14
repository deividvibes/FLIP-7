package mainPackage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 
 */

/**
 * Proyecto Integrador de Aprendizaje para Programacion Orientada a Objetos
 * 
 * Este proyecto lo hice por mi amor a los juegos de mesa y mis ganas de hacer un buen juego
 * que aprovechara todas las capacidades de una computadora, resultando no solo en un juego funcional
 * sino en un juego emocionante y divertido
 * 
 * A mis papás, mi novia, mis amigos; todos los que alguna vez se sienten a jugar conmigo
 * 
 * version 1.0
 * @author David Elías Hernández Arellano
 */
public class main extends Application{
    /**
    * 
     * @param args es la entrada de argumentos del usuario
    */
    public static void main(String[] args) {
        /**
        * Este metodo recibe la variable args y hace que nuestra aplicacion comience
        */
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,Color.CADETBLUE);
        
        /**
        * 
        */
        Image icon = new Image("icon.png");
        
        stage.getIcons().add(icon);
        
        stage.setTitle("FLIP 7");
        
        stage.setScene(scene);
        stage.show();
    }
    
}
