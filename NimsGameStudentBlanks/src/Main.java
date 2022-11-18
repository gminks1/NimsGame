import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Asks the user to input thier name for the player
        System.out.println("What is player1's name?: ");
        String pOne = sc.nextLine();
        Player p1 = new Player(pOne);
        //TO DO: Create Player 1

        //Asks the user to input their name for the player.
        System.out.println("What is player2's name?: ");
        String pTwo = sc.nextLine();
        Player p2 = new Player(pTwo);
        //TO DO: Create Player 2

        String again = "Literally any string";
        Player currentPlayer;
        
        //Runs the game
        while (!again.equals("q")){
            //Generates the game
            Game game = new Game(p1,p2);

            //TO DO: Create "game"
            
            int randomPlayer = (int) (Math.random()*2);

            //TO DO: Set the a random player as the current player
            if (randomPlayer==0){
                currentPlayer = p1;
            }
            else{
                currentPlayer = p2;
            }
            
            System.out.println(currentPlayer.getName() + " goes first!");
            game.setFirstPlayer(currentPlayer);
            //This is the loop in which the game will be played
            while(!game.isComplete()){
                
               //TO DO
               game.takePiece();
               System.out.println(game.getNextPlayer().getName() + " is up");
               
               if(game.isComplete()){
                break;
               }
               
            }
            System.out.println(currentPlayer.getName()+ " Won!!");
            System.out.println(p1.getName() +" had removed "+ p1.getScore()+" pieces!");
            System.out.println(p2.getName() +" had removed "+ p2.getScore()+" pieces!");
            System.out.println("------------------------------------------");
            System.out.println("Enter q to quit, enter anything else to play again.");
            again = sc.nextLine();
        }
        System.out.println("Thank you for playing!");
    }
}
