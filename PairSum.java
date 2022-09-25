import java.util.HashSet;
class PairSum{

  int[] arr1 = new int[]{1, 2, 4, 4};// true
  int[] arr2 = new int[]{1, 3, 4, 9};// false
  int num = 8;

  //naive solution
  public boolean  naive_hasPairWithSum(){
    for (int i=0; i<arr1.length; i++){
      for (int j=0; j<arr1.length; j++){
        if (i != j && arr1[i] + arr1[j] == num){
          return true;
        }
      }      
    }
    return false;
  }
//O(a*b) = O(n^2) quadratic time
//O(1) = constant space

  //better solution
  public boolean hasPairWithSum(){
    HashSet<Integer> comp = new HashSet<Integer>();
    for (int i=0; i<arr1.length; i++){
      if(comp.contains(num-arr1[i])){
        return true;
      }
      comp.add(arr1[i]); 
    }
    return false;    
  }
//O(n) = linear time
//O(n) = linear space  
  
}