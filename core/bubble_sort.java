
public class bubble_sort {

    public static void sort(int arr[]){
        
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j = 0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            }
        }
    }

    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.err.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,3,2,4};
        sort(arr);
        print(arr);
    }
}
