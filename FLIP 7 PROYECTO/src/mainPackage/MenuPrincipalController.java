
package mainPackage;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * 
 */
public class MenuPrincipalController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void pulsarBotonJugar(ActionEvent click) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/SeleccionarJugadores.fxml"));
        stage = (Stage) ((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pulsarBotonHowToPlay(ActionEvent click) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/HowToPlay.fxml"));
        stage = (Stage) ((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    

    
    @FXML
    private AnchorPane ScenePane;
    
    public void pulsarBotonSalir(ActionEvent click){

        Alert alertaClose = new Alert(AlertType.CONFIRMATION);
        alertaClose.setTitle("Flip 7");
        
        

        alertaClose.setHeaderText("¿Estas seguro que deseas salir de la aplicacion?");
        
        if(alertaClose.showAndWait().get() == ButtonType.OK){
            stage = (Stage) ScenePane.getScene().getWindow();
        
            stage.close();
        }
        
        
    }

}
