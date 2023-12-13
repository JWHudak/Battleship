
public class Main {
    public static void main(String[] args) {
        Grid a = new Grid();
        GridView b =  new GridView();
        GridController battleship = new GridController(a, b);
        Battleship yes = new Battleship(battleship);
        yes.playGame();
    }
}
