
public class searchInaSorted2Dmatrix {
    
    public static boolean staircasemethod(int arr[][], int key){
        int row = arr.length-1;
        int col = 0;
        
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println("found key at index : ("+row+" "+col+")");
                return true;
            }
            else if(key>arr[row][col]){
                col++;
            }
            else{
                row--;
            }

        }
        System.out.println("Not found");
        return false;
       
        }
    
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}};
       
        staircasemethod(arr, 33);

    }
}
