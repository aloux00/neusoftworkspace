package orz.doublexi.clazz30;

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
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
//比较有用的tab
public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		AnchorPane root=new AnchorPane();
		TabPane tabpane=new TabPane();
		tabpane.setPrefHeight(300);
		tabpane.setPrefWidth(300);
		tabpane.setStyle("-fx-background-color:#FFA07A;");
		root.getChildren().add(tabpane);
		
		HBox hbox=new HBox();
		hbox.getChildren().addAll(new Button("01"),new Button("02"),new Button("02"));
		hbox.setStyle("-fx-background-color:#FFF000;");
		
		Tab tab01=new Tab("tab01");
		tab01.setContent(hbox);
		tab01.setClosable(false);
		tab01.setGraphic(new ImageView(new Image("temp.png")));
		Tab tab02=new Tab("tab02");
		tab02.setDisable(false);
		tabpane.getTabs().addAll(tab01,tab02);
		tabpane.getSelectionModel().select(1);
		tabpane.setSide(Side.LEFT);
		tabpane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
		
		tabpane.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>() {

			@Override
			public void changed(ObservableValue<? extends Tab> observable, Tab oldValue, Tab newValue) {
System.out.println(newValue.getText());		
			}
		});
		//select tab's stage change
		tab01.setOnSelectionChanged(new EventHandler<Event>() {
			
			@Override
			public void handle(Event event) {
System.out.println(event.getSource().toString());				
			}
		});
		
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setHeight(800);
		primaryStage.setWidth(800);
		primaryStage.show();

	}

}
