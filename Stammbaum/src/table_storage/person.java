package table_storage;

public class person {
	private String firstname;
	private String lastname; 
	
	private static int COUNTER=0;
	
	public person(String firstname, String lastname){
		COUNTER++;
		this.firstname = firstname;
		this.lastname = lastname;
	}
}
