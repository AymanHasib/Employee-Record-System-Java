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

public class FXMLAddComissionEmployeeController implements Initializable {
    @FXML 
    private Button addCESubmitBtn;
    @FXML 
    private Button addCEClearBtn;
    @FXML 
    private Button addCEBackBtn; 
    @FXML 
    private TextField idTF;
    @FXML 
    private TextField nameTF; 
    @FXML 
    private TextField desgTF;  
    @FXML 
    private TextField caTF;
    @FXML 
    private TextField salTF;
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
        caTF.setText("");
        salTF.setText("");
        label1.setText("");
        label2.setText("");
    }
    @FXML
    private void submitAction(ActionEvent event) throws IOException {
        String id=idTF.getText();
        String name=nameTF.getText();
        String desg=desgTF.getText();
        double com=Double.parseDouble(caTF.getText());
        double sale=Double.parseDouble(salTF.getText());
        Employee e = new ComissionEmployee(name,id,desg,com,sale);
        employeesArrList.add(e);
        label1.setText("\"Submitted Successfully\"");
        label2.setText("\"Press Clear Button to Add Another Employee\"");
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }      
}
