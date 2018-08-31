public class FibonacciIterative implements Fibonacci
{
	/*
	 * This method performs a fibonacci iteratively.
	 */
	public int fibonacci(int n) 
	{
		// Data members.
		int output;
        int fibValue1 = 0;
        int fibValue2 = 1;
        int fibValue3 = 1;
        
        // For loop to perform iterative solution.
        for (int i = 0; i < n; i++) 
        {
        	// Moves values up to next fibonacci value.
            fibValue1 = fibValue2;
            fibValue2 = fibValue3;
            fibValue3 = fibValue1 + fibValue2;
        }

        // Returns final output.
        output = fibValue1;
        return output;
	}
}