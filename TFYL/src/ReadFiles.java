import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadFiles 
{
	private Scanner input1;
	private Scanner input2;
	private Scanner input3;
	ArrayList<String> levelOneWords = new ArrayList<String>();
	ArrayList<String> levelTwoWords = new ArrayList<String>();
	ArrayList<String> levelThreeWords = new ArrayList<String>();
	
	
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
	
	public void Level2File()
	{
		try 
		{
			input2 = new Scanner(new File("level2.txt"));
	    } 
		catch (IOException e) 
	    {
			System.err.println("Error opening file.");		 
		}
		    
	    
		while (input1.hasNextLine())
		{
		        levelTwoWords.add(input1.nextLine());
		}
	
	    
		if(input2 != null)
	    	input2.close();
	 }
	
	public void Level3File()
	{
		try 
		{
			input3 = new Scanner(new File("level3.txt"));
	    } 
		catch (IOException e) 
	    {
			System.err.println("Error opening file.");		 
		}
		    
	    
		while (input1.hasNextLine())
		{
		        levelThreeWords.add(input3.nextLine());
		}
	
	    
		if(input3 != null)
	    	input3.close();
	 }
}
