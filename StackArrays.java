import java.util.Objects;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StackArrays{
  ArrayList<String> stack;
  int stack_size = 0;
  
  public StackArrays(){
    this.stack = new ArrayList<String>();
  }

  public StackArrays push(String value){
    this.stack.add(value);
    this.stack_size++;
    return this;
  }

  public String peek(){
    if (this.stack_size>0){
      return this.stack.get(this.stack_size-1); 
    }
    return null;
  }

  public StackArrays pop(){
    if (this.stack_size>0){
      this.stack_size--;
      printStack();
      return this; 
    }
    return null;
  }

  public void printStack(){
System.out.println(this.stack.stream().collect(Collectors.joining(",", "[", "]")));
  }

  // @Override
  //   public String toString() {
  //       return Arrays.toString(queue);
  //   }
  
}