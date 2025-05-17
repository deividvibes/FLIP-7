package mainPackage;

/**
 * Instalacion y setup de javafx:
 *  https://www.youtube.com/watch?v=ej5YrLYtLF0
 */



/**
 * Manejo de javafx obtenido de:
 *  https://youtu.be/9XJicRt_FaI?si=f1ay-y5za2t-O_wR
 */

import javafx.application.Application;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

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

    @FXML
    private AnchorPane ScenePane;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/MenuPrincipal.fxml"));

        Scene scene = new Scene(root);
        
        /**
        * Asignamos el icono para nuestra aplicacion. Obtenido de la pagina oficial
        * https://flip7-46611.web.app/
        */
        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
        
        stage.setTitle("FLIP 7");
        
        
        stage.setScene(scene);
        stage.show();
        
        
    }
    
}
