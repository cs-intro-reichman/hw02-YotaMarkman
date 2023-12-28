import java.util.Random;
public class OneOfEachStats
{
public static void main ( String[]args )
	{
		int T = Integer.parseInt ( args[0] );
		int seed = Integer.parseInt( args[1] );
		Random generator = new Random(seed);
		int count = 0;
		int amount = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		double average = 0;
		double percent = 0;
		boolean isBoy;
		boolean isGirl;
		for ( int i = 1; i <= T; i++ )
		{
			isBoy = false;
			isGirl = false;	
			count = 0;
			while ( ( isBoy != true )  || ( isGirl != true ) )
			{
				percent = generator.nextDouble();
				if ( percent > 0.5 )
				{
					isBoy = true;
				}
				else
				{
					isGirl = true;
				}
				if ( isBoy == true && isGirl == false )
				{
					count++;
				}
				else if ( isBoy == false && isGirl == true )
				{
					count++;		
				}
				else
				{
					count++;
				}
			}
			if ( count == 2 )
			{
				count2++;
			}
			else if ( count == 3 )
			{
				count3++;
			}
			else
			{
				count4++;
			}
			amount = amount + count;
		}
		average = (double)amount/T;
		System.out.println( "Average " + average + " children to get at least one of each gender." );
		System.out.println( "Number of families with 2 children: " + count2 );
		System.out.println( "Number of families with 3 children: " + count3 );
		System.out.println( "Number of families with 4 or more children: " + count4 );
		if ( count2 > count3 && count2 > count4 )
		{
			System.out.println( "The most common number of children is 2" );
		}
		else if ( count3 > count2 && count3 > count4 )
		{
			System.out.println( "The most common number of children is 3" );
		}
		else if ( count4 > count3 && count4 > count2 )
		{
			System.out.println( "The most common number of children is 4 or more" );
		}
		else
		{
			System.out.println( "There is a draw" );
		}
	}
}