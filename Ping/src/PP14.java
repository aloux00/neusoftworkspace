
public class PP14 {
public static void main(String[] args) {
	
	new H().f(100, "A", "B", "c");
			
}
}

class JieCheng{
	public int getJie(int n) {
		if(n<0) return 0;
		if(n==0) return 1;
		int sum=1;
		for(int i=n;i>0;i++) {
			sum=sum*i;
		}
		return sum;
	}
	public int getJie2(int n) {
		if(n==0) {
	return 1;
		}else {
			int i=n*getJie(n-1);
			return i;
		}
		
	}
	
	public int search(int[] nums,int left,int right,int key) {
		int mid=left+(right-left)/2;
		if(nums[mid]==key) {
			return mid;
		}
		if(left>right) {
			return -1;
		}
		if(nums[mid]>key) {
			return search(nums,left,mid-1,key);
		}	else {
			return search(nums,left,mid-1,key);
			
		}


	}
	
	

	}
	
	
	
	
	
class H{
public void  f(int dish ,String from,String tem,String to) {
	if(dish==0) {
	System.out.println(from+"->"+to);
	}else {
		f(dish-1,from,to,tem);
		System.out.println(from+"->"+to);
		f(dish-1,tem,from,to);
	}
	
}
}