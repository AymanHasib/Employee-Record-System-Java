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
import javafx.stage.Stage;

public class FXMLAddEmployeeController implements Initializable {
    @FXML 
    private Button addSEBtn;
    @FXML 
    private Button addHEBtn;
    @FXML 
    private Button addCEBtn;
    @FXML 
    private Button addEmpBackBtn; 
    
    @FXML
    private void addSEAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLAddSalariedEmployee.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();                
    }
    @FXML
    private void addHEAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLAddHourlyEmployee.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();                
    }
    @FXML
    private void addCEAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLAddComissionEmployee.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();               
    }
    @FXML
    private void backAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
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
