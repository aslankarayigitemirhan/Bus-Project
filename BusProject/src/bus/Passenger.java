package bus;
import java.util.*;
public class Passenger extends Person{
	static Scanner scan = new Scanner(System.in);
	private int seatNumber;
	
	public Passenger(String fullName, long id) {
		super(fullName, id);
		this.seatNumber = -1;
	}
	int biletAl() {
		System.out.println("Yer almak icin koltuk numarasi giriniz: ");
		this.seatNumber = scan.nextInt();
		return this.seatNumber;
	}
	public void setSeatNumber(int num) {
		this.seatNumber = num;
	}
	public int getSeatNumber() {
		return this.seatNumber;
	}
	
	
}
