import java.util.Arrays;

public class PP01 {
	public static void main(String[] args) {
int[] nums=new int[] {6,4,2,3,4,1,2,2,1,5,7,2,21};
kuai(nums,0,nums.length-1);
System.out.println(Arrays.toString(nums));
}
	
	public static int[] pao(int[] nums) {
		for(int i=1;i<=nums.length-1;i++) {
			for(int j=0;j<nums.length-i;j++) {
				if(nums[j]>nums[j+1]) {
					int tem=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=tem;
				}
			}
		}
		return nums;
	}
	
	public static int[]  cha(int[] nums) {
		
		for(int i=1;i<nums.length;i++) {
			int index=i;
			while(index>0) {
				if(nums[index]<nums[index-1]) {
					int tem=nums[index];
					nums[index]=nums[index-1];
					nums[index-1]=tem;
					index--;
				}else {
					break;
				}
				
			}
		}
		
		
		return nums;
	}
	
	
	public static void kuai(int[] nums,int left,int right) {
		int zuo=left;
		int you=right;
		if(left>=right) {
			return;
		}
	int key=nums[left];
	while(left<right) {
		while(left<right&&nums[right]>=key) {
			right--;
		}
		nums[left]=nums[right];
		while(left<right&&nums[left]<=key) {
			left++;
		}
		nums[right]=nums[left];
	}
	nums[left]=key;
	int mid=left;
	kuai(nums,zuo,mid-1);
    kuai(nums,mid+1,you);
	}
}
