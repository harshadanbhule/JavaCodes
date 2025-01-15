//ladder code to count way
//
//
class Solution {
    public static int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        
        int prev1 = 1;
        int prev2 = 1;
        
        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }

    public static void main(String[] args){
	int n=3;	    
    System.out.println(climbStairs(n));
    
    }
}

