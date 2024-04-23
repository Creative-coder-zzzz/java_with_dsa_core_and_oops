
public class countSort {
    public static void sort(int arr[]){
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxNum){
                maxNum = Math.max(maxNum, arr[i]);
            }
        }
        int count[] = new int[maxNum+1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }
        // sort
        int j =0; 
        for(int i = 0; i<count.length; i++){
            while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;
            }
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.err.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
     int arr[] = {1,2,4,1,3,4,2,5};
        sort(arr);
        print(arr);
    }
}
