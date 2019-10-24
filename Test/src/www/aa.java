package www;

public class aa {
	int i=0;
public aa() {
System.out.println("aa"+((Object)this).toString());
}
@Override
	public String toString() {
return String.valueOf(hashCode());
}
public void papa() {
	((cc)this).haha();
}
public static void main(String[] args) {
	new cc().papa();
}
public void pa() {
	System.out.println("aaapppaaaa");
}
}
