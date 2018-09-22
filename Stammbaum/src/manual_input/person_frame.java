package manual_input;

import java.util.Date;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

import table_storage.person;

public class person_frame {
	public person_frame() {
		 JFrame f = new JFrame( "Person - manual input" );
		 f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		 f.setLayout(new FlowLayout());
		 f.setSize( 600, 100 );
		 
		 // Fields for all Person data which can be manually added and saved
		 f.add( new JLabel("Vorname: "));
		 final JTextField firstname = new JTextField();
		 firstname.setColumns(20);
		 f.add(firstname);
		 
		 f.add( new JLabel("Nachname: "));
		 final JTextField lastname = new JTextField();
		 lastname.setColumns(20);
		 f.add(lastname);
		 
		 // Save Button should save the manually added Person data
		 JButton saveButton = new JButton( "Speichern");
		 f.add( saveButton );
		 saveButton.addActionListener( new ActionListener() {
				@Override public void actionPerformed( ActionEvent e ) {
					person new_person = new person("Hallo", "Ciao");
				}
			} );
		 
		 
		 f.setVisible( true );
		 } 
}
