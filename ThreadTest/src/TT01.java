import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class TT01 {
public static void main(String[] args) {
	FutureTask<Game> task=new FutureTask<Game>((Callable<Game>)()->{;
	TimeUnit.SECONDS.sleep(3);
	return new Game();
	
	
});
	
	System.out.println("我网上买了一个游戏机");
	new Thread(task).start();
	if(task.isDone()) {
	System.out.println("东西到货，我开始打游戏了：");
	Game game;
	try {
		game = task.get();
		game.Shiyong();
	} catch (InterruptedException | ExecutionException e) {
		System.out.println("游戏机是坏的！！！");
	}
	}else {
		System.out.println("我先睡一觉吃个饭");
		try {
			Game game=task.get();
			System.out.println("总算是到了");
			game.Shiyong();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


}
class Game{
	public void Shiyong() {
		System.out.println("打游戏");
	}
}
