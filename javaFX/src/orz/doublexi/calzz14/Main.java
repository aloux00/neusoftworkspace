package orz.doublexi.calzz14;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//横竖布局管理器
public class Main extends Application {
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox box=new HBox();
//		VBox vbox=new VBox();
		box.setAlignment(Pos.CENTER);
		AnchorPane anchor=new AnchorPane();
		Button button01=new Button();
		Button button02=new Button();
		Button button03=new Button();
		box.getChildren().addAll(button01,button02,button03);
		box.setStyle(
				"-fx-background-color:#AEEEEE"
				);
		anchor.setStyle(
				"-fx-background-color:#E066FF"
				);
		box.setPrefHeight(100);
		box.setPrefWidth(100);
		anchor.getChildren().add(box);
		Scene scene=new Scene(anchor);
		primaryStage.setScene(scene);
		primaryStage.setHeight(500);
		primaryStage.setWidth(600);
		primaryStage.show();

	}

}
