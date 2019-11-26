package diceGame;

public class Basic {
    // considering draw
    public static boolean isDraw(int player1Dice, int player2Dice) {
        if(player1Dice == player2Dice && (player1Dice != 0 || player2Dice != 0)) {
            System.out.println("It's a draw");
            return true;
        }
        return false;
    }

    // simulating gameplay
    public static void playGame(int[] diceRollRound) {
        int i = 0;
        int steveDice = 0;
        int johnDice = 0;

        // rolling dice until we have a winner (or no more dice to roll)
        do {
            // steve rolls
            steveDice = diceRollRound[i++];
            System.out.print("Steve rolled " + steveDice + ", ");
            if(i >= diceRollRound.length) {break;}
            // john rolls
            johnDice = diceRollRound[i++];
            System.out.println("John rolled " + johnDice);
            if(i >= diceRollRound.length) {break;}
        } while(isDraw(steveDice, johnDice));

        // announcing a winner (or a draw, if no more dice to roll)
        if(steveDice > johnDice) {
            System.out.println("Steve is the winner");
        } else if(johnDice > steveDice){
            System.out.println("John is the winner");
        } else { System.out.println("It' a draw"); }
    }

    public static void main(String[] args) {
        // defining dice rolls
        int[][] diceRolls = {
                {4, 4, 5, 5, 2, 2, 3, 3},
                {4, 1, 5, 5, 2, 2, 3, 3},
                {4, 4, 5, 3, 2, 2, 3, 3},
                {4, 4, 5, 5, 1, 2, 3, 3},
                {4, 4, 5, 5, 2, 2, 6, 3}
        };

        // playing game
        for (int round = 0; round < diceRolls.length; round++) {
            System.out.println("Round " + (round + 1));
            playGame(diceRolls[round]);
        }
    }
}
