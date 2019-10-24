package orz.doublexi.clazz24;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application{
public static void main(String[] args) {
	launch(args);
	
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Label name=new Label("account:");
		Label password=new Label("password");
		TextField textField=new TextField();
		PasswordField pwdField=new PasswordField();
		Button login=new Button("Login");
		Button clear=new Button("Clear");
		GridPane root=new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(5);
		root.setVgap(15);
		root.add(name, 0, 0);
		root.add(textField, 1, 0);
		root.add(password, 0, 1);
		root.add(pwdField, 1, 1);
		root.add(login, 0, 2);
		root.add(clear, 1, 2);
		root.setMargin(clear, new Insets(0, 0, 0, 20));
		root.setMargin(login, new Insets(0, 0, 0, 20));
		
		
		root.setStyle("-fx-background-color:#FFEBCD");
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setWidth(500);
		primaryStage.setHeight(300);
		primaryStage.setTitle("login");
		primaryStage.setResizable(false);
		primaryStage.show();
		textField.requestFocus();
		
		login.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(textField.getText().equals("root")&&pwdField.getText().equals("root")) {
					
				}
			}
		});
		clear.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				textField.clear();
				pwdField.clear();
				
			}
		});
	}

}
