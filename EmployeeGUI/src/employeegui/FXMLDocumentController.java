package employeegui;

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
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML 
    private Button addEmployeeBtn;
    @FXML 
    private Button searchEmployeeBtn;
    @FXML 
    private Button increseSalaryBtn;
    @FXML 
    private Button displayEmployeeBtn;   
    @FXML
    private void addEmployeeAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLAddEmployee.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();               
    }
    @FXML
    private void searchEmployeeAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLFindEmployee.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();               
    }   
    @FXML
    private void increseSalaryAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLIncreseSalary.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();                
    }
    @FXML
    private void displayEmployeeAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDisplayEmployee.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();                
    }   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
