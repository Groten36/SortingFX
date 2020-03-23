package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import sorting.FloatElement;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
   ObservableList<String> algorithms= FXCollections.observableArrayList("Pigeonhole sort","Insertion sort","Merge sort");
   public List<FloatElement> list =new ArrayList<>();
   public Button add;
   public Button sort;
   public TextField addName;
   public TextField addValue;
   public ComboBox algorithm;
   public void addElement(){
      FloatElement element = new FloatElement(addName.getText(),Float.parseFloat(addValue.getText()));
      list.add(element);
   }

   public void sort(){

   }

   @Override
   public void initialize(URL url, ResourceBundle resourceBundle) {
      algorithm.setItems(algorithms);

   }
}
