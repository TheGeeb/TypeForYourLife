
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Levels extends JFrame
{
	private Scanner input1;
	private Scanner input2;
	private Scanner input3;
	private JTextField words;
	private JTextField input;
	private JPanel j;
	ArrayList<String> levelOneWords = new ArrayList<String>();
	ArrayList<String> levelTwoWords = new ArrayList<String>();
	ArrayList<String> levelThreeWords = new ArrayList<String>();
	
	
	public Levels()
	{
		setLayout(new FlowLayout());
		
		
		
		words = new JTextField();
		words.setEditable(false);
	
		input = new JTextField();
		
	

		add(words);
		add(input);
	}
	
	
	public void level(ArrayList<String> b)
	{
		RunGame.Level1File();
		RunGame.Level2File();
		RunGame.Level3File();
		
		Random random = new Random();
		
		int num = random.nextInt(b.size());
		System.out.print(b.get(num));
		
		words.setText(b.get(num));
		
		
		
	
	}

	public boolean checkWord(ArrayList<String> a)
	{
		return false;
			
		
	}
}
