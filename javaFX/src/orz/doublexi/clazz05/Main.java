package orz.doublexi.clazz05;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setOpacity(0.1);
	primaryStage.show();
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread());
System.out.println("run");				
int i=1;
while(i<=10) {
System.out.println(i);
primaryStage.setOpacity(i*0.1);
i=i+1;
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
			}
		});
		System.out.println("run000");
		System.out.println(Thread.currentThread());
		
	}

}
