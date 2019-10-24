package orz.doublexi.clazz07;

import java.net.URL;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HostServices host=getHostServices();
		host.showDocument("http://www.baidu.com");
		URL url = ClassLoader.getSystemClassLoader().getResource("temp.png");
		Button button=new Button("按钮");	
		button.setPrefWidth(100);
		button.setPrefHeight(30);
		Group group=new Group();
		group.getChildren().add(button);
		Scene scene=new Scene(group);
//		scene.setCursor(Cursor.HAND);
		scene.setCursor(Cursor.cursor(url.toString()));
		System.out.println(url.toString());
		primaryStage.setScene(scene);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
		primaryStage.setFullScreen(true);
	}

}
