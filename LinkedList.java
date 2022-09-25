import java.util.ArrayList;
import java.util.Objects;

class LinkedList {
  Node tail;
  Node head;
  int length;

  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public LinkedList(int data) {
    Node node = new Node(data);
    this.head = node;
    this.tail = node;
    this.length = 1;
  }

  public void append(int data) {
    Node node = new Node(data);
    this.tail.next = node;
    this.tail = node;
    this.length++;
  }

  public void display() {
    Node n1;
    ArrayList<Integer> arr = new ArrayList<>();
    n1 = this.head;
    for (int i = 0; i < length; i++) {
      arr.add(n1.data);
      n1 = n1.next;
    }

    arr.stream().forEach(System.out::println);
  }

  public void insert(int inx, int data){
    Node node = new Node(data);
    Node temp = this.head;
    for (int i = 1 ; i < inx; i++){
      temp = temp.next;
    }
    node.next = temp.next;
    temp.next = node;
    this.length++;
  }

  public LinkedList reverse(){
    if (Objects.isNull(this.head.next))
      return this;
    Node first = this.head;
    Node second = first.next;
    
    while(!Objects.isNull(second)){
      Node temp = second.next;
      second.next = first;
      first = second;
      second = temp;
    }
     this.head.next = null;
     this.tail = this.head;
     this.head = first;
    return this;
  }
  
}