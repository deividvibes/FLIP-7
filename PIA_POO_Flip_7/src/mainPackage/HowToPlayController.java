
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
 * @author USER
 */
public class HowToPlayController{
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void pulsarBotonRegresar(ActionEvent click) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/MenuPrincipal.fxml"));
        stage = (Stage) ((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
