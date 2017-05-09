import java.util.Scanner;

public class TicTacToe
{

	static Scanner sc = new Scanner(System.in);
	static TicTacToeBoard board = new TicTacToeBoard();

	public static void main(String[] args)
	{
		String prompt = "Welcome to Tic-Tac-Toe. Please enter your first move: ";
		String humanMove = "";
		String computerMove = "";
		boolean gameIsWon = false;

		// There are a maximum of nine plays, so a for loop keeps track of
		// the number of plays. The game is over after the ninth play.
		// Each time through the loop, both the human and the computer play.
		// So i is incremented in the body of the loop after the computer plays.

		for (int i = 1; i <=9; i++)
		{
			// Human player

			humanMove = getMove(prompt);
			board.playAt(humanMove, 1);

			System.out.println();
			System.out.println(board.toString());
			System.out.println();

			if (board.isGameOver() == 1)
			{
				System.out.println("You beat me!");
				gameIsWon = true;
				break;
			}

			// Computer player
			if (i < 9)
			{
				computerMove = board.getNextMove();
				System.out.println("I will play at " + computerMove);
				board.playAt(computerMove, 2);

				System.out.println();
				System.out.println(board.toString());
				System.out.println();

				if (board.isGameOver() == 2)
				{
					System.out.println("I beat you!");
					gameIsWon = true;
					break;
				}
				prompt = "Please enter your next move: ";
				i++;
			}
		}
		if (board.isGameOver() == 3)
			System.out.println("It's a draw!");
	}

	public static String getMove(String prompt)
	{
		String play;
		System.out.print(prompt);
		do
		{
			play = sc.nextLine();
			if (board.getSquare(play) > 2)
			{
				System.out.println("That is not a valid play.");
			}
		} while (board.getSquare(play) > 2);
		return play;
	}

}

