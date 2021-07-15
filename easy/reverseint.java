class Solution {
    public int reverse(int x) { 
        long j = 0;
        while(x != 0){
            j = j * 10 + x % 10;
            x = x / 10;
        }
        
        if(j <  Integer.MIN_VALUE || j > Integer.MAX_VALUE){
        return 0;
        }else{
            return (int)j;
        }
    }
}
