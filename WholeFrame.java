import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;



//created by Mission Marcus.. 

public class WholeFrame extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // recommended add in. 
	
	private String bb = "Hello Best Buy!";
	private String myName = "My name is Mission. \n\n\nAttached is my LinkedIn!";
	private Timer time;
	private int currentIndex;
	public JTextArea Firstpane;
	private Font font;
	
	public WholeFrame()
	{
		font = new Font("Courier", Font.BOLD, 25);
		setLayout(new BorderLayout());
		
		Firstpane = new JTextArea();
		Firstpane.setEditable(false);
		Firstpane.setForeground(Color.yellow);
		Firstpane.setBackground(Color.BLUE);
		Firstpane.setFont(font);
		this.setBackground(Color.BLUE);

		
		time = new Timer(100, new timeListener());
		currentIndex = 0;
		
		add(Firstpane, BorderLayout.CENTER);
		
		time.setActionCommand("start");
		time.start();
		
	}
	
	
	private class timeListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			if (time.getActionCommand().equals("start") && currentIndex < bb.length())
			{
			Firstpane.setText(Firstpane.getText() + bb.charAt(currentIndex));
			Firstpane.revalidate();
			
			currentIndex++;
			
			
			if (currentIndex < bb.length())
			{
				time.restart();
			}
			else
			{
				time.setActionCommand("newStart");
				Firstpane.setText(Firstpane.getText() + "\n");
				currentIndex = 0;
				time.restart();
			}

			}
			else if (time.getActionCommand().equals("newStart") && currentIndex < myName.length())
			{
				Firstpane.setText(Firstpane.getText() + myName.charAt(currentIndex));
				Firstpane.revalidate();
				
				currentIndex++;
				
				if (currentIndex < myName.length())
				{
					time.restart();
				}
				else
				{
					JButton button = new JButton("Click here!");
					add(button, BorderLayout.SOUTH);
					button.addActionListener(new ButtonListener());
				}
			}
			
			
		}
		
	}
}
