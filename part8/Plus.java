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
    if (delta == 0){
      return new Constant(num, initial);
    }
    return new Delta(num, initial, delta);
  }

  public static Seq plus(Jumble x, Jumble y){
    int [] values;
    if(x.values.length == 0 || y.values.length == 0){
       return new Constant(0, 0);
    }
    else if (x.values.length > y.values.length){
      values = new int [y.values.length];
    }
    else{
      values = new int [x.values.length];
    }
    for (int i = 0; i < values.length; i++){
      values[i] = x.values[i] + y.values[i];
    }
    boolean tval = false;
    int diff = 0, temp = 0; ;
    for (int i = 0; i < values.length; i++){
      if(i == ( values.length - 1)){
        tval = true;
      }// if this is the last index of the array
      else{
        if ( i == 0 ){
          diff = values[i+1] - values[i];
          tval = true;
        } // that means it's the very first one
        else{
	  temp = values[i+1]-values[i];
          if (diff == temp){
             tval = true;
          }
          else{
            tval = false;
            return new Jumble(values);
          }
        }//somewhere in the inbetweens but isn't last
      }//
    }
    if (diff == 0)
	return new Constant(values.length, values[0]);
    else
        return new Delta(values.length, values[0], diff);
//    return new Jumble(0);
  }
  public static Seq plus(Constant x, Delta y){
    int num, initial, delta;
    if (x.num == 0 || y.num == 0){
      num = 0;
      initial = 0;
      delta = 0;
    }
    else{
      if (x.num > y.num){
        num = y.num;
      }
      else
        num = x.num;
    }
      initial = y.initial + x.value;
      delta = y.delta;
    if (delta == 0){
	return new Constant(num, initial);
    }
    return new Delta(num, initial, delta);
  }

  public static Seq plus(Delta y, Constant x){
    int num, initial, delta;
    if (x.num == 0 || y.num == 0){
      num = 0;
      initial = 0;
      delta = 0;
    }
    else{
      if (x.num > y.num){
        num = y.num;
      }
      else
        num = x.num;
    }
      initial = y.initial + x.value;
      delta = y.delta;
    if (delta == 0){
	return new Constant (num, initial);
    }
    return new Delta(num, initial, delta);
  } // copied and pasted from the previous one but just switched x & y

  public static Seq plus(Constant x, Jumble y){
    int [] values;
    int num, initial, delta;
    if(x.num == 0 || y.values.length == 0){
      values = new int [0];
      return new Constant(0, 0);
    }
    else if (x.num > y.values.length){
      values = new int [y.values.length];
      for (int i = 0; i < y.values.length; i++){
        values[i] = y.values[i] + x.value;
      }
    }
    else{
      values = new int [x.num];
      for (int i = 0; i < x.num; i++){
	values[i] = y.values[i] + x.value;
      }
    }
    boolean tval = false;
    int diff = 0, temp = 0; ;
    for (int i = 0; i < values.length; i++){
      if(i == ( values.length - 1)){
        tval = true;
      }// if this is the last index of the array
      else{
        if ( i == 0 ){
          diff = values[i+1] - values[i];
          tval = true;
        } // that means it's the very first one
        else{
          temp = values[i+1]-values[i];
          if (diff == temp){
             tval = true;
          }
          else{
            tval = false;
            return new Jumble(values);
          }
        }//somewhere in the inbetweens but isn't last
      }//
    }
    if (diff == 0)
        return new Constant(values.length, values[0]);
    else
        return new Delta(values.length, values[0], diff);
  }

  public static Seq plus(Jumble y, Constant x){
    int [] values;
    if(x.num == 0 || y.values.length == 0){
      values = new int [0];
      return new Constant(0, 0);
    }
    else if (x.num > y.values.length){
      values = new int [y.values.length];
      for (int i = 0; i < y.values.length; i++){
        values[i] = y.values[i] + x.value;
      }
    }
    else{
      values = new int [x.num];
      for (int i = 0; i < x.num; i++){
        values[i] = y.values[i] + x.value;
      }
    }
    boolean tval = false;
    int diff = 0, temp = 0; ;
    for (int i = 0; i < values.length; i++){
      if(i == ( values.length - 1)){
        tval = true;
      }// if this is the last index of the array
      else{
        if ( i == 0 ){
          diff = values[i+1] - values[i];
          tval = true;
        } // that means it's the very first one
        else{
          temp = values[i+1]-values[i];
          if (diff == temp){
             tval = true;
          }
          else{
            tval = false;
            return new Jumble(values);
          }
        }//somewhere in the inbetweens but isn't last
      }//
    }
    if (diff == 0)
        return new Constant(values.length, values[0]);
    else
        return new Delta(values.length, values[0], diff);
  }// same as the previous functin but switched x and y

  public static Seq plus(Delta x, Jumble y){
    int [] values;
    if(x.num == 0 || y.values.length == 0){
      values = new int [0];
      return new Constant(0, 0);
    }
    else if (x.num > y.values.length){
      values = new int [y.values.length];
      for (int i = 0; i < y.values.length; i++){
        values[i] = y.values[i] + x.initial+(x.delta*i);
      }
    }
    else{
      values = new int [x.num];
      for (int i = 0; i < x.num; i++){
        values[i] = y.values[i] + x.initial+(x.delta*i);
      }
    }
    boolean tval = false;
    int diff = 0, temp = 0; ;
    for (int i = 0; i < values.length; i++){
      if(i == ( values.length - 1)){
        tval = true;
      }// if this is the last index of the array
      else{
        if ( i == 0 ){
          diff = values[i+1] - values[i];
          tval = true;
        } // that means it's the very first one
        else{
          temp = values[i+1]-values[i];
          if (diff == temp){
             tval = true;
          }
          else{
            tval = false;
            return new Jumble(values);
          }
        }//somewhere in the inbetweens but isn't last
      }//
    }
    if (diff == 0)
        return new Constant(values.length, values[0]);
    else
        return new Delta(values.length, values[0], diff);
  }

  public static Seq plus(Jumble y, Delta x){
    int [] values;
    if(x.num == 0 || y.values.length == 0){
      values = new int [0];
      return new Constant(0, 0);
    }
    else if (x.num > y.values.length){
      values = new int [y.values.length];
      for (int i = 0; i < y.values.length; i++){
        values[i] = y.values[i] + x.initial+ x.delta*i ;
      }
    }
    else{
      values = new int [x.num];
      for (int i = 0; i < x.num; i++){
        values[i] = y.values[i] + x.initial + x.delta * i;
      }
    }
    boolean tval = false;
    int diff = 0, temp = 0; ;
    for (int i = 0; i < values.length; i++){
      if(i == ( values.length - 1)){
        tval = true;
      }// if this is the last index of the array
      else{
        if ( i == 0 ){
          diff = values[i+1] - values[i];
          tval = true;
        } // that means it's the very first one
        else{
          temp = values[i+1]-values[i];
          if (diff == temp){
             tval = true;
          }
          else{
            tval = false;
            return new Jumble(values);
          }
        }//somewhere in the inbetweens but isn't last
      }//
    }
    if (diff == 0)
        return new Constant(values.length, values[0]);
    else
        return new Delta(values.length, values[0], diff);

  }

}//Plus
