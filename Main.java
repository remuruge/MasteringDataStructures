import java.util.Calendar;
import java.util.Optional;

class Main {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
  //   System.out.println("Hello world!");
  //   Calendar calendar = Calendar.getInstance();

  //   String[] arr = new String[]{"Nemo"};
  //   long start_time = calendar.getTimeInMillis();
  //   for(int i=0; i < arr.length; i++){
  //       if("Nemo".equals(arr[i])){
  //         System.out.println("Found Nemo");
  //       }
  //     }
  //   long duration = calendar.getTimeInMillis() - start_time;
  // System.out.println(duration + " milliseconds execution time");
  
  // ArrayPair ap = new ArrayPair();
  // ap.printArrayPair(args);   

  // ArrayCheckForItem acf = new ArrayCheckForItem();
  // System.out.println(acf.hasCommonElement2()); 

  // PairSum ps = new PairSum();
  // System.out.println(ps.hasPairWithSum());
  // }

    // ArraysImpl arr1 = new ArraysImpl();
    // arr1.push(1);

  // RotateArray rarray = new RotateArray();
  //   rarray.rotate();

    // FirstRecurringElement firstReccElem = new FirstRecurringElement();
    // Optional<Integer> optional = firstReccElem.getFirstRecurringElement();
    // optional.ifPresent(val -> System.out.println(val));


  // LinkedList ll = new LinkedList(1);
  // ll.append(3);
  // ll.append(56);
  // ll.append(2);
  // ll.append(10);
  // ll.display();
  // ll.insert(2, 15);
  // ll.display();
  // System.out.println("Reverse LinkedList");  
  // LinkedList l2 = ll.reverse();
  // l2.display();  

  // StackLinkedList stack = new StackLinkedList();
  // stack.push(1);  
  // stack.push(2);
  // stack.push(3);
  // stack.push(4);
  // stack.push(5);
  // stack.peep();
  // System.out.println("Pop 1 element");
  // stack.pop();
  // stack.peep();  

    // StackArrays arrayStack = new StackArrays();
    // arrayStack.push("Monday");
    // arrayStack.push("Tuesday");
    // Optional<String> opt = Optional.of(arrayStack.peek());
    // opt.ifPresent(peekElement -> System.out.println(peekElement));
    // arrayStack.pop();

    QueueArrays<String> queue = new QueueArrays<>();
    queue.enqueue("Jack");
    queue.enqueue("James");
    queue.enqueue("Jill");
    Optional<String> optional = Optional.of(queue.peek());
    optional.ifPresent(queue_element -> System.out.println(queue_element));
    // QueueArrays<Integer> queue = new QueueArrays<>();
    // queue.enqueue(1);
    // queue.enqueue(2);
    // queue.enqueue(3);
    
  }
}