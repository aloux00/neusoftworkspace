import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
       int wnum=in.nextInt();
        int[] wnums=new int[wnum];
        for(int i=0;i<wnum;i++){
            wnums[i]=in.nextInt();
        }
        int cnum=in.nextInt();
        
        in.nextLine();
        String[] s=new String[cnum];
        for(int i=0;i<cnum;i++){
            s[i]=in.nextLine();
        }
        int t=0;
        for(int i=0;i<cnum;i++){
            if(canSuccess(toShuZu(s[i]),wnums)){
                t++;
            }
        }
        System.out.println(t);
    }
    public  static int[] toShuZu(String s){
        return new int[]{Integer.parseInt(s.split(" ")[0]),Integer.parseInt(s.split(" ")[1])};
    }
     public  static boolean canSuccess(int[] nums,int[] wnums){
         int left=nums[0]-1;
         int right=nums[1]-1;
        int[] ii=new int[right-left+1];
         int index=0;
         for(int i=left;i<=right;i++){
             ii[index]=wnums[i];
         }
         Arrays.sort(ii);
         return func(ii);
     }
    public static boolean func(int[] ii){
        for(int i=0;i<=ii.length-1-1-1;i++){
            for(int j=i+1;j<=ii.length-1-1;j++){
                if(ii[i]+ii[j]>ii[j+1]){
                    return true;
                }
            }
        }
        return false;
    }
         
    
}