
public class Test {
public static void main(String[] args) {
Test test = new Test();
	test.question1(1,2);
	test.question2(345);
	test.question3(10);
	test.question4('A');
}
public void question1(int a,int b) {
	System.out.println("����ǰ��a"+a+"b:"+b);
	int t=0;
	t=a;
	a=b;
	b=t;
	System.out.println("������a"+a+"b:"+b);

}

public void question2(int a) {
	
	int b=a%10;
	int c=a/10%10;
	int d=a/10/10%10;
	System.out.println("�ֽ�Ϊ��"+d+"��"+c+"��"+b);
}
public void question3(float hua) {
	
	float she=(hua-32)*5/9;
	System.out.println("���ϣ�"+hua+"���ϣ�"+she);
	she=10;
	hua=she*9/5+32;
	System.out.println("���ϣ�"+she+"���ϣ�"+hua);
	
}
public void question4(char a) {
	
	char b=(char) (a+32);
	System.out.println("�����д��"+a+"  "+"���Сд��"+b);
			
}
}
