public class Constant{
  private int num, value;

  Constant( int num, int value):Seq(){
    this.num = num;
    this.value = value;
  }
  private void toString(){
    System.out.println("[ " + num + " : " + value + " ] " );
  }

}
