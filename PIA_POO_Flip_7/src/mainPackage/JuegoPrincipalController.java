
package mainPackage;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * 
 */
public class JuegoPrincipalController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void pulsarBotonPuntuacionFinal(ActionEvent click) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/PuntuacionFinal.fxml"));
        stage = (Stage) ((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
