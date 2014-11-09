public class DeltaIt implements SeqIt {
  private Delta s;
  private int index; 
  DeltaIt(Delta s){
    super();
    this.s = s;
    this.index = 0;
  }
  public boolean hasNext(){
    if (index < s.num)
      return true;
    else
      return false;
  }//hasNext

  public int next() throws UsingIteratorPastEndException{
    if (index >= s.num){
//      System.err.println("DeltaIt called past end");
      throw new UsingIteratorPastEndException("= caught UsingIteratorPastEndException from DeltaIt");
//      System.exit(1);
    }
    index++;
    return s.initial + s.delta * (index - 1);
  }//next();

}

