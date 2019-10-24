package orz.doublexi.clazz17;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
//流布局，设置上下左右距离setV和setH
public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FlowPane root=new FlowPane();
		Button b01=new Button("按钮");
		root.setPadding(new Insets(10));
		root.setMargin(b01, new Insets(10));
		Button b02=new Button("按钮");
		
		Button b03=new Button("按钮");
		Button b04=new Button("按钮");
		Button b05=new Button("按钮");
		root.getChildren().addAll(b01,b02,b03,b04,b05);
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
primaryStage.show();		
	}

}
