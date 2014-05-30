
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Levels extends JFrame implements ActionListener, KeyListener
{
	private Scanner input1;
	private Scanner input2;
	private Scanner input3;
	private static JTextField word;
	private JTextField input;
	private JTextField invis;
	private JTextField invis2;
	private JPanel j;
	private JButton enter;
	private int random;
	int score = 0;
	private int health = 100;
	private JLabel scoreL;
	private JLabel healthL;
	private JTextField displayScore;
	private JTextField displayHealth;
	private JPanel top;
	Timer timer;
	
	public Levels()
	{
		setLayout(new BorderLayout());
		
		timer = new Timer(3000, this);
		timer.addActionListener(this);
		
		word = new JTextField();
		word.setEditable(false);
		word.setForeground(Color.RED);
		word.setOpaque(true);
		word.setFocusable(false);
		
		
		input = new JTextField();
		input.setOpaque(false);
		input.setForeground(Color.RED);
		input.addKeyListener(this);
		
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
		
		
		top = new JPanel();
		top.setLayout(new GridLayout(1,4));
		
		scoreL = new JLabel("Score: ");
		healthL = new JLabel("Health: ");
		
		displayScore = new JTextField();
		displayScore.setText(Integer.toString(score));
		displayScore.setEditable(false);
		displayScore.setForeground(Color.RED);
		displayScore.setOpaque(true);
		displayScore.setFocusable(false);

		
		displayHealth = new JTextField();
		displayHealth.setText(Integer.toString(health));
		displayHealth.setEditable(false);
		displayHealth.setForeground(Color.RED);
		displayHealth.setOpaque(true);
		displayHealth.setFocusable(false);

		top.add(scoreL);
		top.add(displayScore);
		top.add(healthL);
		top.add(displayHealth);
		
		add(top, BorderLayout.NORTH);
		
		
		
		
		
		add(j, BorderLayout.SOUTH);
		this.setVisible(true);
		
		if(health <= 100 && health >= 70)
		{
		
			JLabel background = new JLabel(new ImageIcon("Level_1.jpg"));
			add(background, BorderLayout.CENTER);
		}
		else if(health < 70 && health >= 30)
		{
			JLabel background = new JLabel(new ImageIcon("Level_2.jpg"));
			add(background);
		}
		else
		{
			JLabel background=new JLabel(new ImageIcon("Level_3.jpg"));
			add(background);
		}
		
		setSize(1024,768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public void setWord(ArrayList<String> a)
	{
		Random random = new Random(); 
		int num = random.nextInt(a.size()); // pick random number between 0 and last index of array list
		
		timer.restart();
		word.setText(a.get(num)); // show word to type in GUI
		timer.start();
		
		
	}
	
	public void checkWord()
	{
		if(input.getText().equalsIgnoreCase(word.getText()))
		{
			modifyScore();
			input.setText("");
			
			if(health <= 100 && health >= 70)
			{
				setWord(RunGame.getLevelOneWords());
			}
			else if(health < 70 && health >= 30)
			{
				setWord(RunGame.getLevelTwoWords());
			}
			else
			{
				setWord(RunGame.getLevelThreeWords());
			}
			
		}
			
		else
		{
			modifyHealth();
			input.setText("");
			
			
			if(health <= 100 && health >= 70)
			{
				setWord(RunGame.getLevelOneWords());
			
			}
			else if(health < 70 && health >= 30)
			{
				setWord(RunGame.getLevelTwoWords());
	
			}
			else if(health < 30 && health > 0)
			{
				setWord(RunGame.getLevelThreeWords());
			}
			else
			{
				System.exit(0);
				
			}
		}
	}
	
	public void modifyHealth()
	{
		health = (health - 10);
		displayHealth.setText(Integer.toString(health));
	}
	
	public void modifyScore()
	{
		score = score + 10;
		displayScore.setText(Integer.toString(score));

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		checkWord();
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_ENTER )
			checkWord();
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	


}
