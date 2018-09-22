import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

import manual_input.person_frame;

public class MainMenu {
	public static void main( String[] args ) {
		// Hauptfenster
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setLayout( new FlowLayout() );
	
		
	
		// "Person" Button
		final JButton person_button = new JButton ("Person");
		frame.add(person_button);
		
		// Click on "Person" Button gives new Menu "import manual_input.person_frame"
		person_button.addActionListener( new ActionListener() {
			@Override public void actionPerformed( ActionEvent e ) {
				person_frame new_frame = new person_frame();
			}
		} );
		
		// Show Frame
		frame.pack();
		frame.setVisible( true );
	}
}