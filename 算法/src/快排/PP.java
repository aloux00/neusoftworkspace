package 快排;


import java.util.Arrays;

public class PP {
public static void main(String[] args) {
	int [] nums =new int[] {
			1,4,4,2,4,21,6,7,4,6
	};
	System.out.println("��ʼ");
	kuaipai(nums, 0, nums.length-1);
	System.out.println(Arrays.toString(nums));
	
}
public static void kuaipai(int[] nums,int left,int right) {
	if(left<right) {
		int min = getMin(nums,left,right);
		kuaipai(nums,left,min-1);
		kuaipai(nums,min+1,right);
	}

		
	}
public static int getMin(int[] nums,int left,int right) {
	int key=nums[left];
	while(left<right) {
		while(left<right&&nums[right]>=key) {right--;}
		nums[left]=nums[right];
		//nums[right]=key;
		while(left<right&&nums[left]<=key) {left++;}
		nums[right]=nums[left];
		
	}
	nums[left]=key;
	int min=left;
	return min;
}

}
