package orz.doublexi.clazz19;

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
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane root = new StackPane();
		Button b01 = new Button("按钮");
		Button b02 = new Button("按钮");
		Button b03 = new Button("按钮");
		Button b04 = new Button("按钮");
		Button b05 = new Button("按钮5");
		root.getChildren().addAll(b01, b02, b03, b04, b05);
		root.getChildren().forEach((item)->{
			
		});
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
