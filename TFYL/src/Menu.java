import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Menu extends JPanel{
	
	private JPanel menu;
	private JButton startButton;
	private JButton lb;
	private JButton credits;
	
	public Menu(){
		
		menu = new JPanel();
		startButton = new JButton( "Start Game");
		startButton.setPreferredSize( new Dimension(15,20));
		
		lb = new JButton( "Leaderboard");
		lb.setMaximumSize(new Dimension(10,20));
		
		credits = new JButton( "Credits");
		
		
		setLayout( new BorderLayout());
		
		add(startButton, BorderLayout.NORTH);
		add(lb, BorderLayout.CENTER);
		add(credits, BorderLayout.SOUTH);
	}

}
