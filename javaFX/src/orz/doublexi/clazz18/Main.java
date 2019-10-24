package orz.doublexi.clazz18;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane root=new GridPane();
		Button b01=new Button("按钮");
		Button b02=new Button("按钮");
		Button b03=new Button("按钮");
		Button b04=new Button("按钮");
		Button b05=new Button("按钮");
root.add(b01, 0, 0);		
root.add(b02, 1, 0);		
root.add(b03, 2, 0);		
root.add(b04, 3, 0);		
root.setConstraints(b05, 3, 3);
root.getChildren().add(b05);

		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
primaryStage.show();		
	}

}
