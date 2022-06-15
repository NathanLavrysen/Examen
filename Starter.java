package Examen;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Starter {
	public static void main (String[] args) {
		List<Plane> Planes =new ArrayList<Plane>();  

		Planes.add(new Plane("Boeing-1", 11, 350, 60, 70));
		Planes.add(new Plane("Boeing-2", 12, 360, 65, 75));
		Planes.add(new Plane("Boeing-3", 12, 360, 70, 75));
		Planes.add(new Plane("Boeing-4", 13, 360, 75, 80));
		Planes.add(new Plane("Boeing-5", 13, 360, 80, 80));
		Planes.add(new Plane("Boeing-6", 14, 370, 80, 80));
		Planes.add(new Bomberplane("B1", 7, 400, 20, 20, 10));
		Planes.add(new Bomberplane("B2", 8, 400, 20, 30, 15));
		Planes.add(new Bomberplane("B3", 8, 430, 30, 30, 20));
		Planes.add(new Bomberplane("B4", 9, 460, 30, 40, 30));
		
		FileWriter schrijf = new FileWriter("output.txt", false);
		schrijf.write();
		
		Plane.maxStuwKracht();
		Plane.minLengte();

		
		

	}
}
