public class IncrementDecrement
{	
	public static void main (String[] args)

	{	
		//declaring and initilaizing "a" variable as integer.
		int a = 297;

		//declaring and initilaizing "b" variable as rezult of all operations with "a" variable.
		int b = a++ + --a + ++a + a-- + --a;

		//Display the result on the screen.
		System.out.println ("a has value: " +b);
	}
}
