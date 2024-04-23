
public class buy_and_sell_stock {
    public static void stock(int arr[]){
        int buy = Integer.MAX_VALUE;
        int Maxprofit = Integer.MIN_VALUE;
        
        for(int i = 0; i<arr.length; i++){
            if(buy<arr[i]){
               int profit = arr[i] - buy;
                Maxprofit = Math.max(Maxprofit, profit);
            }
            else{
                buy = arr[i];
            }
          
            
        }
        System.out.println(Maxprofit);
       
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        stock(arr);
    }
}
