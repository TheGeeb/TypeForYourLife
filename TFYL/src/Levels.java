import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Levels 
{
	private Scanner input1;
	private Scanner input2;
	private Scanner input3;
	ArrayList<String> levelOneWords = new ArrayList<String>();
	ArrayList<String> levelTwoWords = new ArrayList<String>();
	ArrayList<String> levelThreeWords = new ArrayList<String>();
	
	
	
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
	
	public void levelOne()
	{
		Random random = new Random();
		
		int randomNum = random.nextInt(levelOneWords.size());
		
		System.out.print(levelOneWords.get(randomNum));
	}
}
