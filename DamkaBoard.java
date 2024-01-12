public class DamkaBoard
{
	public static void main ( String[]args )
	{
		int size = Integer.parseInt ( args[0] );
		for ( int i = 0; i < size; i++ )
		{
			for ( int j = 0; j < size; j++ )
			{
				// # Feedback: Consider simplifying the conditional statements for better readability.
                		// You can achieve the same output with a more concise if-else structure.
				if ( i % 2 == 0 )
				{
					System.out.print( "*" + " " );
				}
				else
				{
					System.out.print( " " + "*" );
				}
			}
			System.out.println();
		}
	}
}
