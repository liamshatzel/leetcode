//Newtons Method
class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        double temp;
        double sqrt = x / 2;
        do{
           temp = sqrt;
           sqrt = ((temp + (x / temp)) / 2);
        }
        while((temp - sqrt) != 0);
        int sqrt1 = (int)sqrt;
        return sqrt1;
        
    }
}
