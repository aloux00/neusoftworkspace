package orz.doublexi.calzz13;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//锚点布局管理器
public class Main extends Application {
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root=new AnchorPane();
		AnchorPane root02=new AnchorPane();
		Group g01=new Group();
		Group g02=new Group();
		Button button01=new Button("这是一个按钮01");
		button01.setLayoutX(20);
		button01.setLayoutY(20);
		Button button02=new Button("这是一个按钮02");
		g01.getChildren().add(button01);
		g02.getChildren().add(button02);
		root.getChildren().addAll(g01,g02,root02);
//		root.setPadding(new Insets(10));
//		root.setTopAnchor(button01, 10.0);
//		root.setLeftAnchor(button01, 10.0);
//		root.setRightAnchor(button01, 10.0);
//		root.setBottomAnchor(button01, 10.0);
		root.setTopAnchor(g01, 100.0);
		root.setLeftAnchor(g01, 100.0);
		
		root.setStyle(
				"-fx-background-color:#ff3e96"
				);
		root02.setStyle(
				"-fx-background-color:#000000"
				);
		//root02.setPrefHeight(10);
		
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setHeight(500);
		primaryStage.setWidth(600);
		primaryStage.show();

		
		primaryStage.heightProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				root.setBottomAnchor(root02, root.getHeight()/2);
			}
		});
		primaryStage.widthProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				 root.setRightAnchor(root02, root.getWidth()/2);		
			}
		});
//		button01.setManaged(false);
		root.setTopAnchor(root02, 0.0);
		root.setBottomAnchor(root02, primaryStage.getHeight()/2);
		root.setLeftAnchor(root02, 0.0);
        root.setRightAnchor(root02, primaryStage.getWidth()/2);		
	}

}
