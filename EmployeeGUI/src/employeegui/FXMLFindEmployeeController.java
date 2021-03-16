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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLFindEmployeeController implements Initializable {
    @FXML 
    private Button addFESubmitBtn;
    @FXML 
    private Button addFEClearBtn;
    @FXML 
    private Button addFEBackBtn; 
    @FXML 
    private TextField idTF;
    @FXML
    private TextArea displayTA;
    @FXML 
    private Button backSEBtn;
    @FXML 
    private Button backHEBtn;
    @FXML 
    private Button backCEBtn;  
    @FXML
    private void backAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();               
    }
    @FXML
    private void backSEAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLAddSalariedEmployee.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();              
    }
    @FXML
    private void backHEAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLAddHourlyEmployee.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();                
    }
    @FXML
    private void backCEAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLAddComissionEmployee.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();               
    }
    @FXML
    private void clearAction(ActionEvent event) throws IOException {
        idTF.setText("");
        displayTA.setText("");        
    }
    @FXML
    private void submitAction(ActionEvent event) throws IOException {
        String id=idTF.getText();
        for(Employee emp: employeesArrList){
            if(emp.getId().equals(id)){
                displayTA.setText(emp.display());
                break;
            }
        }       
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       
}
