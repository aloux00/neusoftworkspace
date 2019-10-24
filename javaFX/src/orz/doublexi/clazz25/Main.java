package orz.doublexi.clazz25;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//类似于超链接一样的东西
public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox box=new VBox();
		Hyperlink hyperlink = new Hyperlink("www.baidu.com");
		box.getChildren().add(hyperlink);
		hyperlink.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
HostServices host=Main.this.getHostServices();
host.showDocument(hyperlink.getText());
			}
		});
		Scene scene=new Scene(box);
		primaryStage.setScene(scene);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
primaryStage.show();		
	}

}
