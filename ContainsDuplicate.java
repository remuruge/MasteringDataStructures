import java.util.HashSet;
class ContainsDuplicate {
    
    public static void main(String[] args){
        ContainsDuplicate sl = new ContainsDuplicate();
      //  int[] nums = {1,2,3,1}; true
       // int[] nums = {1,2,3,4}; false
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        sl.containsDuplicate(nums);
    }
    
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> lookup = new HashSet<>();
        if (nums.length <= 1){
            return false;
        }
        
        for(int num: nums){
            if(lookup.contains(num)){
                return true;
            }
            lookup.add(num);
        }
        return false;
    }
    
}