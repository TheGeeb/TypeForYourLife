import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;


public class RunGame 
{
	private static Scanner input1;
	private static Scanner input2;
	private static Scanner input3;
	static ArrayList<String> levelOneWords = new ArrayList<String>();
	static ArrayList<String> levelTwoWords = new ArrayList<String>();
	static ArrayList<String> levelThreeWords = new ArrayList<String>();
	
	public static void Level1File()
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
	
	
	public void levelOne(ArrayList<String> b)
	{
		Level1File();
		Level2File();
		Level3File();
		
		Random random = new Random();
		
		int randomNum = random.nextInt(b.size());
		
		System.out.print(b);
		
	}
	
	public static void Level2File()
	{
		try 
		{
			input2 = new Scanner(new File("level2.txt"));
	    } 
		catch (IOException e) 
	    {
			System.err.println("Error opening file.");		 
		}
		    
	    
		while (input2.hasNextLine())
		{
		        levelTwoWords.add(input2.nextLine());
		}
	
	    
		if(input2 != null)
	    	input2.close();
	 }
	
	
	
	public static void Level3File()
	{
		try 
		{
			input3 = new Scanner(new File("level3.txt"));
	    } 
		catch (IOException e) 
	    {
			System.err.println("Error opening file.");		 
		}
		    
	    
		while (input3.hasNextLine())
		{
		        levelThreeWords.add(input3.nextLine());
		}
	
	    
		if(input3 != null)
	    	input3.close();
	 }
	
	public static void main(String[] args) 
	{
		
	
		Levels l = new Levels();
		
		Level1File();
		Level2File();
		Level3File();
		
		

		l.random(levelOneWords);
		l.setWord(levelOneWords);
		
		l.setSize(600,600);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setVisible(true);
		
		
	}

}
