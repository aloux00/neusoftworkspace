package 最小字符串;


import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	int lengthOfLongestSubstring = new Solution().lengthOfLongestSubstring("aabbbbjidjijklkliop[;.,m");
	System.out.println(lengthOfLongestSubstring);
	
}
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
    	String[] ss=s.split("");
    	ArrayList<Integer> list=new ArrayList();
    	StringBuilder bb=new StringBuilder();
    	for(int i=0;i<ss.length;i++) {
    		if(bb.toString().contains(ss[i])) {
    			list.add(bb.toString().length());
    			bb=new StringBuilder();
    			bb.append(ss[i]);
    		}else {
    			bb.append(ss[i]);
    			if(i==ss.length-1) {
    				list.add(bb.length());
    			}
    		}
        	
    	}
    	int a=list.get(0);
   for(int i=1;i<list.size();i++) {
	   if(list.get(i)>a) {
		   a=list.get(i);
		   
	   }
   }
   System.out.println(list.toString());
 return a;       
    }
}