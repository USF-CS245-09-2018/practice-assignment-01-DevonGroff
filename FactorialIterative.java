public class FactorialIterative implements Factorial
{
	/*
	 * This method performs a factorial iteratively.
	 */
	public int factorial(int n) 
	{
		// Data members.
		int output = n;

		// For loop to perform iterative solution.
		for (int i = n - 1; i > 0; i--)
		{
			output *= i;
		}

		// Returns final output.
		return output;
	}
}