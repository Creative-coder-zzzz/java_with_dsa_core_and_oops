
public class diagonalsum {
    
    public static void diagonal(int arr[][]){
        int k = 0;
        int l = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(i == j ){
                 k = k + arr[i][j];
                }
                if((i+j) == (arr.length-1)){
                    l = l+arr[i][j];
                }
            }
        }
           System.out.println(k+l);


        }
    
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonal(arr);
    }
}
