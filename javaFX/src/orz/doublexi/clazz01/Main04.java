package orz.doublexi.clazz01;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main04 extends Application{
public static void main(String[] args) {
	System.out.println(Thread.currentThread());
	launch(Main04.class, args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("开始");
		primaryStage.show();
		System.out.println(Thread.currentThread());
	}
	@Override
	public void init() throws Exception {
		System.out.println("初始化");
		super.init();
	}
	@Override
	public void stop() throws Exception {
		System.out.println("结束");
		super.stop();
	}
	

}
