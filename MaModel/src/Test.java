
public class Test {
public static void main(String[] args) {
	System.out.println(Singleton.i);
	System.out.println(Singleton.ii);
}



}


class Singleton {
public static int i;
public static Singleton ss=new Singleton();
public static int ii=5;
private Singleton() {
	i++;
	ii++;
}

}