package mainPackage;



import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;


import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * 
 */
public class PuntuacionFinalController implements Initializable{

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private AnchorPane ScenePane;
    
    public void pulsarBotonRegresar(ActionEvent click) throws IOException{
  
        Alert alertaClose = new Alert(Alert.AlertType.CONFIRMATION);
        alertaClose.setTitle("Flip 7");
        
        

        alertaClose.setHeaderText("¿Estas seguro que deseas salir de la aplicacion?");
        
        if(alertaClose.showAndWait().get() == ButtonType.OK){
            stage = (Stage) ScenePane.getScene().getWindow();
        
            stage.close();
        }
    }

    @FXML
    private Label puntuacion1;
    @FXML
    private Label puntuacion2;
    @FXML
    private Label puntuacion3;
    @FXML
    private Label puntuacion4;
    @FXML
    private Label puntuacion5;
    @FXML
    private Label puntuacion6;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Jugador> jugadores = JuegoPrincipalController.jugadores;
        ArrayList<Label> posicion = new ArrayList<>();
        posicion.add(puntuacion1);
        posicion.add(puntuacion2);
        posicion.add(puntuacion3);
        posicion.add(puntuacion4);
        posicion.add(puntuacion5);
        posicion.add(puntuacion6);
        
        for(int i = 0; i < jugadores.size(); i++){
            posicion.get(i).setText(i+1 + ". " + jugadores.get(i).alias);

        }
    }
    
}
