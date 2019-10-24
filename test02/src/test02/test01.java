package test02;

import java.util.ArrayList;
import java.util.function.Consumer;

public class test01 {
	public static void main(String[] args) {
		int [] a=new int[20];
		ArrayList<String> list=new ArrayList<>();
for (int i : a) {
	
}		

list.forEach(new Consumer<String>() {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
});

list.forEach(e->{
	System.out.println(e);
});


list.forEach(System.out::printf);


	}
}
