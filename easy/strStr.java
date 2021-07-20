class Solution {
    public int strStr(String haystack, String needle) {
    String sub = "";
    int num = 0;
    if(needle.length() < 1){
        return 0;
    }
    for(int i = 0; i <= haystack.length() - needle.length(); i++){
            sub = haystack.substring(i, i + needle.length());
             if(sub.equals(needle)){
                return i;
             }
        }
        return -1;
    }
    }

/** 

 
  int counter = 0;
       int place = 0;
       if(needle.length() < 1){
           return 0;
       }else{
       for(int i = 0; i < haystack.length(); i++) {
          if(haystack.charAt(i) == needle.charAt(0)){
            place = i;
           for(int j = 0; j < needle.length()-1; j++){
                  int p = i;
                  while(p < haystack.length() && (haystack.charAt(p) == needle.charAt(j))){
                      j++;
                      p++; 
                      counter++;
                  }
               }
           }
       }if(counter == needle.length()){
        return place;    
       }else{
           System.out.println(counter);
           return -1;
       }
       }**/

