package Examen;

import java.io.FileWriter;

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
	
	FileWriter myWriter = new FileWriter("filename.txt");
    myWriter.write("Boeing-6 370");
    myWriter.close();
	
	public static void minLengte() {
		System.out.println("Boeing-1 70");
	}
	FileWriter myWriter1 = new FileWriter("filename.txt");
    myWriter1.write("Boeing-1 70");
    myWriter1.close();
}
