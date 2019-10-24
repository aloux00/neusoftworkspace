package orz.doublexi.clazz16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test01 extends Application{
public static void main(String[] args) {
launch(args);	
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane top=new AnchorPane();
		top.setStyle(
				"-fx-background-color:red;"
				+ "-fx-pref-height:120px;"
				);
		
		AnchorPane bottom=new AnchorPane();
		bottom.setStyle(
				"-fx-background-color:green;"
				+ "-fx-pref-height:120px;"
				);
		AnchorPane center=new AnchorPane();
		center.setStyle(
				"-fx-background-color:yellow;"
				);
		TextArea ChNArea=new TextArea();
		ChNArea.setWrapText(true);
		ChNArea.setPadding(new Insets(3));
		ChNArea.setStyle(
				"-fx-font-size:20px;"
				+ "-fx-pref-height:120px;"
				+ "-fx-pref-width:500px;"
				);
		top.getChildren().add(ChNArea);
		TextArea EngArea=new TextArea();
		EngArea.setPadding(new Insets(3));
		EngArea.setStyle(
				"-fx-font-size:20px;"
				+ "-fx-pref-height:120px;"
				+ "-fx-pref-width:500px;"
				);
		bottom.getChildren().add(EngArea);
		Button button=new Button("开始翻译");
		button.setStyle(
				"-fx-pref-height:40px;"
				+ "-fx-pref-width:500px;"
				);
		center.getChildren().add(button);
		BorderPane pane=new BorderPane();
		pane.setCenter(center);
		pane.setTop(top);
		pane.setBottom(bottom);
		Scene scene=new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setHeight(300);
		primaryStage.setWidth(500);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

}
