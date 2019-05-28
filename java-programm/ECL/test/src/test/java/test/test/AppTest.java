package test.test;




/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	public static void main(String args[]) {
		
		System.out.println("Sudoku..!!");
		
		int sudoku1[][] = new int[4][4];
		int sudoku[][] = new int[4][4];
							
		
		for(int i=0; i < sudoku1.length; i++)
		{
			for(int j =0; j< sudoku1.length; j++)
			{
				sudoku1[i][j] = i+j;
			}
		}
		
		for(int[] a : sudoku1)
		{
			for(int k: a)
			{
				System.out.print(k + "\t");
			}
			
			System.out.println("\n");
		}
		
	}

}
