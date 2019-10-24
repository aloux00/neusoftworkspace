package thread;

public class Test {
	public static int i = 0;

	public synchronized void add() {
		i++;
	}

	public static void main(String[] args) {
		Test test = new Test();

		new Thread() {

			@Override
			public void run() {

				while (i < 100) {

					synchronized (Thread.class) {
						if (i % 2 > 0 && i < 100) {
							test.add();
						

							System.out.println(this.getName() + " " + i);
						}

					}
				}

			}

		}.start();
		new Thread() {

			@Override
			public void run() {

				while (i < 100) {
					synchronized (Thread.class) {
						if (!(i % 2 > 0) && i < 100) {
							test.add();
							System.out.println(this.getName() + " " + i);
						}
					}

				}
			}

		}.start();
	}

}
