import java.util.Arrays;

public class tt   {
public static void main(String[] args) {
	int a[]= {1,2,4,6,7,5,3,2};
	
//	for(int i=1;i<=a.length-1;i++)
//	{
//		for(int j=0;j<=a.length-1-i;j++)
//		{
//			if(a[j]>a[j+1]) {
//				
//				int t=a[j];
//				a[j]=a[j+1];
//				a[j+1]=t;
//			}
//			
//		}
//	}
	System.out.println(Arrays.toString(a));
for(int i=1;i<=a.length-1;i++) {
	int tem=i;
	int t=0;
	for(int j=i-1;j>=0;j--) {
		if(a[tem]>a[j])
		{
			break;
		}else {
			t=a[tem];
			a[tem]=a[j];
			a[j]=t;
			tem=j;
		}
	}
	
	
}




System.out.println();
System.out.println(Arrays.toString(a));


}
}
