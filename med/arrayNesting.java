class Solution {
    public int arrayNesting(int[] nums) {
       boolean[] visited = new boolean[nums.length];
       int res = 0;
       for(int i = 0; i < nums.length; i++){
           if(visited[i] == false){
               int count = 0;
                int start = nums[i];
                do{
                    start = nums[start];
                    count++;
                    visited[start] = true;
                }while(start != nums[i]);
                    res = Math.max(res, count);
           }
       }

        return res;
    }
}
//Messed up spacing
