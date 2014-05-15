import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Menu extends JPanel
{
	
	
	private Image background;
	private JButton startButton;
	private JButton lb;
	private JButton credits;
	private JButton ghost;  // invisible placeholder button for grid alignment
	private JButton ghost2; // invisible placeholder button for grid alignment
	private JButton ghost3; // invisible placeholder button for grid alignment

	
	public Menu(){
		
		startButton = new JButton( "Start Game");
		lb = new JButton( "Leaderboard");
		credits = new JButton( "Credits");
		
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		
		
		lb.setOpaque(false);
		lb.setContentAreaFilled(false);
		lb.setBorderPainted(false);
		
		credits.setOpaque(false);
		credits.setContentAreaFilled(false);
		credits.setBorderPainted(false);
		
		ghost = new JButton();
		ghost2 = new JButton();
		ghost3 = new JButton();
		
		ghost.setVisible(false);
		ghost2.setVisible(false);
		ghost3.setVisible(false);
		
		
		
		setLayout( new GridLayout(10,10));
		
		add(ghost);
		add(ghost2);
		add(ghost3);
		add(startButton);
		add(lb);
		add(credits);
	}
	
	

}
