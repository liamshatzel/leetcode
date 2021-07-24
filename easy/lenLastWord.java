class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length() - 1; 
        int counter = 0;
        while(counter == 0 && n >= 0 && s.charAt(n) == ' ') {
            n--;
        }
        while(n >= 0 && s.charAt(n--) != ' '){
            counter++;
        }
        return counter;
    }
}
    /**   boolean last = false;
       int counter = 0;
       if(s.length() == 1 && s.charAt(0) != ' '){
        return 1;
    }
       if(s.charAt(s.length() -1) == ' ' && s.length() > 1){
           s = s.substring(0, s.length() -2);
       }
       for(int i = s.length() - 1; i >= 0; i--) {
          if(s.charAt(i) == ' ' && i != s.length() -1) {
             counter = i;
             last = true; 
             break;
          }
       }
          if(last == true){
              String n = s.substring(counter, s.length() -1);
              if(n.charAt(0) != ' '){
              return n.length();
              }else{
                  return 0;
              }
          }else{
              return 0;
          }**/
