package bus;

public class Person {
	private String fullName;
	private long id;
	public Person(String fullName, long id){
		this.id = id;
		this.fullName = fullName;
	}
	public String getName() {
		return this.fullName;
	}
	public long getId() {
		return this.id;
	}
	
}
