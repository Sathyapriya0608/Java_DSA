package dynamic;
import java.util.Arrays;

public class dynamic {
	//public static int feb(int n) {
	//	int[] dp=new int[n+1];
	//dp[0]=0;
	//dp[1]=1;
		
		//for(int i=2;i<=n;i++)
		//dp[i]=dp[i-1]+dp[i-2];
		//return dp[n];
	//}
	//public static void main(String[] args) {
		//int n=7;
		
		//
//System.out.println(feb(n));
	//}


//      public static int minCoin(int[] coins,int rup) {
//    	  if(rup==0) return 0;
//    	  int res=Integer.MAX_VALUE;
//    	  for(int coin:coins) {
//    		  if(coin<=rup) {
//    			  int subres=minCoin(coins,rup-coin);
//    			  if(subres != Integer.MAX_VALUE) {
//    				  res=Math.min(res,subres+1);
//    			  }
//    		  }
//    	  }
//    	  return res;
//      }
//      public static void main(String[] args) {
//    	  int[] coins= {9,6,5,1};
//    	  int n=56;
//    	  int[] dp=new int[n+1];
//    	  Arrays.fill(dp,-1);
//    	  System.out.print(minCoin(coins,(11)));
//    	  
//      }
//
	public static int minJump(int[] arr) {
		int[] dp=new int[arr.length];
		Arrays.fill(dp, arr.length);
		dp[0]=0;
		if(arr[0]==0) return -1;
		for(int i=0;i<arr.length;i++) {
			if(dp[i]!=arr.length) {
				for(int j=1;j<=arr[i]&& i+j<arr.length;j++)
				{
					dp[i+j]=Math.min(dp[i]+1,dp[i+j] );
				}
			}
		}
		return dp[dp.length-1];
	}
	public static void main(String[] args) {
		int[] arr= {1,4,3,1,2,0,7,8,6};
		System.out.println(minJump(arr));       
	}
	}
      
  