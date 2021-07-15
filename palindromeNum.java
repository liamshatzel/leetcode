class Solution {
    public boolean isPalindrome(int x) {
        int j = 0;
        int y = x;
        if(x >= 0){
            while(x != 0){
                j = (j*10) + x % 10;
                x = x / 10;
            }
            if(j == y){
                System.out.println(j);
                return true;
            }else{
                return false;
            }
            
        }else{
            return false;
        }
    }
}
