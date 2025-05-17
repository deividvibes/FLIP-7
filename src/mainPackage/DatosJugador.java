
package mainPackage;


import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;


public class DatosJugador {

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public AnchorPane getPanel() {
        return panel;
    }

    public ChoiceBox<String> getpStatus() {
        return pStatus;
    }

    public ToggleButton getListo() {
        return listo;
    }

    public TextField getAlias() {
        return alias;
    }

    public ColorPicker getColor() {
        return color;
    }

    public void setPanel(AnchorPane panel) {
        this.panel = panel;
    }

    public void setpStatus(ChoiceBox<String> pStatus) {
        this.pStatus = pStatus;
    }

    public void setListo(ToggleButton listo) {
        this.listo = listo;
    }

    public void setAlias(TextField alias) {
        this.alias = alias;
    }

    public void setColor(ColorPicker color) {
        this.color = color;
    }

    private AnchorPane panel;
    private ChoiceBox<String> pStatus;
    private ToggleButton listo;
    private TextField alias;
    private ColorPicker color;
    private Label label;
    
    public DatosJugador(AnchorPane panel, ChoiceBox<String> pStatus, ToggleButton listo, TextField alias, ColorPicker color, Label label){
        this.panel = panel;
        this.pStatus = pStatus;
        this.listo = listo;
        this.alias = alias;
        this.color = color;
        this.label = label;
    }
}
