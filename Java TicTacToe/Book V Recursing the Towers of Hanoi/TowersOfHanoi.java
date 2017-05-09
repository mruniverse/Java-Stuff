import java.util.Scanner;
import java.text.NumberFormat;

public class TowersOfHanoi
{
	private static int counter;
	private static Scanner sc = new Scanner(System.in);
	private static NumberFormat nf = NumberFormat.getNumberInstance();

	public static void main(String[] args)
	{
		int disks;
		do
		{
			System.out.print("How many disks? (0 to end) ");
			disks = sc.nextInt();
			if (disks != 0)
			{
				counter = 0;
				System.out.println(Solve(disks, 1, 3));
			}
		} while(disks != 0);
	}

	public static String Solve(int disks, int startPeg, int endPeg)
	{
		if (disks == 1)
		{
			counter ++;
			return nf.format(counter) + ": " + startPeg + " to " + endPeg + "\n";
		}

		int sparePeg = 6 - startPeg - endPeg;
		String firstSteps  = Solve(disks - 1, startPeg, sparePeg);
		counter++;
		String thisStep = nf.format(counter) + ": " + startPeg + " to " + endPeg + "\n";
		String lastSteps = Solve(disks - 1, sparePeg, endPeg);

		return firstSteps + thisStep + lastSteps;
	}



}