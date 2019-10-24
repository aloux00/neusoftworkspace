package orz.doublexi.clazz27;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
//		AnchorPane root=new AnchorPane();
		HBox root=new HBox();
		MenuItem item01=new MenuItem("第一个");
		Menu menu01=new Menu("第一个");
		menu01.getItems().add(item01);
		
		SeparatorMenuItem sep01=new SeparatorMenuItem();
		menu01.getItems().add(sep01);
		
		//单选按钮组
		ToggleGroup toggGroup=new ToggleGroup();
		RadioMenuItem rb01=new RadioMenuItem("01");
		rb01.setToggleGroup(toggGroup);
		RadioMenuItem rb02=new RadioMenuItem("02");
		rb02.setToggleGroup(toggGroup);
		
		//rb01.isSelected();
		
		
		
		MenuItem item02=new MenuItem("第一个");
		Menu menu02=new Menu("第一个");
		menu02.getItems().addAll(item02,rb01,rb02);
		MenuBar bar=new MenuBar();
		bar.getMenus().addAll(menu01,menu02);
		root.getChildren().addAll(bar);
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
