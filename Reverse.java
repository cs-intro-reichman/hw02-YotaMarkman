public class Reverse
{
	public static void main ( String[]args )
	{
		String word = args[0];
		char middle = 0;
		for ( int i = word.length() - 1; i >= 0; i-- )
		{
			System.out.print ( word.charAt(i) );
			if ( i == word.length()/2 - 1 )
			{
				middle = word.charAt(i);
			}
		}
		System.out.println();
		System.out.println( "The middle character is " + middle );
	}
}