
public class sortedMatriSearch {
    public static void search(int arr[][], int key){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[i][j]==key){
                    System.out.print(i+" "+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        int key = 15;
        search(arr,key);
    }
}
