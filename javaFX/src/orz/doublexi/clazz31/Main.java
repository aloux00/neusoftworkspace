package orz.doublexi.clazz31;

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
		
		HBox box=new HBox();
		ToggleGroup group=new ToggleGroup();
		RadioButton r01=new RadioButton("01");
		r01.setToggleGroup(group);
		RadioButton r02=new RadioButton("02");
		r02.setToggleGroup(group);
		RadioButton r03=new RadioButton("03");
		r03.setToggleGroup(group);
		RadioButton r04=new RadioButton("04");
		r04.setToggleGroup(group);
		group.selectToggle(r03);
		
		r01.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				System.out.println(newValue.getClass());
			}
		});
		
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
System.out.println(newValue.getClass());				
			}
		});
		
		box.getChildren().addAll(r01,r02,r03,r04);
		root.getChildren().add(box);
		
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setHeight(800);
		primaryStage.setWidth(800);
		primaryStage.show();

	}

}
