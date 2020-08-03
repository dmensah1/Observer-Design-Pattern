package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

    @FXML
    private TextField aaInput;
    @FXML
    private TextField bbInput;
    @FXML
    private Label addLabel;
    @FXML
    private Label multLabel;
    @FXML
    private Label divisionLabel;

    private int aa;
    private int bb;
    ConcreteSubject s;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        s = new ConcreteSubject();
        Multiplications multiply = new Multiplications(s);
        Additions add = new Additions(s);
        Divisions divide = new Divisions(s);
    }

    @FXML
    public void saveButtonClicked(ActionEvent event) {
        aa = Integer.parseInt(aaInput.getText());
        bb = Integer.parseInt(bbInput.getText());
        s.setState(aa, bb);
        DisplayResults();
    }

    private void DisplayResults(){
        int[] results = s.getResults();
        multLabel.setText("The Multiplication is: " + results[0]);
        addLabel.setText("The Addition is: " + results[1]);
        divisionLabel.setText("The Division is: " + results[2]);
    }
}
