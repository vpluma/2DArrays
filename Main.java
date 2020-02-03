public class Main
{
	public static void main(String[] args)
	{
		double[][] table = 
		{
			{1.4,2.0,3.3,2},
			{4,1.5,6.1,1},
			{1.2,3.1,4,1.6}
		};
		System.out.println("==== Before =====");
		printArr(table);
		doubleArr(table);
		System.out.println("==== After =====");
		printArr2(table);
	} // End of Main Method
	
	// Traditional For Loops can traverse, print, and modify elements
	public static void printArr(double [][] table)
	{
		for (int row=0; row < table.length; row++)
		{
			// don't use { } curly braces to print a matrix view
			for (int col=0; col < table[row].length; col++)
				System.out.print (table[row][col] + "\t");
				System.out.println();
		}
	}
	// Foreach Loops are recommended for traversing and printing elements only
	public static void printArr2(double [][] table)
	{
		for (double[] row : table)
		{
			// don't use { } curly braces to print in matrix view
	    	for (double eachElement: row)
				System.out.print(eachElement + "\t");
				System.out.println();					
		}
	}
	// This For Loop must be used to 'traverse' and 'modify' elements directly
	public static void doubleArr(double[][] table)
	{
		for (int row = 0; row < table.length; row++)
		{
			for (int col = 0; col < table[row].length; col++)
			{
				table[row][col] = table[row][col] * 2;
				//table[row][col] *= 2; // shortcut for example above
			}
		}
		
	}
	// Do NOT use For each Loops to directly modify elements 
	// Foreach Loops cannot directly modify elements because array's index positions
	// ...are hidden from use
	// Alternatively, Foreach Loops can call methods to modify elements indirectly
	// Although, Foreach Loops can modify and print a copy of the original elements
	public static void doubleArr2(double[][] table)
	{
		for (double[] row : table)
		{
	    	for (double eachElement: row)
				eachElement *= 2; // Temporary modification for printing only
		}
	}
}