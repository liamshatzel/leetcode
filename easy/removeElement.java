class Solution {
    public int removeElement(int[] nums, int val) {
     int counter = 0;
     int n = nums.length;
     for(int p = 0; p < n; p++){
             if(nums[p] != val){
                 nums[counter] = nums[p];
                 counter++;
             }
         }

    return counter;

    }
}

     /** bubble sort:
     for(int i = 0; i < n - 1; i++){
        for(int j = 0; j < n - i - 1; j++){
            
            if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp; 
            }
        }
     }
     System.out.println(counter);
     return nums.length - counter;**/
     
