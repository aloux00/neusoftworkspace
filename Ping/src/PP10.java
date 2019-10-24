import java.util.Arrays;
import java.util.HashMap;

public class PP10 {
public int[] find(int[] nums,int target) {
	HashMap<Integer,Integer> map=new HashMap();
	for(int i=0;i<nums.length;i++) {
		map.put(nums[i],i);
	}
	for(int i=0;i<nums.length;i++) {
		int ii=target-nums[i];
		if(map.containsKey(ii)) {
			
			return new int[] {i,map.get(ii)};
		}
	}
	return null;
	
}
public static void main(String[] args) {

     
    }


}
