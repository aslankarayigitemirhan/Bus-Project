package bus;

public class Bus {
	private Passenger[] yolcular;
	private String plaka;
	private String busDirection;
	Bus(int kapasite, String plaka,String busDirection){
		this.yolcular = new Passenger[kapasite];
		this.plaka = plaka;
		this.busDirection = busDirection;
		System.out.println(kapasite + " Kisilik Otobus Olusturuldu. PLAKA:" + this.plaka);
	}
	void yolcuEkle(Passenger p) {
		int koltuk = p.biletAl();
		while(yolcular[koltuk] != null) {
			System.out.println("Dolu Koltuk!");
			koltuk = p.biletAl();
		}
		
		yolcular[koltuk] = p;
	
	}
	void yolcuBiletiAçigaAl(Passenger p) {
		int set = p.getSeatNumber();
		p.setSeatNumber(-1);
		yolcular[set] = null;
	}
	void yolcuListesiYazdir() {
		StringBuilder sb = new StringBuilder();
		sb.append("**********SEFER BILGISI**********\n");
		sb.append("\n-----OTOBUS BILGISI-----\n");
		sb.append("PLAKA : " + this.plaka);
		sb.append("\tOTOBUS ISTIKAMET : " + this.busDirection);
		sb.append("\n\n-----YOLCU BILGISI-----\n\n");
		for(Passenger p : this.yolcular) {
			if(p!= null) {
				sb.append("ISIM : " + p.getName());
				sb.append("\t\tKoltuk NO: " + + p.getSeatNumber());
				sb.append("_________________\n");
				
			}
		}
		System.out.println(sb);
		
	}
	
	
}
