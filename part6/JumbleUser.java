public class JumbleUser{
 
  public static int lengthLongestNDCSS1(Jumble j){
    int length = 0;
    int temp = 0;
    int cur = 0, next = 0 ;
    JumbleIt itr = new JumbleIt(j);
    if(itr.hasNext()){
     try{
      next = itr.next();
      cur = next;
      temp++;
      length++;
     }
     catch(UsingIteratorPastEndException e){
	System.err.println("= caught UsingIteratorPastEndException from JumbleIt");
     }
    }
    while(itr.hasNext()){
     try{
      next = itr.next();
      if(next >= cur)
	temp++;
      else
        temp = 1;
      if (temp > length)
        length = temp;
      cur = next;
     }
      catch(UsingIteratorPastEndException e){
	System.err.println("= caught UsingIteratorPastEndException from JumbleIt");
      }
    }

    return length; 
  } //NDCSS stands for non-decreasing contiguous subsequence

  public static int lengthLongestNDCSS2(Jumble j){
    int length = 0; 
    int temp = 0;
    int cur = 0, next = 0;
    JumbleIt itr = new JumbleIt(j);
    try{
      cur = next = itr.next();
      temp++;
      length++;
      while(true){
 	next = itr.next();
        if(next >= cur)
          temp++;
        else
          temp = 1;
        if(temp > length)
	  length = temp;
        cur = next;
      }//while()
    }
    catch(UsingIteratorPastEndException e){
//      System.err.println("= caught UsingIteratorPastEndException from JumbleIt");
    } 
    return length;
    // can not use hasNext, must use next and try catch in a meaningful way
  }

}
