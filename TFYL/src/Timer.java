// Timer.java
// controls timer associated with each enemy
public class Timer
{
	
	public Timer( int level ) // timer's threshold based on level
	{
		
		long time = System.currentTimeMillis();
		
		if ( level == 1 ) // level 1 timer
		{
			int tick = 1;
			while( true )
			{
				long now = System.currentTimeMillis(); // get time
				if( time + 1000 < now ) // compare time to now
				{
					time = time + 1000; // update time by one second
					System.out.println( "" + tick ); // display time increment by seconds
					if( tick == 5 ) // if so many seconds later, depends on level
					{
						// execute damage method
						// if word typed then break
						tick = 0; // reset timer
					}
					tick++; // update seconds
				}
				
			} // end while
		
		} // end if 
		
		if ( level == 2 ) // level 2 timer
		{
			int tick = 1;
			while( true )
			{
				long now = System.currentTimeMillis();
				if( time + 1000 < now )
				{
					time = time + 1000;
					System.out.println( "" + tick );
					if( tick == 4 )
					{
						// execute damage method
						// if word typed then break
						tick = 0;
					}
					tick++;
				}
				
			} // end while
		
		} // end if
		
		if ( level == 3 ) // level 3 timer
		{
			int tick = 1;
			while( true )
			{
				long now = System.currentTimeMillis();
				if( time + 1000 < now )
				{
					time = time + 1000;
					System.out.println( "" + tick );
					if( tick == 3 )
					{
						// execute damage method
						// if word typed then break
						tick = 0;
					}
					tick++;
				}
				
			} // end while
		
		} // end if
		
	} // end constructor
	
	public static void main( String[] args )
	{
		
		Timer timer = new Timer( 1 ); // example level 1 timer
		
	}
	
} // end Timer.java