class RotateArray {
    
    // int k=3;
    //int[] nums = {1,2,3,4,5,6,7};
    int k=2;
    int[] nums = {-1,-100,3,99}; //3,99,-1,-100
    
     public void rotate() {
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        for (int num : nums){
          System.out.println(num);
        }
    }
    
    public void reverse(int[] nums, int start, int end){
        int temp;
        while(start<end){
        temp=nums[start];
        nums[start++]=nums[end];
        nums[end--]=temp;
        }
    }
    
}