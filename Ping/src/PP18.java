
public class PP18 {
public static void main(String[] args) {
	
	prt(9);
}
	public static void prt(int n) {
		int[][] cc=new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			cc[1][i]=i;
		}
		for(int i=n;i>=1;i--) {
			cc[n][i]=3*n-1-i;
		}
		for(int i=2;i<=n-1;i++) {
			cc[i][1]=4*n-2-i;
			cc[i][n]=n-1+i;
			for(int j=2;j<=n-1;j++) {
				cc[i][j]=0;
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(cc[i][j]==0?" ":cc[i][j]);
			}
			System.out.println();
		}
	}
	
	
}
