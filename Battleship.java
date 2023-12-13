import java.util.Scanner;


class Grid {
    private char[][] boardProtectOne = new char[11][11];
    private char[][] boardProtectTwo = new char[11][11];
    private char[][] boardAttackOne = new char[11][11];
    private char[][] boardAttackTwo = new char[11][11];
    private char[][] preset1 = {{'A', 'S', '~', '~', '~', '~', 'S', 'S', 'S', 'S', '~'},
                                {'B', 'S', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'C', 'S', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'D', 'S', '~', '~', '~', 'S', '~', '~', '~', '~', '~'},
                                {'E', 'S', '~', '~', '~', 'S', '~', '~', '~', '~', '~'},
                                {'F', '~', '~', '~', '~', 'S', '~', '~', '~', '~', '~'},
                                {'G', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'H', '~', 'S', 'S', 'S', '~', '~', '~', '~', '~', '~'},
                                {'I', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'J', '~', '~', '~', '~', '~', '~', '~', 'S', 'S', '~'},
                                {' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}};
    private char[][] preset2 = {{'A', '~', '~', 'S', '~', '~', '~', '~', '~', '~', 'S'},
                                {'B', '~', '~', 'S', '~', '~', '~', '~', '~', '~', 'S'},
                                {'C', '~', '~', 'S', '~', '~', '~', '~', '~', '~', 'S'},
                                {'D', '~', '~', '~', '~', '~', '~', 'S', '~', '~', 'S'},
                                {'E', '~', '~', '~', '~', '~', '~', 'S', '~', '~', 'S'},
                                {'F', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'G', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'H', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'I', '~', '~', '~', '~', '~', 'S', 'S', 'S', '~', '~'},
                                {'J', 'S', 'S', 'S', 'S', '~', '~', '~', '~', '~', '~'},
                                {' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}};
    private char[][] preset3 = {{'A', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'B', '~', '~', '~', 'S', 'S', 'S', '~', '~', '~', '~'},
                                {'C', 'S', 'S', 'S', 'S', '~', '~', '~', '~', '~', '~'},
                                {'D', '~', '~', '~', '~', '~', '~', '~', 'S', '~', '~'},
                                {'E', '~', '~', '~', '~', '~', '~', '~', 'S', '~', '~'},
                                {'F', '~', '~', 'S', 'S', '~', '~', '~', 'S', '~', '~'},
                                {'G', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'H', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'I', '~', '~', '~', '~', '~', 'S', 'S', 'S', 'S', 'S'},
                                {'J', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}};
    private char[][] preset4 = {{'A', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'B', '~', '~', '~', '~', '~', '~', '~', 'S', 'S', '~'},
                                {'C', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                                {'D', '~', '~', 'S', 'S', 'S', 'S', 'S', '~', '~', '~'},
                                {'E', '~', '~', '~', '~', '~', '~', 'S', '~', '~', '~'},
                                {'F', '~', '~', '~', '~', '~', '~', 'S', '~', '~', 'S'},
                                {'G', '~', '~', '~', '~', '~', '~', '~', '~', '~', 'S'},
                                {'H', '~', '~', '~', '~', '~', '~', '~', '~', '~', 'S'},
                                {'I', '~', '~', '~', '~', '~', 'S', 'S', 'S', '~', 'S'},
                                {'J', '~', '~', '~', '~', '~', '~', '~', '~', '~', 'S'},
                                {' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}};

    public Grid() {
        int alpha = 0;
        for(int i = 0; i < 10; i++) {
            boardProtectOne[10][i + 1] = (char) (i + 48);
            boardProtectTwo[10][i + 1] = (char) (i + 48);
            boardAttackOne[10][i + 1] = (char) (i + 48);
            boardAttackTwo[10][i + 1] = (char) (i + 48);;
        }
        for(char i = 'A'; i <= 'J'; i++) {
            boardProtectOne[alpha][0] = i;
            boardProtectTwo[alpha][0] = i;
            boardAttackOne[alpha][0] = i;
            boardAttackTwo[alpha][0] = i;
            alpha++;
        }
        for(int i = 0; i < boardAttackOne.length - 1; i++) {
            for(int j = 1; j < boardAttackOne.length; j++) {
                boardProtectOne[i][j] = '~';
                boardProtectTwo[i][j] = '~';
                boardAttackOne[i][j] = '~';
                boardAttackTwo[i][j] = '~';
            }
        }
        boardProtectOne[10][0] = ' ';
        boardProtectTwo[10][0] = ' ';
        boardAttackOne[10][0] = ' ';
        boardAttackTwo[10][0] = ' '; 
    }

    public void attackShip(int player, String location) {
        if(player == 1) {
            if(boardProtectTwo[((int) location.charAt(0)) - 65][(int) location.charAt(1) - 47] == 'S') {
                boardAttackOne[((int) location.charAt(0)) - 65][(int) location.charAt(1) - 47] = 'x';
                boardProtectTwo[((int) location.charAt(0)) - 65][(int) location.charAt(1) - 47] = 'x';
            }
            else{
                boardAttackOne[((int) location.charAt(0)) - 65][(int) location.charAt(1) - 47] = 'o';
                boardProtectTwo[((int) location.charAt(0)) - 65][(int) location.charAt(1) - 47] = 'o';
            }
        }
        if(player == 2) {
            if(boardProtectOne[((int) location.charAt(0)) - 65][(int) location.charAt(1) - 47] == 'S') {
                boardAttackTwo[((int) location.charAt(0)) - 65][(int) location.charAt(1) - 47] = 'x';
                boardProtectOne[((int) location.charAt(0)) - 65][(int) location.charAt(1) - 47] = 'x';
            }
            else {
                boardAttackTwo[((int) location.charAt(0)) - 65][(int) location.charAt(1) - 47] = 'o';
                boardProtectOne[((int) location.charAt(0)) - 65][(int) location.charAt(1) - 47] = 'o';
            }
        }
    }

    public char[][] getBoardAttackOne() {
        return boardAttackOne;
    }

    public char[][] getBoardAttackTwo() {
        return boardAttackTwo;
    }

    public char[][] getBoardProtectOne() {
        return boardProtectOne;
    }

    public char[][] getBoardProtectTwo() {
        return boardProtectTwo;
    }

    public char[][] getPresetOne() {
        return preset1;
    }

    public char[][] getPresetTwo() {
        return preset2;
    }

    public char[][] getPresetThree() {
        return preset3;
    }

    public char[][] getPresetFour() {
        return preset4;
    }

    public void choosePreset(int player, int preset) {
        if(player == 1) {
            if(preset == 1) {
                boardProtectOne = preset1;
            }
            else if(preset == 2) {
                boardProtectOne = preset2;
            }
        }
        if(player == 2) {
            if(preset == 1) {
                boardProtectTwo = preset3;
            }
            else if(preset == 2) {
                boardProtectTwo = preset4;
            }
        }
    }
}   

class GridView {
    public void displayPlayer(char[][] attack, char[][] protect) {
        for(char[] row : attack) {
            System.out.print("|");
            for(char space : row) {
                System.out.print(space + "|");
            }
            System.out.println();
        }
        for(int i = 0; i < 11; i++) {
            System.out.print("--");
        }
        System.out.println();
        for(char[] row : protect) {
            System.out.print("|");
            for(char space : row) {
                System.out.print(space + "|");
            }
            System.out.println();
        }
    }

    public void displayPreset(char[][] preset) {
        for(char[] row : preset) {
            System.out.print("|");
            for(char space : row) {
                System.out.print(space + "|");
            }
            System.out.println();
        }
    }
}    

class GridController {
    private Grid grids;
    private GridView gridViews;

    public GridController(Grid grids, GridView gridViews) {
        this.grids = grids;
        this.gridViews = gridViews;
    } 

    public void presetDisplay(char[][] preset) {
        gridViews.displayPreset(preset);
    }

    public void playerOneDisplay() {
        gridViews.displayPlayer(grids.getBoardAttackOne(), grids.getBoardProtectOne());
    }

    public void playerTwoDisplay() {
        gridViews.displayPlayer(grids.getBoardAttackTwo(), grids.getBoardProtectTwo());
    }

    public void attackShip(int player, String location) {
        grids.attackShip(player, location);
    }

    public void choosePreset(int player, int preset) {
        grids.choosePreset(player, preset);
    }

    public boolean PlayerOneWin() {
        for(char[] row : grids.getBoardProtectTwo()) {
            for(char space : row) {
                if(space == 'S') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean PlayerTwoWin() {
        for(char[] row : grids.getBoardProtectOne()) {
            for(char space : row) {
                if(space == 'S') {
                    return false;
                }
            }
        }
        return true;
    }

    public char[][] getPresetOne() {
        return grids.getPresetOne();
    }

    public char[][] getPresetTwo() {
        return grids.getPresetTwo();
    }

    public char[][] getPresetThree() {
        return grids.getPresetThree();
    }

    public char[][] getPresetFour() {
        return grids.getPresetFour();
    }
}

class Battleship {
    private GridController controller;

    public Battleship(GridController controller) {
        this.controller = controller;
    }

    public void playerOneTurn() {
        boolean valid = false;
        String space = "";
        Scanner input = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        while(valid == false) {
            controller.playerOneDisplay();
            System.out.println("Player One- Choose where to attack. (Ex. B7)");
            space = input.nextLine();
            if(space.length() == 2) {
                for(int i = 0; i < 11; i++) {
                    for(int j = 0; j < 11; j++) {
                        if(space.charAt(0) == (char) (i + 65) && space.charAt(1) == (char) (j + 48)) {
                            valid = true;
                            break;
                        }
                    }
                }
            }
            System.out.println("\033[H\033[2J");
            System.out.println("Invalid Square.");
        }
        controller.attackShip(1, space);
        System.out.println("\033[H\033[2J");
        controller.playerOneDisplay();
        System.out.println("Press ENTER to continue.");
        input.nextLine();
        if(controller.PlayerOneWin()) {
            System.out.println("Player One Wins!");
        }
        else {
            System.out.println("\033[H\033[2J");
            playerTwoTurn();
        }
    }

    public void playerTwoTurn() {
        boolean valid = false;
        String space = "";
        Scanner input = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        while(valid == false) {
            controller.playerTwoDisplay();
            System.out.println("Player Two- Choose where to attack. (Ex. B7)");
            space = input.nextLine();
            if(space.length() == 2) {
                for(int i = 0; i < 11; i++) {
                    for(int j = 0; j < 11; j++) {
                        if(space.charAt(0) == (char) (i + 65) && space.charAt(1) == (char) (j + 48)) {
                            valid = true;
                            break;
                        }
                    }
                }
            }
            System.out.println("\033[H\033[2J");
            System.out.println("Invalid Square.");
        }
        controller.attackShip(2, space);
        System.out.println("\033[H\033[2J");
        controller.playerTwoDisplay();
        System.out.println("Press ENTER to continue.");
        input.nextLine();
        if(controller.PlayerTwoWin()) {
            System.out.println("Player Two Wins!");
        }
        else {
            System.out.println("\033[H\033[2J");
            playerOneTurn();
        }
    }

    public void playGame() {
        boolean valid = false;
        String choice = "";
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO TWO-PLAYER BATTLESHIP");
        System.out.println("Press ENTER key to begin.");
        input.nextLine();
        System.out.println("\033[H\033[2J");
        System.out.println("Preset One-");
        controller.presetDisplay(controller.getPresetOne());
        System.out.println("Preset Two-");
        controller.presetDisplay(controller.getPresetTwo());
        while(valid == false) {
            System.out.println();
            System.out.println("Player One Choose Preset. (1 or 2)");
            choice = input.nextLine();
            if(choice.equals("1") || choice.equals("2")) {
                valid = true;
            }
            else {
                System.out.println("Invalid option. (1 or 2)");
            }
        }
        controller.choosePreset(1, (int) choice.charAt(0) - 48);
        valid = false;
        System.out.println("\033[H\033[2J");
        System.out.println("Press ENTER to continue.");
        input.nextLine();
        System.out.println("Preset One-");
        controller.presetDisplay(controller.getPresetThree());
        System.out.println("Preset Two-");
        controller.presetDisplay(controller.getPresetFour());
        while(valid == false) {
            System.out.println();
            System.out.println("Player Two Choose Preset. (1 or 2)");
            choice = input.nextLine();
            if(choice.equals("1") || choice.equals("2")) {
                valid = true;
            }
            else {
                System.out.println("Invalid option. (1 or 2)");
            }
        }
        controller.choosePreset(2, (int) choice.charAt(0) - 48);
        valid = false;
        System.out.println("\033[H\033[2J");
        System.out.println("Press ENTER to continue.");
        input.nextLine();
        playerOneTurn();
    }

    
}