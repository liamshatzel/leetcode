class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int carry = 0;
        while(aLen >= 0 || bLen >= 0){
           int sum = carry;
           if(aLen >= 0) sum += a.charAt(aLen--) - '0';
           if(bLen >= 0) sum += b.charAt(bLen--) - '0';
           ans.append(sum % 2);
           carry = sum / 2;
        }
        if(carry != 0) ans.append(carry);
        return ans.reverse().toString();
    }
}

/**
 int carry = 0;
        String ans = "";
        int aInt = a.length() -1;
        int bInt = b.length() -1;
        int a1Int = 0;
        int b1Int = 0;
        
        while(aInt >= 0 || bInt >= 0){
            if(aInt >= 0) {
                 a1Int = a.charAt(aInt--) - '0';
            }else if(a1Int == 0){
                 a1Int = a.charAt(aInt--) - 0;
               } //converts to int
            if(bInt >= 0){
                b1Int = b.charAt(bInt--) - '0';
            }else if(bInt == 0){
                b1Int = b.charAt(bInt--) - 0;
            }
            int sum = a1Int + b1Int + carry;
            ans = (sum % 2) + ans; //adds char of either 1 or zero if sum = 2
            carry = sum / 2; // carry either equals 2/2 = 1 or 1/2 = 0
        }
        if(carry > 0){
            ans = '1' + ans;
        }
        ans.toString();
        return ans;
        
        
     String n = "";
     String big = "";
     String small = "";
     String ans = "";
     if(a.length() != b.length()){
     if(b.length() > a.length()){
        big = b; 
        small = a;
     }else{
         big = a; 
         small = b;
     }
     while(n.length() < (big.length() - small.length())){
        n += 0; 
     }
     n += small;
     }
     for(int i = n.length() - 1; i >= 0; i--){
         if(big.charAt(i) == '1' && n.charAt(i) == '1'){
            ans += "10";
         }else if(big.charAt(i) == 1 || n.charAt(i) == 1){
             ans += "1";
         }else{
             ans += "0";
         }
     }
           return ans;
    }
    
   int big = 0; 
        String bog = "";
        if(b.length() >= a.length()){
            big = b.length();
            bog = b;
        }else{
            big = a.length();
            bog = a;
        }
        for(int i = 0; i < big; i++){
            if()
            
        }


String n = "";
if(a.length() != b.length()){
    if(a.length() > b.length()){
        while(b.length() < a.length()){
           b += "0";
            System.out.println(b);
        }
     }else{
            while(a.length() < b.length()){
                a += "0";
               System.out.println(a);
            }
        }
    }
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == 1 && b.charAt(i) == a.charAt(i)){
                n += "10";
            }else if(b.charAt(i) == '1' && a.charAt(i) != '1'){
               n += "0";
            }else{
                n += 0;
            }
                               }
    return n;

**/
