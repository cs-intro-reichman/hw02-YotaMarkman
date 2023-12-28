public class Perfect
{
	public static void main ( String[]args )
	{
		int numchoosen = Integer.parseInt(args[0]);
		int sum = 0;
		for( int i = 1; i < numchoosen; i++ )
		{
			if( numchoosen % i == 0 )
			{
				sum = sum + i;
			}
		}
		if ( sum == numchoosen )
		{
			System.out.print( numchoosen + " is a perfect number since " + numchoosen + " = 1" );
			for ( int i = 2; i < numchoosen; i++ )
			{
				if ( numchoosen % i == 0 )
				{
					System.out.print( " + " + i );
				}
			}
		}
		else
		{
			System.out.println( numchoosen + " is not a perfect number" );
		}
	}
}