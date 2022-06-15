package Examen;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		

		
		Plane.maxStuwKracht();
		Plane.minLengte();

		
		Hangar hangar1 = new Hangar(76, 20, false);
		Hangar hangar2 = new Hangar(57, 69, true);
		Hangar hangar3 = new Hangar(34, 36, false);
		Hangar hangar4 = new Hangar(48, 43, false);
		Hangar hangar5 = new Hangar(98, 93, true);
		Hangar hangar6 = new Hangar(47, 53, true);
		Hangar hangar7 = new Hangar(78, 32, true);
		Hangar hangar8 = new Hangar(81, 98, false);
		Hangar hangar9 = new Hangar(68, 86, false);
		Hangar hangar10 = new Hangar(82, 73, false);
		Hangar hangar11 = new Hangar(53, 61, true);
		Hangar hangar12 = new Hangar(42, 75, false);
		Hangar hangar13 = new Hangar(96, 32, true);
		Hangar hangar14 = new Hangar(41, 28, false);
		Hangar hangar15 = new Hangar(53, 64, false);
		
		for (int i = 0; i < Planes.size(); i++) {
			for (int j = 0; Hangar.length(); j++) {
				
			}
		}
		
		Map<String, String> VliegtuigenInHangar = new HashMap<String, String>();
		VliegtuigenInHangar.put("", "");
		
		
		System.out.println(VliegtuigenInHangar);
		
	}
}
