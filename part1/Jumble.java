public class Jumble extends Seq{

  protected int [] values ;


  Jumble(int [] values){
    super();
    this.values = new int [values.length];
    for (int i = 0; i < values.length; i++){
	this.values[i] = values[i];
    }
  }

  public String toString(){
    System.out.print("{ " + values.length + " : ");
    for (int i = 0; i < this.values.length; i++){
      System.out.print(this.values[i] + " " );
    }
    return "}";
  } 

}//Jumble
