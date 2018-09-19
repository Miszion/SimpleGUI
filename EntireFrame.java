mport javax.swing.*;

//code written by Mission Marcus 
public class EntireFrame{

	/**
	 * 
	 */

	
	
	
	
	public static void main(String [] args)
	{
		JFrame newFrame = new JFrame("BestBuy is the best."); // make the Jframe
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close on close
		newFrame.setVisible(true);
		newFrame.setSize(500, 500); // set the size to 500 by 500.
		WholeFrame f = new WholeFrame();
		newFrame.add(f);
		
	}
		
		
		

	
	
	
}

