public class Jumble{

  private int [] values ;


  Jumble(int [] values):Seq(){
    this.values = new int [values.length()];
    for (int i = 0; i < values.length(); i++){
	this.values[i] = values[i];
    }
  }

  private void toString(){
    System.out.print(" { ");
    for (int i = 0; i < values.length(); i++){
      System.out.print(values[i] + " " );
    }
    System.out.println(" } ");
  } 

}//Jumble
