import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Arrays;

// Queue don't implement with Arrays. Linklist is the best option.
class QueueArrays<T>{
  T first=null;
  T last=null;
  int size=0;
  ArrayList<T> queue;
  
  public QueueArrays(){
    this.queue = new ArrayList<>(10);
    this.first=null;
    this.last=null;
    this.size=0;
  }

  public QueueArrays enqueue(T value){
    this.queue.add(value);
    size++;
    if(size==1)
      this.first=this.queue.get(0);
    printQueue();
    return this;
  }

  public T peek(){
    return this.first;
  }

  @SuppressWarnings("unchecked")
  public void printQueue(){
System.out.println(this.queue.stream().map(Object::toString).collect(Collectors.joining(",", "[", "]")));
  }

  /*
  public static Class<?> getCollectionType(Class<?> aClass, String collectionName){
    Field field = aClass.getDeclaredField(collectionName);
    ParameterizedType genericType = (ParameterizedType) field.getGenericType();
    return (Class<?> ) genericType.getActualTypeArguments()[0];
  }
  */
  
}