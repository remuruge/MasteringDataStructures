class ArraysImpl{
  int length;
  int[] data;
  
  ArraysImpl(){
    this.length = 0;
  }

  public int get(int index){
    if (this.length > 0){
      return data[index];
    }
    return 0;
  }

  public void push(int value){
    data[this.length] = value;
    this.length++;
  }
  
}