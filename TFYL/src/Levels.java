
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Levels extends JFrame implements ActionListener
{
	private Scanner input1;
	private Scanner input2;
	private Scanner input3;
	private JTextField word;
	private JTextField input;
	private JTextField invis;
	private JTextField invis2;
	private JPanel j;
	private JButton enter;
	private ArrayList<String> levelOneWords = new ArrayList<String>();
	private ArrayList<String> levelTwoWords = new ArrayList<String>();
	private ArrayList<String> levelThreeWords = new ArrayList<String>();
	private int random;
	
	
	public Levels()
	{
		setLayout(new BorderLayout());
		
		word = new JTextField();
		word.setEditable(false);
		word.setForeground(Color.RED);
		word.setOpaque(false);
		
		input = new JTextField();
		input.setOpaque(false);
		input.setForeground(Color.RED);
		
		invis = new JTextField("");
		invis.setEditable(false);
		invis.setVisible(false);
		
		enter = new JButton("Enter");
		enter.setOpaque(false);
		enter.setContentAreaFilled(false);
		enter.setBorderPainted(false);
		enter.addActionListener(this);
		
		
		j = new JPanel();
		j.setLayout(new GridLayout(1,4));
		j.add(word);
		j.add(invis);
		j.add(input);
		j.add(enter);
		
		
		add(j, BorderLayout.SOUTH);
	}

	
	public int random(ArrayList<String> a)
	{
		Random random = new Random(); 
		int num = random.nextInt(a.size()); // pick random number between 0 and last index of array list
		
		return num;
	}
	
	
	public void setWord(ArrayList<String> b)
	{
		word.setText(b.get(random(b))); // show word to type in GUI
	}
	
	public boolean checkWord(ArrayList<String> c )
	{
		if(word.getText().equalsIgnoreCase(c.get(random(c))))
			return true;
		else 
			return false;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}



}
