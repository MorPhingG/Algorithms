import java.lang.*;

public class CutRod {
	
	public static void main(String[] args) {
		int price[] = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}; 
		int n = 30;
		CutRod cutRod = new CutRod();
		cutRod.cut(price, n);

	}
	
	public void cut(int[] p, int n){
		int[] r = new int[n+1];
		int end;
		r[0] = 0;
		int q = -10000;
		if(n == 0)
			q = 0;
		
		for (int i = 0; i <= n ; i++){
			q = -10000;
			if(i > 10)
				end = 10;
			else
				end = i;
			for(int j = 0; j <= end; j++){
				q = Math.max(q, p[j]+r[i-j]);
			}
			r[i] = q;
		}		
		System.out.println(q);
				
	}

}
