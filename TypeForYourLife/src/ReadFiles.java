import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadFiles 
{
	private Scanner input1;
	ArrayList<String> levelOneWords = new ArrayList<String>();
	
	
	// open file and fill array list with words
	public void Level1File()
	{
		try 
		{
			input1 = new Scanner(new File("level1.txt"));
	    } 
		catch (IOException e) 
	    {
			System.err.println("Error opening file.");		 
		}
		    
	    
		while (input1.hasNextLine())
		{
		        levelOneWords.add(input1.nextLine());
		}
	
	    
		if(input1 != null)
	    	input1.close();
	 }
}
