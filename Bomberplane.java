package Examen;

public class Bomberplane extends Plane {
	int aantalBommen;

	public Bomberplane(String naam, int vluchtplafond, int stuwkracht, int breedteVleugelspanwiijdte, int lengte, int aantalBommen) {
		super(naam, vluchtplafond, stuwkracht, breedteVleugelspanwiijdte, lengte);
		this.aantalBommen = aantalBommen;
	}
	
	public void printVluchtPlafond() throws VluchtPlafondException {
		double vluchtHoogteBommen = this.vluchtplafond * (this.aantalBommen * 0.03);
		
	if (vluchtHoogteBommen < this.vluchtplafond * 0.2) {
		throw new VluchtPlafondException("Vliegtuig vliegt te laag");
	} else {
		System.out.println(vluchtHoogteBommen);	
	}
}

}
