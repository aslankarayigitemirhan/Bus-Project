package bus;

public class Test {
	public static void main(String[] args) {
		Bus b = new Bus(10, "34-TC-2023", "Ankara-Adana");
		Passenger p1 = new Passenger("Emirhan Aslankarayigit", 4560);
		
		Passenger p2 = new Passenger("Ilayda Aslankarayigit", 4540);
		Passenger p3 = new Passenger("Mehmet Aslankarayigit", 4590);
		Passenger p4 = new Passenger("Ozdem Aslankarayigit", 458);
		Passenger p5 = new Passenger("Emre Aslankarayigit", 457);
		b.yolcuEkle(p1);
		b.yolcuEkle(p2);
		b.yolcuEkle(p3);
		b.yolcuEkle(p4);
		b.yolcuEkle(p5);
		b.yolcuBiletiAçigaAl(p1);//ACIKTA BİLET VE IPTAL ISLEMI
		b.yolcuBiletiAçigaAl(p5);//ACIKTA BİLET VE IPTAL ISLEMI
		b.yolcuListesiYazdir(); //Yolcu listesini yazdırma
		
	}
}
