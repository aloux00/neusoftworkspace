package orz.doublexi.clazz29;

import javafx.application.Application;
import javafx.geometry.NodeOrientation;
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
import javafx.scene.control.TitledPane;
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
		
		
		HBox root=new HBox();
		TitledPane tp01=new TitledPane("titlePane",new Button("button01"));
		TitledPane tp02=new TitledPane();
		tp02.setText("002titile");
		tp02.setContent(new Button("button02"));
		//箭头
		tp02.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
		
		TitledPane tp03=new TitledPane();
				HBox box=new HBox();
				box.getChildren().addAll(new Button("003"),new Button("004"),new Button("005"));
				tp03.setContent(box);
		//一竖排
				Accordion accordion=new Accordion();
				accordion.getPanes().addAll(tp01,tp02,tp03);
				
				
		root.getChildren().addAll(tp01,tp02,tp03,accordion);
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
