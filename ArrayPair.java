import java.util.Calendar;

class ArrayPair {
  public void printArrayPair(String[] args) {
    System.out.println("Hello world!");
   
    char[] arr = new char[]{'a','b','c','d','e'};
    
    for(int i=0; i < arr.length; i++){
        for(int j=0; j<arr.length; j++){
          System.out.println("(" + arr[i] + "," + arr[j] + ")" );
        }
      }
   
}
}