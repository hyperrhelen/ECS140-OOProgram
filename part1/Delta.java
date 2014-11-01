public class Delta extends Seq{
  protected int num, initial, delta;

  Delta(int num, int initial, int delta){
    super();
    this.num = num;
    this.initial = initial;
    this.delta = delta;
  }
  public String toString(){
    if(this.num != 0)
      return "< " + this.num + " : " + this.initial + " &" + this.delta + " >";
    else
      return "< 0 : 0 &0 >";
  }
}// class Delta
