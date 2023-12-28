public class InOrder
{
	public static void main ( String[]args )
	{
		int min = 0;
		for ( int i = 0; i <= 10; i++ )
		{
			int randomInt = (int)(Math.random()*(10));
			if ( randomInt >= min )
			{
				min = randomInt;
				System.out.print ( min + " " );
			}
		}
	}
}