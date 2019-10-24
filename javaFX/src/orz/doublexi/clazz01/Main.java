package orz.doublexi.clazz01;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
public static void main(String[] args) {
	launch(args);
}

@Override
public void start(Stage stage) throws Exception {
	System.out.println("hello,world");
	stage.setTitle("双喜的第一个fx程序");
stage.show();	
}
}
