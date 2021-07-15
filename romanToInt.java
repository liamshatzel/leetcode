class Solution {
    public int romanToInt(String s) {
 int L = s.length();
        int nums[] = new int[L];
        for(int i=0;i<L;i++){
            switch(s.charAt(i)){
                case 'I':
                    nums[i]=1;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'X':
                    nums[i]=10;
                    break;
                 case 'L':
                    nums[i]=50;
                    break;
                 case 'C':
                    nums[i]=100;
                    break;
                 case 'D':
                    nums[i]=500;
                    break;
                 case 'M':
                    nums[i]=1000;
                    break;   
                    
            }
        }
        int sum=0;
        for(int i=0;i<L-1;i++){
            if(nums[i]<nums[i+1]){
                sum-=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        return sum+nums[L-1];
    }  
    }
