package orz.doublexi.clazz32;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
		
		
		AnchorPane root=new AnchorPane();
		
		TextArea area=new TextArea();
		area.setWrapText(true);
		area.setPrefWidth(300);
		area.setPrefHeight(500);
		area.appendText("hehe");
		area.setEditable(false);
		//设置了宽高，行列失效
//		area.setPrefRowCount(5);
//		area.setPrefColumnCount(5);
		root.getChildren().addAll(area);
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setHeight(800);
		primaryStage.setWidth(800);
		primaryStage.show();

	}

}
