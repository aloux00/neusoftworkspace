package orz.doublexi.clazz20;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		TextFlow root =new TextFlow();
		Text b01=new Text("hefffffffffffffffffffffffffffffffffffffffhe");
		b01.setWrappingWidth(20);
		Text b02=new Text("hehe");
		root.getChildren().addAll(b01, b02);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		
		primaryStage.show();
		primaryStage.hide();
primaryStage.close();		
	}

}
