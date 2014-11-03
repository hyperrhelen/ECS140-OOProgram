public class JumbleUser{
 
  public static int lengthLongestNDCSS1(Jumble j){
    int length = 0;
    int temp = 0;
    int cur = 0, next = 0 ;
    JumbleIt itr = new JumbleIt(j);
    if(itr.hasNext()){
      cur = next = itr.next();
      temp++;
      length++;
    }
    while(itr.hasNext()){
      next = itr.next();
      if(next >= cur)
	temp++;
      else
        temp = 1;
      if (temp > length)
        length = temp;
      cur = next;
    }

    return length; 
  } //NDCSS stands for non-decreasing contiguous subsequence

}
