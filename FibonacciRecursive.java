public class FibonacciRecursive implements Fibonacci
{
	/*
	 * This method performs a fibonacci sequence recursively
	 */
	public int fibonacci(int n) 
	{
		// Conditional for if the input value is 0.
		if(n == 0)
		{
			return 0;
		}
		
		// Conditional for if the input value is 1
		else if(n == 1)
		{
			return 1;
		}
		
		// Conditional for if the input value is anything else
		else
		{
			// Performs recursive call
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}