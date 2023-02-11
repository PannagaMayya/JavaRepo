public class Stck_max_profit{
  public static void main (String args[]){
    int stockArray[]={4,7,9,1,10};
    int buyPrice=Integer.MAX_VALUE,maxProfit=0;
    for (int i=0;i<stockArray.length;i++){
      if(stockArray[i]>buyPrice){
        maxProfit=Math.max(maxProfit,(stockArray[i]-buyPrice));
      }
      else{
        buyPrice=stockArray[i];
      }
    }
    if(maxProfit!=0){
     System.out.println("Maximum Profit is : "+maxProfit);
      }
    else{
       System.out.println("No Profit can be earned");
     }
  }
}
