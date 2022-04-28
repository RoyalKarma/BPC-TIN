package cz.vutbr.feec.cisla;

import java.util.LinkedList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		HraciPole h = new HraciPole();
//		HraciPole h2 = new HraciPole();
		int counter = 0;

//		for(int i=1;i <=4; i++){
//			HraciPole h3 = h.klonujAPohni(i);
//			System.out.println(" Kopie s pohybem " +i+ "je: \n"+h3);
//			counter+=1;
//		}
		for(int i= 0; i < 100; i++){
			h.pohni(new Random().nextInt(4)+1);
		}
//
		System.out.println(h);
//		System.out.println(counter);
//		System.out.println("is solution " + h.isSolution());
		BFS bfs = new BFS();
		bfs.vypisTahy(h);

		//HraciPole h2 = h.klonujAPohni(1);


		/*LinkedList<HraciPole> queue = new LinkedList<HraciPole>();
		queue.addLast(h);
		queue.addLast(h2);
		while (!queue.isEmpty()){
			System.out.println(queue.getFirst());
			queue.removeFirst();
		}*/

	}
}
