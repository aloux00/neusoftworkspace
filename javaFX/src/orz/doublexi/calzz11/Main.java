package orz.doublexi.calzz11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCharacterCombination;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyCombination.Modifier;
import javafx.scene.input.KeyCombination.ModifierValue;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.Mnemonic;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//快捷键
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
//01
KeyCombination comb01=new KeyCodeCombination(KeyCode.C,KeyCombination.ALT_DOWN);
Mnemonic nemonic01=new Mnemonic(button01, comb01);

//02
KeyCombination comb02=new KeyCharacterCombination("A", KeyCombination.ALT_DOWN);
Mnemonic nemonic02=new Mnemonic(button01, comb02);

//03
//KeyCombination comb03=new KeyCombination(KeyCode.B)

//04
KeyCombination comb04=new KeyCodeCombination(KeyCode.D, KeyCombination.ALT_DOWN);


Group group=new Group();
group.getChildren().add(button01);
Scene scene=new Scene(group);
scene.addMnemonic(nemonic01);
scene.addMnemonic(nemonic02);
scene.getAccelerators().put(comb04, new Runnable() {
	
	@Override
	public void run() {
		System.out.println("diaoyong了");
		button01.fire();//按钮多了，回调会出麻烦
	}
});

primaryStage.setScene(scene);
primaryStage.setHeight(900);
primaryStage.setWidth(800);
primaryStage.show();
	}

}
