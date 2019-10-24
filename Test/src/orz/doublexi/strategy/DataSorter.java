package orz.doublexi.strategy;

public class DataSorter {

	public static void sort(int[] a,int left,int right) {
		if(left>=right) {
			return;
		}
		int dg = dg(a,left,right);
		sort(a,left,dg-1);
		sort(a,dg+1,right);
		
	}
	public static void sort(int[] a) {
		sort(a,0,a.length-1);
	}
	
	public static int dg(int[] nums,int left,int right) {
		
			int key=nums[left];
			while(left<right){
			while(left<right&&nums[right]>=key){
			right--;
			}
			nums[left]=nums[right];
			while(left<right&&nums[left]<key){
			left++;
			}
			nums[right]=nums[left];
			}
			nums[left]=key;
			return left;
			}
	

	public static void p(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

}
