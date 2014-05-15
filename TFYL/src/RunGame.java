import javax.swing.JFrame;


public class RunGame 
{
	public static void main(String[] args) 
	{
		
	
		Levels l = new Levels();
		
		l.levelOne();
		
		l.setSize(600,600);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setVisible(true);
		
		
	}

}
