import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class MainMenuFrame extends JFrame implements ActionListener
{
	private JButton startButton;
	private JButton credits;
	private JButton exit;
	
	
    public MainMenuFrame()
    {
    	setTitle("Type for Your Life");
    	setSize(1024,768);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setVisible(true);

    	setLayout(new BorderLayout());
    	JLabel background=new JLabel(new ImageIcon("MainMenu.jpg"));
    	add(background);
    	
    	background.setLayout(new BoxLayout(background, BoxLayout.PAGE_AXIS));
    	
    	background.add(Box.createVerticalStrut(300));
    	
    	startButton=new JButton("Start");
    	startButton.setMaximumSize(new Dimension(250, 30));
    	startButton.setFont(new Font("Arial", Font.PLAIN, 30));
    	startButton.setForeground(Color.YELLOW);
    	startButton.setContentAreaFilled(false);
    	startButton.setBorderPainted(false);
    	startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    	background.add(startButton);
    	background.add(Box.createVerticalStrut(10));
    	startButton.addActionListener(this);
    	
    	credits=new JButton("Credits");
    	credits.setMaximumSize(new Dimension(250, 30));
    	credits.setFont(new Font("Arial", Font.PLAIN, 25));
    	credits.setForeground(Color.YELLOW);
    	credits.setContentAreaFilled(false);
    	credits.setBorderPainted(false);
    	credits.setAlignmentX(Component.CENTER_ALIGNMENT);
    	background.add(credits);
    	background.add(Box.createVerticalStrut(10));
    	credits.addActionListener(this);
    	
    	exit=new JButton("Exit");
    	exit.setMaximumSize(new Dimension(250, 30));
    	exit.setFont(new Font("Arial", Font.PLAIN, 30));
    	exit.setForeground(Color.YELLOW);
    	exit.setContentAreaFilled(false);
    	exit.setBorderPainted(false);
    	exit.setAlignmentX(Component.CENTER_ALIGNMENT);
    	background.add(exit);
    	background.add(Box.createVerticalStrut(10));
    	exit.addActionListener(this);
    }
    
    public static void main(String args[])
    {
    	new MainMenuFrame();
    }

	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource().equals(startButton))
		{
			RunGame game = new RunGame();
			game.play();
			setVisible(false);
			
		}
		else if(event.getSource().equals(credits))
		{
			new CreditsFrame();
		}
		
		else if(event.getSource().equals(exit))
		{
			System.exit(0);
		}
	}

} 