package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class BFS {
	public void vypisTahy(HraciPole zadani) {

		// TIP: Vyzkousejte s ruznyma strukturama
		//HashSet<HraciPole> closed = new HashSet<HraciPole>();
		TreeSet<HraciPole> closed = new TreeSet<HraciPole>();
		LinkedList<HraciPole> open = new LinkedList<HraciPole>();
		//TreeSet<HraciPole> open = new TreeSet<HraciPole>();
		open.addFirst(zadani);
		System.out.println(zadani);
		for(;;){
			if (open.isEmpty()){
				System.out.println("Finished");
				return;
			}
			HraciPole tmp = open.removeLast();

//			System.out.println(tmp);
			if (tmp.isSolution()){
				System.out.println("Řešení je: " + tmp);
				System.out.println(tmp.getPohyby());
				return;
			}

			for (int i =1; i<= 4; i++){
				HraciPole n = tmp.klonujAPohni(i);
				if ((n!= null) && !(closed.contains(n))){
					open.addFirst(n);
					closed.add(n);
				}
			}



		}

		/*while(!open.isEmpty()) {
			HraciPole tmp = open.removeLast();
			System.out.println(tmp);
			if (tmp.isSolution()){
				System.out.println(tmp);
				return;
			}
			for (int i =1; i<= 4; i++){
				HraciPole n = tmp.klonujAPohni(i);
				if ((n!= null) && !(closed.contains(n))){
					open.addFirst(n);
					closed.add(n);
				}
			}
		}*/



	}
}
