import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application{
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
		TextArea EArea=new TextArea();
		EArea.setWrapText(true);
		EArea.setPadding(new Insets(3));
		EArea.setStyle(
				"-fx-font-size:25px;"
				+ "-fx-pref-height:120px;"
				+ "-fx-pref-width:500px;"
				);
		top.getChildren().add(EArea);
		TextArea CArea=new TextArea();
		CArea.setWrapText(true);
		CArea.setPadding(new Insets(15));
		CArea.setFocusTraversable(true);
		CArea.setStyle(
				"-fx-font-size:25px;"
				+ "-fx-pref-height:120px;"
				+ "-fx-pref-width:500px;"
				);
		bottom.getChildren().add(CArea);
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
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				CArea.setText(Utils.translate(EArea.getText()));
			}
		});
		
		EArea.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if(event.getCode()==KeyCode.ENTER) {
					CArea.setText(Utils.translate(EArea.getText()));
				}
			}
		});
		
		
		
		
		Scene scene=new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setHeight(300);
		primaryStage.setWidth(500);
		Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
		primaryStage.setX(bounds.getMaxX()-primaryStage.getWidth());
		primaryStage.setY(bounds.getMaxY()-primaryStage.getHeight());
		primaryStage.setOpacity(0.7);
		primaryStage.setAlwaysOnTop(true);
		primaryStage.setTitle("英语单词翻译[窗口美化版]");
		primaryStage.setResizable(false);
		primaryStage.show();
		EArea.requestFocus();
	}

}
