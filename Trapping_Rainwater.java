public class Trapping_Rainwater{
  public static void main(String args[]){
    int[] rainwaterarray=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
    int sum=0,max=Integer.MIN_VALUE,cur=0,spill=0,overspill=0,temp=0;
    for(int i=0;i<rainwaterarray.length;i++){
      cur+=1;
      if(rainwaterarray[i]>=max){
        max=rainwaterarray[i];
        cur=0;
        overspill=0;
      }
      else{
        temp=max-rainwaterarray[i];
        sum+=temp;
      }
      if(i!=0){
        if(rainwaterarray[i]>rainwaterarray[i-1]){
          spill=cur*(max-rainwaterarray[i]);
          overspill=0;
        }
        else if(rainwaterarray[i]<max){
          overspill+=max-rainwaterarray[i];
        }
      }
    }
    sum=sum-spill-overspill;
    System.out.println("Water Collected is : "+sum);
  }
}
