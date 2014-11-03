public class ConstantIt implements SeqIt {
  private Constant s;
  int index;
  ConstantIt( Constant s){
    super();
    this.s = s;
    index = 1;
  }
  //any more elements?
  public boolean hasNext(){

     if (index == 1)
       return true;
     else
       return false;
  }
// return the next eleemnt and advance iterator to following item
  public int next(){

    if (index > 0){
      System.err.println("ConstantIt called past end");
      System.exit(1);
    }
//    if (s.num == 0)
//      return null;
    index++;
    return s.value;
  
  }
}
