package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {
@Override
public void start(Stage primaryStage) {
primaryStage.setTitle("JavaFX Welcome");
GridPane grid = new GridPane();
// à compléter 
Button btn=new  Button ("sign in ");
final Text actiontarget = new Text();
grid.add(actiontarget, 1, 6);
btn.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent e) {
actiontarget.setFill(Color.FIREBRICK);
actiontarget.setText("Sign in button pressed"); } });
// à completer
}
public static void main(String[] args) {
launch(args); }}