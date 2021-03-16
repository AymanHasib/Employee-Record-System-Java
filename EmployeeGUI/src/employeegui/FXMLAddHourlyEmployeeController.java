package employeegui;

import static employeegui.EmployeeGUI.employeesArrList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLAddHourlyEmployeeController implements Initializable {
    @FXML 
    private Button addHESubmitBtn;
    @FXML 
    private Button addHEClearBtn;
    @FXML 
    private Button addHEBackBtn; 
    @FXML 
    private TextField idTF;
    @FXML 
    private TextField nameTF; 
    @FXML 
    private TextField desgTF;  
    @FXML 
    private TextField hwTF;
    @FXML 
    private TextField hrTF;
    @FXML 
    private TextField subTF;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML 
    private Button backHomeBtn;
    
    @FXML
    private void backAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLAddEmployee.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();                
    }
    @FXML
    private void backHomeAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();               
    }
     @FXML
    private void clearAction(ActionEvent event) throws IOException {
        idTF.setText("");
        nameTF.setText("");
        desgTF.setText("");
        hwTF.setText("");
        hrTF.setText("");
        label1.setText("");
        label2.setText("");
    }
    @FXML
    private void submitAction(ActionEvent event) throws IOException {
        String id=idTF.getText();
        String name=nameTF.getText();
        String desg=desgTF.getText();
        double hw=Double.parseDouble(hwTF.getText());
        double hr=Double.parseDouble(hrTF.getText());
        Employee e = new HourlyEmployee(name,id,desg,hr,hw);
        employeesArrList.add(e);
        //subTF.setText("Submit Successful");
        label1.setText("\"Submitted Successfully\"");
        label2.setText("\"Press Clear Button to Add Another Employee\"");
    } 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }        
}
