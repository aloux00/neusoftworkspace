package orz.doublexi.MainFrame;


import java.util.Properties;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import orz.doublexi.util.Utils;

public class LoginFrame extends Application {
	BorderPane root=new BorderPane();
	Label account=new Label("账号:");
	Label pwd=new Label("密码:");
	TextField accountField=new TextField();
	PasswordField pwdField=new PasswordField();
	Button login=new Button("登录");
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane pane=new GridPane();
		pane.setStyle(
				"-fx-border-style:solid;"
				);
		pane.add(account, 1, 1);
		pane.add(pwd, 1, 2);
		pane.add(accountField, 4, 1);
		pane.add(pwdField, 4, 2);
		pane.add(login, 1, 3);
		pane.setPadding(new Insets(0, 10, 0, 10));
		root.setCenter(pane);
		root.setPadding(new Insets(100, 170, 300, 170));
		Scene scene=new Scene(root);
		Stage stage=new Stage();
		stage.setScene(scene);
		stage.setHeight(500);
		stage.setWidth(650);
		stage.show();
		initValue();
	}
	private void initValue() {
		Properties properties = Utils.getProperties();
		accountField.setText((String)properties.get("account"));
		pwdField.setText((String)properties.get("password"));
		
	}

}
