import java.util.Calendar;

public class Test3 {
public static void main(String[] args) {
int h=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
String nowtime=(h<21&&h>=7)?"����":"ҹ��";
int xingshishijian=10;
float lucheng=20;
int dengdaishijan=6;
float feiyong=0;
switch (nowtime) {
case "����":
	
	if(lucheng>=15) {
		feiyong=34+change(lucheng-15)*3;
	}else if(lucheng>3) {
		feiyong=10+change(lucheng-3)*2;
	}
	feiyong=feiyong+((dengdaishijan/60)/5)*2;
	break;
case"ҹ��":
	if(lucheng>=15) {
		feiyong=(float) (37.6+change(lucheng-15)*3.0);
	}else if(lucheng>3) {
		feiyong=(float) (12+change(lucheng-3)*2.3);
	}
	feiyong=feiyong+((dengdaishijan/60)/5)*2;
	break;
}
System.out.println("����Ϊ��"+feiyong);
}
public static int  change(float i) {
	if(i%1>0) {
		int a=(int)i;
		return a+1; 
	}else {
		return (int)i;
	}
		
}
}
