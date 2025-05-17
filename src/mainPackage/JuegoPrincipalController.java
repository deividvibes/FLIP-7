
package mainPackage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * 
 */
public class JuegoPrincipalController implements Initializable{
    private Stage stage;
    private Scene scene;
    private Parent root;
    Mazo mazo = new Mazo();
    JuegoLogica run;
    
    public void pulsarBotonPuntuacionFinal(ActionEvent click) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/PuntuacionFinal.fxml"));
        stage = (Stage) ((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    static Jugador jugadorEnTurno; 
    
    public void tomarCarta(ActionEvent click){

            String cartaS = run.hitJugador(jugadorEnTurno);
            Image carta = new Image(cartaS +".png");
            jugadorEnTurno.mano_image.get(jugadorEnTurno.mano.size()-1).setImage(carta);

            this.pasarTurno();
        
    }
    
    @FXML
    private Label manoAlias1;
    @FXML
    private Label manoAlias2;
    @FXML
    private Label manoAlias3;
    @FXML
    private Label manoAlias4;
    @FXML
    private Label manoAlias5;
    @FXML
    private Label manoAlias6;
    @FXML
    private Label LabelTurno;
    
    boolean rondaActiva;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ArrayList<ArrayList<ImageView>> manos = this.setupManos();
        
        
        run = new JuegoLogica();
        
        ArrayList<DatosJugador> ListDatos = SeleccionarJugadoresController.getListDatos();
        ArrayList<Label> manoAlias = new ArrayList<>();
        manoAlias.add(manoAlias1);
        manoAlias.add(manoAlias2);
        manoAlias.add(manoAlias3);
        manoAlias.add(manoAlias4);
        manoAlias.add(manoAlias5);
        manoAlias.add(manoAlias6);
        
        Jugador PlayerPH;
        for(DatosJugador p:ListDatos){
            if(!p.getLabel().getText().isEmpty()){
                manoAlias.get(ListDatos.indexOf(p)).setText("MANO DE " + p.getLabel().getText().toUpperCase());
                manoAlias.get(ListDatos.indexOf(p)).setTextFill(p.getLabel().getTextFill());
                PlayerPH = new Jugador(p.getLabel().getText());
                PlayerPH.mano_image = manos.get(ListDatos.indexOf(p));
                run.agregarJugador(PlayerPH);
            }
        }
        jugadorEnTurno = run.jugadores.get(0);
        
  
    }
    public void pasarTurno(){
        
    }
    
    @FXML
    private ImageView Hand11;
    @FXML
    private ImageView Hand12;
    @FXML
    private ImageView Hand13;
    @FXML
    private ImageView Hand14;
    @FXML
    private ImageView Hand15;
    @FXML
    private ImageView Hand16;
    @FXML
    private ImageView Hand17;
    @FXML
    private ImageView Hand18;
    @FXML
    private ImageView Hand19; 
    @FXML
    private ImageView Hand110;
    @FXML
    private ImageView Hand111;
    
    @FXML
    private ImageView Hand21;
    @FXML
    private ImageView Hand22;
    @FXML
    private ImageView Hand23;
    @FXML
    private ImageView Hand24;
    @FXML
    private ImageView Hand25;
    @FXML
    private ImageView Hand26;
    @FXML
    private ImageView Hand27;
    @FXML
    private ImageView Hand28;
    @FXML
    private ImageView Hand29; 
    @FXML
    private ImageView Hand210;
    @FXML
    private ImageView Hand211;
    
    @FXML
    private ImageView Hand31;
    @FXML
    private ImageView Hand32;
    @FXML
    private ImageView Hand33;
    @FXML
    private ImageView Hand34;
    @FXML
    private ImageView Hand35;
    @FXML
    private ImageView Hand36;
    @FXML
    private ImageView Hand37;
    @FXML
    private ImageView Hand38;
    @FXML
    private ImageView Hand39; 
    @FXML
    private ImageView Hand310;
    @FXML
    private ImageView Hand311;

    @FXML
    private ImageView Hand41;
    @FXML
    private ImageView Hand42;
    @FXML
    private ImageView Hand43;
    @FXML
    private ImageView Hand44;
    @FXML
    private ImageView Hand45;
    @FXML
    private ImageView Hand46;
    @FXML
    private ImageView Hand47;
    @FXML
    private ImageView Hand48;
    @FXML
    private ImageView Hand49; 
    @FXML
    private ImageView Hand410;
    @FXML
    private ImageView Hand411;
    
    @FXML
    private ImageView Hand51;
    @FXML
    private ImageView Hand52;
    @FXML
    private ImageView Hand53;
    @FXML
    private ImageView Hand54;
    @FXML
    private ImageView Hand55;
    @FXML
    private ImageView Hand56;
    @FXML
    private ImageView Hand57;
    @FXML
    private ImageView Hand58;
    @FXML
    private ImageView Hand59; 
    @FXML
    private ImageView Hand510;
    @FXML
    private ImageView Hand511;
    
    @FXML
    private ImageView Hand61;
    @FXML
    private ImageView Hand62;
    @FXML
    private ImageView Hand63;
    @FXML
    private ImageView Hand64;
    @FXML
    private ImageView Hand65;
    @FXML
    private ImageView Hand66;
    @FXML
    private ImageView Hand67;
    @FXML
    private ImageView Hand68;
    @FXML
    private ImageView Hand69; 
    @FXML
    private ImageView Hand610;
    @FXML
    private ImageView Hand611;
    
    
    //https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
    private ArrayList<ArrayList<ImageView>> setupManos() {
        ArrayList<ImageView> mano1 = new ArrayList<>(Arrays.asList(Hand11,Hand12,Hand13,Hand14,Hand15,Hand16,Hand17,Hand18,Hand19,Hand110,Hand111));
        ArrayList<ImageView> mano2 = new ArrayList<>(Arrays.asList(Hand21,Hand22,Hand23,Hand24,Hand25,Hand26,Hand27,Hand28,Hand29,Hand210,Hand211));
        ArrayList<ImageView> mano3 = new ArrayList<>(Arrays.asList(Hand31,Hand32,Hand33,Hand34,Hand35,Hand36,Hand37,Hand38,Hand39,Hand310,Hand311));
        ArrayList<ImageView> mano4 = new ArrayList<>(Arrays.asList(Hand41,Hand42,Hand43,Hand44,Hand45,Hand46,Hand47,Hand48,Hand49,Hand410,Hand411));
        ArrayList<ImageView> mano5 = new ArrayList<>(Arrays.asList(Hand51,Hand52,Hand53,Hand54,Hand55,Hand56,Hand57,Hand58,Hand59,Hand510,Hand511));
        ArrayList<ImageView> mano6 = new ArrayList<>(Arrays.asList(Hand61,Hand62,Hand63,Hand64,Hand65,Hand66,Hand67,Hand68,Hand69,Hand610,Hand611));
        
        ArrayList<ArrayList<ImageView>> manos = new ArrayList<>(Arrays.asList(mano1,mano2,mano3,mano4,mano5,mano6));
        return manos;
    }

    
}
