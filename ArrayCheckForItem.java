import java.util.Map;
import java.util.HashMap;

public class ArrayCheckForItem{
  
  char[] arr1 = new char[]{'a', 100,'c','x'};
  char[] arr2 = new char[]{'z', 100, 'e'};
  
  
  public boolean hasCommonElement1( ){
    Map<Character, Object> search_array = new HashMap<>();
    for (int i=0; i< arr1.length; i++){
      if(!search_array.containsKey(arr1[i])){
        search_array.put(arr1[i], true);
      }
    }
    System.out.println(search_array);

    for (int i=0; i<arr2.length; i++){
      if(search_array.containsKey(arr2[i])){
        return true;
      }
    }
    return false;
  }

  // public boolean hasCommonElement2( ){
  //   Map<Character, Object> search_array = new HashMap<>();
  //   for (int i=0; i< arr1.length; i++){
  //     if(!search_array.containsKey(arr1[i])){
  //       search_array.put(arr1[i], true);
  //     }
  //   }
  //   System.out.println(search_array);

  //   return arr2.stream().filter(search_array :: containsKey);

  // }

  
}
