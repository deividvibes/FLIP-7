package mainPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SeleccionarJugadoresController implements Initializable{

    public static ArrayList<DatosJugador> getListDatos() {
        return ListDatos;
    }

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void pulsarBotonAJugar(ActionEvent click) throws IOException{
        
        
        root = FXMLLoader.load(getClass().getResource("/JuegoPrincipal.fxml"));
        stage = (Stage) ((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    

    
    @FXML
    private AnchorPane PlayerData1;
    @FXML
    private AnchorPane PlayerData2;
    @FXML
    private AnchorPane PlayerData3;
    @FXML
    private AnchorPane PlayerData4;
    @FXML
    private AnchorPane PlayerData5;
    @FXML
    private AnchorPane PlayerData6;

    @FXML
    private ChoiceBox<String> PlayerStatus1;
    @FXML
    private ChoiceBox<String> PlayerStatus2;
    @FXML
    private ChoiceBox<String> PlayerStatus3;
    @FXML
    private ChoiceBox<String> PlayerStatus4;
    @FXML
    private ChoiceBox<String> PlayerStatus5;
    @FXML
    private ChoiceBox<String> PlayerStatus6;
    
    private String[] status = {"Desactivado", "Jugador"};
    
    @FXML
    private ToggleButton Listo1;
    @FXML
    private ToggleButton Listo2;
    @FXML
    private ToggleButton Listo3;
    @FXML
    private ToggleButton Listo4;
    @FXML
    private ToggleButton Listo5;
    @FXML
    private ToggleButton Listo6;
    
    @FXML
    private TextField alias1;
    @FXML
    private TextField alias2;
    @FXML
    private TextField alias3;
    @FXML
    private TextField alias4;
    @FXML
    private TextField alias5;
    @FXML
    private TextField alias6;
    
    @FXML
    private ColorPicker color1;
    @FXML
    private ColorPicker color2;
    @FXML
    private ColorPicker color3;
    @FXML
    private ColorPicker color4;
    @FXML
    private ColorPicker color5;
    @FXML
    private ColorPicker color6;
    
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private Label label6;
    
    
    
    //https://openjfx.io/javadoc/11/javafx.graphics/javafx/scene/Node.html#isDisable()
    public void iniciarJugadores(ActionEvent event){
        for(DatosJugador p:getListDatos()){
            if(p.getpStatus().getValue().equals("Desactivado")){
                p.getAlias().clear();
                p.getPanel().setDisable(true);
                p.getListo().setSelected(true);
            }
            else{
                p.getPanel().setDisable(false);
                if(p.getAlias().getCharacters().isEmpty()){
                    p.getListo().setSelected(false);
                }
            }
        }
        todosListos = true;
        for(DatosJugador p:getListDatos()){
            if(!p.getListo().isSelected()){
                todosListos = false;
            }
            else{
                if(p.getAlias().getCharacters().isEmpty() && !p.getPanel().isDisabled() && p.getListo().isSelected()){
                    p.getListo().setSelected(false);
                    todosListos = false;
                }
            }
        }
        if(todosListos){
            BotonAJugar.setDisable(false);
        }
        else{
            BotonAJugar.setDisable(true);
        }

    }
    
    
    private static final ArrayList<DatosJugador> ListDatos = new ArrayList<>();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        getListDatos().add(0, new DatosJugador(PlayerData1, PlayerStatus1, Listo1, alias1, color1, label1));
        getListDatos().add(1, new DatosJugador(PlayerData2, PlayerStatus2, Listo2, alias2, color2, label2));
        getListDatos().add(2, new DatosJugador(PlayerData3, PlayerStatus3, Listo3, alias3, color3, label3));
        getListDatos().add(3, new DatosJugador(PlayerData4, PlayerStatus4, Listo4, alias4, color4, label4));
        getListDatos().add(4, new DatosJugador(PlayerData5, PlayerStatus5, Listo5, alias5, color5, label5));
        getListDatos().add(5, new DatosJugador(PlayerData6, PlayerStatus6, Listo6, alias6, color6, label6));

        for(DatosJugador p:getListDatos()){
            p.getpStatus().getItems().addAll(status);
        }
        
        
        for(DatosJugador p:getListDatos()){
            p.getpStatus().setOnAction(this::iniciarJugadores);
        }
        
    }
    
    @FXML
    private Button BotonAJugar;
    boolean todosListos;
    
    public void botonListo(ActionEvent click){
        
        todosListos = true;
        for(DatosJugador p:getListDatos()){
            if(!p.getListo().isSelected()){
                todosListos = false;
            }
            else{
                if(p.getAlias().getCharacters().isEmpty() && !p.getPanel().isDisabled() && p.getListo().isSelected()){
                    p.getListo().setSelected(false);
                    todosListos = false;
                }
            }
        }
        if(todosListos){
            BotonAJugar.setDisable(false);
        }
        else{
            BotonAJugar.setDisable(true);
        }
        
        
        for(DatosJugador p:getListDatos()){
            if(p.getListo().isSelected()){
                p.getLabel().setText(p.getAlias().getCharacters().toString().toUpperCase());
                p.getLabel().setTextFill(p.getColor().getValue());
                if(!p.getPanel().isDisabled()){
                   p.getColor().setDisable(true);
                   p.getAlias().setDisable(true); 
                }
                
            }
            else{
                p.getLabel().setText("");
                p.getColor().setDisable(false);
                p.getAlias().setDisable(false);
            }
        }
    }
    
    
    
}
