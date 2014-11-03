public class ConstantIt implements SeqIt {
  private Constant s;
  int index;
  ConstantIt( Constant s){
    super();
    this.s = s;
    index = 0;
  }
  //any more elements?
  public boolean hasNext(){

     if (index < s.num)
       return true;
     else
       return false;
  }
// return the next eleemnt and advance iterator to following item
  public int next(){
 
    if (index >= s.num ){
      System.err.println("ConstantIt called past end");
      System.exit(1);
    }
    if (s.num == 0)
      System.exit(1);
    index++;
    return s.value;
  
  }
}
