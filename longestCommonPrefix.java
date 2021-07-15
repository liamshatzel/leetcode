class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String compare = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(compare) != 0){   
                compare = compare.substring(0, compare.length() -1);
            }
         }
        if(compare.isEmpty()){
            return "";
        }
        return compare;
    }
 }
     
    



