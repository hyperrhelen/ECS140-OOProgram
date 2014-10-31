public class Delta extends Seq{
  private int num, initial, delta;

  Delta(int num, int initial, int delta){
    super();
    this.num = num;
    this.initial = initial;
    this.delta = delta;
  }
  public String toString(){
    return "< " + this.num + " : " + this.initial + " &" + this.delta + " >";
  }
}// class Delta
