package employeegui;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EmployeeGUI extends Application {
    static ArrayList<Employee> employeesArrList;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        employeesArrList= new ArrayList<Employee>(); 
        launch(args);
    }
    
}
