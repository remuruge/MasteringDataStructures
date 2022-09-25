import java.util.Objects;

class StackLinkedList{
  Node top;
  Node bottom;
  int len;
  
  class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public StackLinkedList(){
    this.top    = null;
    this.bottom = null;
    this.len    = 0;
  }

  public StackLinkedList push(int data){
    Node temp = new Node(data);
    if (Objects.isNull(top)){  
      this.bottom  = temp;
    } else{
    this.top.next  = temp;
    }
    this.top     = temp;
    this.len++;
    return this;
  }

  public Node pop(){
    Node temp = null;
    if (Objects.isNull(top)){
      return null;
    }
    if (top == bottom){
      this.len--;
      temp = this.top;
      this.top = this.bottom = null;
      return temp;
    }
    temp = this.bottom;
    for(int i=1; i<this.len-1; i++){
      temp = temp.next;
    }
    this.top = temp;
    temp     = this.top.next;
    this.top.next = null;
    this.len--;
    return temp;
  }
  
  public void peep(){
    Node temp = this.bottom;
    while(!Objects.isNull(temp)){
      System.out.println(temp.data);
      temp = temp.next;
    }
    
  }
  
}