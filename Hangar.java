package Examen;

public class Hangar {
	int hoogte;
	int breedte;
	boolean bomberplanesafe;
	
	public Hangar(int hoogte, int breedte, boolean bomberplanesafe) {
		this.hoogte = hoogte;
		this.breedte = breedte;
		this.bomberplanesafe = bomberplanesafe;
	}
	
	int fitsPlane(int hoogte, int breedte) {
		if (Plane.hoogte < Hangar.hoogte; Plane.breedte < Hangar.breedte) {
			System.out.println("Vliegtuig past in de hangar");
		}
	}
	

}
