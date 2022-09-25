import java.util.HashSet;
import java.util.Optional;

class FirstRecurringElement {
  // int arr1[] = {2,5,1,2,3,4,5};
  int arr1[] = null;

  public Optional<Integer> getFirstRecurringElement(){

    if (arr1 == null || arr1.length <=1){
      System.out.println("Null");
      return Optional.empty();
    }
    
    HashSet<Integer> lookup = new HashSet<>(); 

    for (int i=0; i<arr1.length; i++){
      if(lookup.contains(arr1[i])){
        return Optional.of(arr1[i]);
      }
      else{
        lookup.add(arr1[i]);
      }
    }
    return Optional.empty();
  }
  
}