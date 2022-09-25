class MoveZeroes {
    // public static void main(String[] args){
    //     Solution sl = new Solution();
    //     int[] nums = {0,1,0,3,12};
    //     sl.moveZeroes(nums);
    // }
    public void moveZeroes(int[] nums) {
        if (nums.length <=1)
        {
            return;
        }
        int zero_index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0 && nums[zero_index]==0){
                nums[zero_index]=nums[i];
                nums[i]=0;
                zero_index++;
            }
        }
            
        
    }
}

// Expected nums = {1,3,12,0,0}
// nums = {0}