import java.util.ArrayList;

public class TT06 {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		int max=10;
		new Thread(()-> {
			synchronized(TT06.class) {
				while(true) {
					if(list.size()>0) {
						Object o=list.get(0);
						list.remove(o);
						System.out.println(o);
					}else {
						System.out.println("灭东西了。我要休眠了");
						try {
							TT06.class.notifyAll();
							TT06.class.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				}
			}
			
		}).start();
		
		new Thread(()-> {
			synchronized(TT06.class) {
				while(true) {
					if(list.size()>0) {
						Object o=list.get(0);
						list.remove(o);
						System.out.println(o);
					}else {
						System.out.println("灭东西了。我要休眠了");
						try {
							TT06.class.notifyAll();
							TT06.class.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				}
			}
			
		}).start();
		new Thread(()-> {
			synchronized(TT06.class) {
				while(true) {
					if(list.size()>0) {
						Object o=list.get(0);
						list.remove(o);
						System.out.println(o);
					}else {
						System.out.println("灭东西了。我要休眠了");
						try {
							TT06.class.notifyAll();
							TT06.class.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				}
			}
			
		}).start();
		
		
		
		
		new Thread(()-> {
			synchronized (TT06.class) {
				while(true) {
					if(list.size()==max) {
						System.out.println("放满了，我要休息了");
						try {
							TT06.class.notifyAll();
							TT06.class.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							}else {
								list.add(new Object());
								
							}
				}
			
			}
			
		
		
		}).start();
	}
	
	
	
	
}
