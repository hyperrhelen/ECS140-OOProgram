public class Delta{
  private int num, initial, delta;

  Delta(int num, int initial, int delta):Seq(){
    this.num = num;
    this.initial = initial;
    this.delta = delta;
  }
  private void toString(){
    System.out.println("< " + this.num + " : " + this.initial + "&" + this.delta + " > ");
  }
}// class Delta
