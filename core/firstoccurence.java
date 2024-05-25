public class firstoccurence {
    
    public static int occurence(int arr[], int i, int key){
        if(arr[i]==key){
            return i;
        }
        if(i == arr.length){
           
                return -1;
        }
       
        
        return occurence(arr, i+1, key);  
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i = 0;
        int key = 5;
        System.out.println(occurence(arr, i, key));
    }
}
