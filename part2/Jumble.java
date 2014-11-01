public class Jumble extends Seq{

  private int [] values ;


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

  public int min(){
    int min = 0;
    if (values.length == 0)
	return 0;
    else if (values.length > 0){
	for (int i = 0; i < values.length; i++){
	  if (i == 0)
	      min = values[i];
	  else if (values[i] < min)
	      min = values[i];
        }
    }
    return min;
  }

}//Jumble
