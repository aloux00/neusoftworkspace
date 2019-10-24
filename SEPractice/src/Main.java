import java.util.Scanner;

public class Main{
 public static void main(String[] args){
 int t=1;
 Scanner in=new Scanner(System.in);

int count =1;
int countc =1;

while(in.hasNextInt()) {
	int a = in.nextInt();
	if(a==1) {
		System.out.println(1);
		continue;
	}
	

	for(int i=0;i<countc;i++) {
	count++;
	t++;
	if(a==count) {
		System.out.println(t);
		count=1;
		t=1;
		countc=0;
		break;
	}
	}
	count++;
	t--;
	if(a==count) {
		System.out.println(t);
		count=1;
		t=1;
		countc=0;
		break;
	}
	countc++;
	
	 }
}

}