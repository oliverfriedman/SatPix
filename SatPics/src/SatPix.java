import java.io.*;
import java.util.Scanner;

public class SatPix {

	public static void main(String[] args) throws IOException
	{
		boolean[][] booleanArr = fileToBoolArray("satpix.in");
		int sizeOfLargestPasture;
		
		/* YOUR CODE GOES HERE */
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("satpix.out")));
		out.println(sizeOfLargestPasture);
		out.close();
		}
	
	private static boolean[][] fileToBoolArray(String fileName) throws FileNotFoundException, IOException
	{
		Scanner scan=new Scanner(new File(fileName));
		int col=scan.nextInt();
		int row=scan.nextInt();
		boolean[][] temp=new boolean[row][col];
		for(int r=0;r<temp.length;r++)
		{
			String wholeRow=scan.next();
			for(int c=0;c<temp[0].length;c++)
			{
				if(wholeRow.charAt(c)==('*'))
				{
					temp[r][c]=true;
				}
				else
				{
					temp[r][c]=false;
				}
			}
		}
		return temp;
	}

	private static int recursivelyMeasureAndMarkPasture(int row, int col, boolean[][] arr)
	{
		//This recursive method employs the flood-fill algorithm to
		//count the size of a single pasture and "mark" it so it is not double-counted
		return 0;
	}
	
}