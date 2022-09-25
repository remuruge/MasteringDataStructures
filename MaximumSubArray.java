class Solution {
    
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] nums1= {-2,1,-3,4,-1,2,1,-5,4}; //6
        int[] nums2 = {1}; //1
        int[] nums3 = {5,4,-1,7,8}; //23
        System.out.println(sl.maxSubArray(nums2));
    }
  
    public int maxSubArray(int[] nums) {
        int max_sum = 0;
        int current_sum = 0;
        if(nums.length == 1){
            return nums[0];
        }
        for (int num : nums){
            current_sum = current_sum + num;
            if (current_sum < 0){
                current_sum = 0;
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }
}