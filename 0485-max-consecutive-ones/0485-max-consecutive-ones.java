class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int n= nums.length;
       int maxcount=0;
       int count=0;
       for(int i=0;i<n;i++){
        if(nums[i]==1){
            count++;
            if(maxcount<count){
            maxcount=count;

        }
        }
       
        else 
        count=0;
       } return maxcount;
    }
}