package 归并;

import java.util.Arrays;

public class 归并{

	
	public static void main(String[] args) {
		int[] ii=new int[] {1,2,4,2,5,3,5,3,2};
		sort(ii,0,ii.length-1);
		System.out.println(Arrays.toString(ii));
	}
	
	public  static void sort(int[] nums,int left,int right) {
		if(left==right) {
			return;
		}
		int mid=left+(right-left)/2;
		sort(nums,left,mid);
		sort(nums,mid+1,right);
		merge(nums,left,mid,right);
	}
	public static void merge(int[] nums,int left,int mid ,int right) {
	int[] temp=new int[right-left+1];
	int i=0;
	int p1=left;
	int p2=mid+1;
	while(p1<=mid&&p2<=right) {
		temp[i++]=nums[p1]<=nums[p2]?nums[p1++]:nums[p2++];
	}
	while(p1<=mid) {
		temp[i++]=nums[p1++];
	}
	while(p2<=right) {
		temp[i++]=nums[p2++];
	}
	for(int j=0;j<temp.length;j++) {
	    nums[left+j]=temp[j];
	}
	}
}
