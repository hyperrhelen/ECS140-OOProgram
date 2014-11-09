public class Plus{

  public static Seq plus(Constant x, Constant y){
    int num, value; 
    if(x.num == 0 || y.num == 0){
	num = 0;
	value = 0;
    }//if
    else{
      if( x.num > y.num){
        num = y.num;
      } 
      else
        num = x.num;
      value = x.value + y.value;
    }//else
    return new Constant(num, value);
  }//SeqPlus

  public static Seq plus(Delta x, Delta y){
    int num, initial, delta;
    if(x.num == 0 || y.num == 0){
	num = 0;
	initial = 0;
	delta = 0;
    }
    else{
      if(x.num > y.num)
        num = y.num;
      else
        num = x.num;
      initial = x.initial + y.initial;
      delta = x.delta + y.delta;
    }
    return new Delta(num, initial, delta);
  }

  public static Seq plus(Jumble x, Jumble y){
    int [] values;
    if(x.values.length == 0 || y.values.length == 0){
      values = new int [0];
    }
    else if (x.values.length > y.values.length){
      values = new int [y.values.length];
    } 
    else{
      values = new int [x.values.length];
    }
    for (int i = 0; i < values.length; i ++){
      values[i] = x.values[i] + y.values[i];
    }
    return new Jumble(values);
//    return new Jumble(0);
  }
}//Plus
