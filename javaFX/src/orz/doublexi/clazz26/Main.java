package orz.doublexi.clazz26;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.Mnemonic;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//类似于超链接一样的东西
public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		MenuItem item=new MenuItem("item哦");
		item.setAccelerator(KeyCombination.valueOf("alt+x"));
		item.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("xxx");
				
			}
		});
		Menu menu01=new Menu("打开");
		menu01.getItems().add(item);
		Button button01=new Button("hehe");
		button01.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
System.out.println("button01");				
			}
		});
		menu01.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("hehe");
			}
		});
		menu01.setOnShowing(new EventHandler<Event>() {
			
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				System.out.println("ppp");
			}
		});
		MenuBar bar=new MenuBar();
		bar.getMenus().add(menu01);
		AnchorPane root=new  AnchorPane();
		root.getChildren().addAll(bar,button01);
		Scene scene=new Scene(root);
		scene.addMnemonic(new Mnemonic(button01, KeyCombination.valueOf("Ctrl+c")));
		primaryStage.setScene(scene);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
primaryStage.show();		
	}

}
