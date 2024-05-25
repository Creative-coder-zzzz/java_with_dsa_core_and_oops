public class interfaces {
    public static void main(String[] args) {
        
    }
}

interface chessplayer{
    void move();
}
class queen implements chessplayer{
   public void move(){
    System.out.println("all dir");
    }
}
class rook implements chessplayer{
    public void move(){
        System.out.println("up,down,left,right");
    }
}