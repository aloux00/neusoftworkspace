package orz.doublexi.clazz08;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
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
		Button button01=new Button("按钮01");button01.setLayoutX(50);button01.setLayoutY(50);
		Button button02=new Button("按钮02");
		Button button03=new Button("按钮03");
		Group group=new Group();
		group.getChildren().addListener(new ListChangeListener<Node>() {

			@Override
			public void onChanged(Change<? extends Node> c) {
				System.out.println(c.getList().size());			
			}
			
		});
		group.getChildren().addAll(button01,button02,button03);
		
		group.setOpacity(0.5);
		Object[] array = group.getChildren().toArray();
		button01.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				group.getChildren().add(new Button("xinjina"));
			}
		});
		Scene scene=new Scene(group);
		primaryStage.setScene(scene);
		primaryStage.setWidth(500);
		primaryStage.setHeight(500);
		primaryStage.show();
	}

}
