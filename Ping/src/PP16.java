import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator.OfInt;

public class PP16 {
public static void main(String[] args) {
	  int[] nums=new int[] {1,3,4,5,6,7,5,4,3,4,5,3};
//	System.out.println(Arrays.toString(Bubble(nums)));
//	System.out.println(Arrays.toString(Insert(nums)));
	  Fast(nums, 0, nums.length-1);
	System.out.println(Arrays.toString(nums));
}
public static int[] Bubble(int[] nums) {
	for(int i=0;i<nums.length-1;i++) {
		boolean flag=false;
		for(int j=0;j<nums.length-i-1;j++) {
	if(nums[j]>nums[j+1]) {
		int tem=nums[j];
		nums[j]=nums[j+1];
		nums[j+1]=tem;
		flag=true;
	}
		}
		if(!flag) {
			break;
		}
	}
return nums;
}

public static int[] Insert(int[] nums) {
	for(int i=0;i<nums.length;i++) {
	int tt=i;
	while(tt>0) {
		if(nums[tt]<nums[tt-1]) {
			int tem=nums[tt];
			nums[tt]=nums[tt-1];
			nums[tt-1]=tem;
			tt=tt-1;
		}else {
			break;
		}
	}
	}
	return nums;
}

public static void Fast(int[] nums,int left,int right) {
	if(left<right) {
		int mid=Fast2(nums,left,right);
		Fast(nums,left,mid-1);
		Fast(nums,mid+1,right);
	}

}
public static int Fast2(int[] nums,int left,int right) {
	int tt=right;
	int key=nums[right];
	right=right-1;
	while(left<=right) {
		while(left<=right&&nums[left]<=key) {
	left++;
		}
		while(left<=right&&nums[right]>=key) {
			right--;
		}
		if(left<right) {
			int tem=nums[left];
			nums[left]=nums[right];
			nums[right]=tem;
		}
	}
	int tem=nums[left];
	nums[left]=key;
	nums[tt]=tem;
	return left;
}
}
