package Examen;

public class Plane {
	String naam;
	int vluchtplafond;
	int stuwkracht;
	int breedteVleugelspanwiijdte;
	int lengte;

	public Plane(String naam, int vluchtplafond, int stuwkracht, int breedteVleugelspanwiijdte, int lengte) {
		this.naam = naam;
		this.vluchtplafond = vluchtplafond;
		this.stuwkracht = stuwkracht;
		this.breedteVleugelspanwiijdte = breedteVleugelspanwiijdte;
		this.lengte = lengte;
	}
	
	
	public static void maxStuwKracht() {
		System.out.println("Boeing-6 370");
	}
	
	public static void minLengte() {
		System.out.println("Boeing-1 70");
	}
}
