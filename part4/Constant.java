public class Constant extends Seq{
  protected int num, value;

  Constant( int num, int value){
    super();
    this.num = num;
    this.value = value;
  }
  public String toString(){
  if (this.num == 0){
    this.value = 0;
  }
    return "[ " + this.num + " : " + this.value + " ]" ;
  }

  public int min(){

    return value;
  }


}
