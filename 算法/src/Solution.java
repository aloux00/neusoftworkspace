import java.util.ArrayList;

public class Solution {
	   public int reverse(int x) {
	         int f=x>0?1:-1;
	         long ll=x;
	        ll=ll>0?ll:-ll;
	      Long xx=ll;
	      
	        StringBuilder sb=new StringBuilder(xx.toString());
	        sb.reverse();
	       String ss= sb.toString();
	      long sss=  (Long.parseLong(ss.trim()));
	      if(sss>Integer.MAX_VALUE||sss<Integer.MIN_VALUE) sss=0;
	        return (int)sss*f ;
	    
	    }
	    
	    public static void main(String[] args) {
			int reverse = new Solution().reverse(-2147483648);
			System.out.println(reverse);
		}
	}
