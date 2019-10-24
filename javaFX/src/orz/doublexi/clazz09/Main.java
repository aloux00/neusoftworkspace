package orz.doublexi.clazz09;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button button01=new Button("按钮01");
		button01.setFont(Font.font("宋体", 20));
		button01.setBackground(new Background(new BackgroundImage(new Image("temp.png"),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
		Button button02=new Button("按钮02");
		button02.setBackground(new Background(new BackgroundFill(Paint.valueOf("#FDEEED"), new CornerRadii(20), new Insets(1))));
		button02.setPrefSize(100, 50);
		button02.setBorder(new Border(new BorderStroke(Paint.valueOf("#000000"), BorderStrokeStyle.SOLID, new CornerRadii(10), BorderWidths.DEFAULT)));
		Button button03=new Button("按钮03");
		button03.setStyle("");
		
		Button button04=new Button("按钮04");
		Button button05=new Button("按钮05");
		
		
		
		
		
		Group root=new Group();
		//root.getChildren().add(button01);
//		root.getChildren().add(button02);
		root.getChildren().add(button03);
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
	}

}
