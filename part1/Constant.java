public class Constant extends Seq{
  private int num, value;

  Constant( int num, int value){
    super();
    this.num = num;
    this.value = value;
  }
  public String toString(){
    return "[ " + this.num + " : " + this.value + " ]" ;
  }

}
