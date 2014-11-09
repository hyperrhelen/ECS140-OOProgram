public class Delta extends Seq{
  protected int num, initial, delta;

  Delta(int num, int initial, int delta){
    super();
    this.num = num;
    this.initial = initial;
    this.delta = delta;
  }
  public String toString(){
    if (this.num == 0){
	this.initial = 0;
	this.delta = 0;
    }
    return "< " + this.num + " : " + this.initial + " &" + this.delta + " >";
  }

  public int min(){
//    if(delta > initial)
//    return 0;
    if (delta < 0){
      return initial + delta*(num-1);
    }
    else
      return initial;
//    else
//      return delta;
  }
  public SeqIt createSeqIt(){

    return new DeltaIt(this);
  }


}// class Delta
