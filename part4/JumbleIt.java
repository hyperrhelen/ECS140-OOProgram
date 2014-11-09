public class JumbleIt implements SeqIt {
  private Jumble s;
  private int index;

  JumbleIt(Jumble s){
    super();
    this.s = s;
    int index = 0;
  }
  public boolean hasNext(){
    if (index < s.values.length)
      return true;
    else
      return false;
  }

  public int next() throws UsingIteratorPastEndException{
    if (hasNext() == false){
//      System.err.println("JumbleIt called past end");
      throw new UsingIteratorPastEndException("= caught UsingIteratorPastEndException from JumbleIt");
//      System.exit(1);
    }
      index++;
      return s.values[index-1];
  }  
}
