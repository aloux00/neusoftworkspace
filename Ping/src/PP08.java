import java.util.Arrays;

public class PP08 {
	public static void main(String[] args) {
		int[] ii=new int[] {1,1,1,2,2,2,3,3,6,6,6,8,8,8,9,9,9};
		int[] itemDy = getItemDy(ii, 6);
		System.out.println(Arrays.toString(itemDy));
	}
	public static int[] getItemDy(int[] nums,int target){
		int[] ran=new int[]{-1,-1};
		int left=0;
		int right=nums.length-1;
		int mid=0;
		while(left<right){
		mid=left+(right-left)/2;
		if(nums[mid]>=target){
		right=mid;
		}
		else if(nums[mid]<target){
		left=mid+1;
		}
		

		}
		
		if(left==nums.length-1){
			if(nums[left]==target)return new int[]{left,left};
			else return new int [] {-1,-1};
			}
			if(left==0){
			if(nums[left]!=target)return new int[]{-1,-1};
			}
			ran[0]=left;
			left=0;
			right=nums.length-1;
			
		while(left<right){
			mid=left+(right-left)/2;
			if(nums[mid]>target){
			right=mid;
			}else if(nums[mid]<=target){
			left=mid+1;

			}
			
		}
		ran[1]=right-1;


		return ran;
		
	}
}
