class Solution {
    public int climbStairs(int n) {
      int f = 0;
      int fSub = 1; 
      int sum = 0;
      for(int i = 0; i < n; i++){
          sum = f + fSub;
          f = fSub;
          fSub = sum;
      }
        return sum;
    }
}
//Fibonnaci
