package diceGame;

public class Evolution {
    // basic simulation of rolling a dice from a given dataset (array of integers)
    public static int rollDice(int[] dataset, int pos){
        if(pos >= dataset.length || pos < 0) {
            return 0;
        }
        return dataset[pos];
    }

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
        // no need to initialize the dice rolls as they are given values by the rollDice method
        int steveDice;
        int johnDice;

        // rolling dice until we have a winner (or no more dice to roll)
        do {
            // steve rolls
            steveDice = rollDice(diceRollRound, i++);
            if(steveDice != 0) {
                System.out.print("Steve rolled " + steveDice + ", ");
            }
            // john rolls
            johnDice = rollDice(diceRollRound, i++);
            if(johnDice != 0) {
                System.out.println("John rolled " + johnDice);
            }
            // no need for break as we have the rollDice method which gives us 0 value if no more dice to roll
            // and if diceRoll with 0 value is exit condition from while loop
            // also diceRoll with 0 value is not considered draw (see isDraw method), so in while loop i think it's redundant
        } while(isDraw(steveDice, johnDice) && steveDice != 0 && johnDice !=0);

        // announcing a winner (or a draw, if no more dice to roll)
        if(steveDice > johnDice) {
            System.out.println("Round over. Steve is the winner");
        } else if(johnDice > steveDice){
            System.out.println("Round over. John is the winner");
        } else { System.out.println("Round over. It's a draw"); }
    }

    public static void main(String[] args) {
        // defining dice rolls
        int[][] diceRolls = {
                {4, 4, 5, 5, 2, 2, 3, 3}, //draw
                {4, 1, 5, 5, 2, 2, 3, 3}, //steve
                {4, 4, 5, 3, 2, 2, 3, 3}, //steve
                {4, 4, 5, 5, 1, 2, 3, 3}, //john
                {4, 4, 5, 5, 2, 2, 6, 3}  //steve
        };

        // playing game
        for(int round = 0; round < diceRolls.length; round++) {
            System.out.println("Round " + (round +1));
            playGame(diceRolls[round]);
            System.out.println(" ");
        }
    }
}
