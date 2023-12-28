public class Divisors
{
	public static void main ( String[]args )
	{
		int insertedNum = Integer.parseInt(args[0]);
		if ( insertedNum > 0 )
		{
			
			for ( int i = 1; i <= insertedNum; i++ )
			{
				if ( insertedNum % i == 0 )
				{
					System.out.println ( i );
				}
			}
		}
		else
		{
			for ( int i = -1; i >= insertedNum; i-- )
			{
					if ( insertedNum % i == 0 )
				{
					System.out.println ( i );
				}
			}
		}
	}
}