import java.awt.BorderLayout;

import javax.swing.JFrame;


public class MainFrame extends JFrame
{
 
 	private Menu menuScreen;
 	
 	public MainFrame()
 	{
 		super( "Type For YourLife");
 		
 		
 		setLayout(new BorderLayout());
 		
 		menuScreen = new Menu();
 		
 		
 		add(menuScreen, BorderLayout.CENTER);
 		
 		setSize(450, 300);
 		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
 		setVisible( true );
 	}
 }
