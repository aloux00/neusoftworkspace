package orz.doublexi.calzz12;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;
//输入框以及tip
public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
Group group=new Group();
Scene scene=new Scene(group);
primaryStage.setScene(scene);
primaryStage.setHeight(900);
primaryStage.setWidth(800);

TextField text=new TextField();
PasswordField pass=new PasswordField();
Label label=new Label("我是标签");
//text.setText("这是文本");
text.setLayoutX(100);
text.setLayoutY(100);

Tooltip tip=new Tooltip();
tip.setText("这是tip");
text.setTooltip(tip);
text.setPromptText("请输入七个字以下");//一看就懂
text.setFocusTraversable(false);
text.textProperty().addListener(new ChangeListener<String>() {//selecttextproperty

	@Override
	public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		if(newValue.length()>7) {
			text.setText("");
		}			System.out.println("改变");

	}
});



group.getChildren().add(text);
group.getChildren().add(pass);
group.getChildren().add(label);


primaryStage.show();
	}

}
