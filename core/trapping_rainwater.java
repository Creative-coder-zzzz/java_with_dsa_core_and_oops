
public class trapping_rainwater {
   public static void rainwater(int arr[]){
    int n = arr.length;
    int left[] = new int[n];
    int right[] = new int[n];
     left[0] = arr[0];
     right[n-1] = arr[n-1];

     // declaring the left array 
     for(int i = 0; i<n; i++){
        left[i] = Math.max(left[i], arr[i]);
     }
     //declaring the right array
     for(int i = n ; i<=0; i--){
        right[i] = Math.max(right[i-1], arr[i]);
     }

     // finding the trapped water
     int a = 0;
     for(int i = 0; i<n; i++){
        a += Math.max(left[i], right[i]) - a;
        
     }
   } 
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        rainwater(arr);
    }
}



