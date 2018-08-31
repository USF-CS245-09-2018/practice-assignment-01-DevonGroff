public class FactorialRecursive implements Factorial
{
	/*
	 * This method performs a factorial recursively.
	 */
	public int factorial(int n) 
	{
		// Data members.
		int output;

		// Conditional for if the input value is less than or equal to 1.
		if (n <= 1)
		{
			return 1;
		}

		// Performs recursive call.
		return n * factorial(n - 1);
	}
}