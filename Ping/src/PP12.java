import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class PP12 {
	public static void main(String[] args) {
		int[] aa=new int[] {1,2,3,6,5,45,9,8,5,7,5};
		new PP12().get(aa);
		System.out.println(Arrays.toString(aa));
		
	}
	public void get (int[] nums){
		int current=0;
		for(int i=0;i<nums.length;i++){
		current=i;
		while(current>0&&nums[current]<nums[current-1]){
		int tem=nums[current];
		nums[current]=nums[current-1];
		nums[current-1]=tem;
		current--;
		}
		}
		}
}

class aa{
	static void hehe() {
		
	}
}
class bb extends aa{
	static void hehe() {
		
	}
}
