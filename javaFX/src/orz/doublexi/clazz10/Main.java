package orz.doublexi.clazz10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
Button button01=new Button();		
button01.setLayoutX(100);
button01.setLayoutY(100);
button01.setPrefHeight(200);
button01.setPrefWidth(400);
button01.setFont(Font.font(40));

button01.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent event) {
System.out.println("单击事件");		
	}
});
button01.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

	@Override
	public void handle(MouseEvent event) {
	
int clickCount = event.getClickCount();
System.out.println(clickCount);
	}
});
button01.setOnKeyTyped(new EventHandler<KeyEvent>() {

	@Override
	public void handle(KeyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("按键"+event.getCharacter());
	}
});
button01.setOnKeyPressed(new EventHandler<KeyEvent>() {

	@Override
	public void handle(KeyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("按下"+event.getCode().getName());
	}
});




Group group=new Group();
group.getChildren().add(button01);
Scene scene=new Scene(group);
primaryStage.setScene(scene);
primaryStage.setHeight(900);
primaryStage.setWidth(800);
primaryStage.show();
	}

}
