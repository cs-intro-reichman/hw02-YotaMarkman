public class OneOfEach
{
	public static void main ( String[]args )
	{
		double percent = 0;
		int count = 0;
		boolean isBoy = false;
		boolean isGirl = false;
		String boy = "b";
		String girl = "g";
		while ( ( isBoy != true )  || ( isGirl != true ) )
		{
			percent = Math.random();
			if ( percent > 0.5 )
			{
				isBoy = true;
				System.out.print ( boy + " " );
			}
			else
			{
				isGirl = true;
				System.out.print ( girl + " " );	
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
				System.out.println();
				System.out.println ( "You made it... and you now have " + count + " children." );
			}
		}
	}
}