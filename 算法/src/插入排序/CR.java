package 插入排序;

import java.util.Arrays;

public class CR {
public static void main(String[] args) {
	 int[] nums =new int[] {1,6,78,4,4,4,4,4,4,44,4,3,9};
	 int length=nums.length;
	 for(int i=1;i<length;i++) {
		 int insertNum=nums[i];
		 int j=i-1;
		 for(;j>=0;j--) {
			 if(nums[j]>insertNum) {
				 nums[j+1]=nums[j];
			 }else {
				 break;
			 }
		 }
		 nums[j+1]=insertNum;
	 }
	 System.out.println(Arrays.toString(nums));
}
}
