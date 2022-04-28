package cz.vutbr.feec.cisla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class HraciPole implements Comparable<HraciPole>{
	private int[][] data = {{1, 4, 7}, {2, 5, 8}, {3, 6, -1}};
	private int x = 2;
	private int y = 2;

	public ArrayList<Integer> getPohyby() {
		return pohyby;
	}

	public int[][] getData() {
		return data;
	}

	private ArrayList<Integer> pohyby = new ArrayList<Integer>();

	public static final int UP = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int RIGHT = 4;

	public HraciPole klonujAPohni(int smer) {
		HraciPole nove = new HraciPole();
		nove.x = this.x;
		nove.y = this.y;
		nove.pohyby.addAll(this.pohyby);
		nove.pohyby.add(smer);
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				nove.data[x][y] = this.data[x][y];
			}
		}

		boolean jeMozny = nove.pohni(smer);
		if (jeMozny) {
			return nove;
		} else {
			return null;
		}
	}

	public boolean pohni(int smer) {
		switch (smer) {
			case UP:
				// nahoru
				if (y < 1) {
					return false;
				}
				data[x][y] = data[x][y - 1];
				data[x][y - 1] = -1;
				y = y - 1; // y--;
				return true;
			case DOWN:
				// nahoru
				if (y > 1) {
					return false;
				}
				data[x][y] = data[x][y + 1];
				data[x][y + 1] = -1;
				y++; // y = y + 1;
				return true;
			case LEFT:
				// nahoru
				if (x < 1) {
					return false;
				}
				data[x][y] = data[x - 1][y];
				data[x - 1][y] = -1;
				x = x - 1; // y--;
				return true;
			case RIGHT:
				if (x > 1) {
					return false;
				}
				data[x][y] = data[x + 1][y];
				data[x + 1][y] = -1;
				x++; // y = y + 1;
				return true;// TODO
		}
		return false;
	}
	public boolean isSolution(){
		int[][] solution = {{1, 4, 7}, {2, 5, 8}, {3, 6, -1}};
		for (int x = 0; x < solution.length; x++) {
			for (int y = 0; y < solution[0].length; y++) {
				if(solution[x][y] != this.data[x][y]) return false;
			}

		}
		return true;
	}

	@Override
	public String toString() {
		String res = "pohyby:" + pohyby + "\n";
		for (int iy = 0; iy < 3; iy++) {
			for (int ix = 0; ix < 3; ix++) {
				res += data[ix][iy] + ",";
			}
			res += "\n";
		}
		return res;
	}



	@Override
	public int compareTo(HraciPole o){
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++){
				if (data[x][y]!= o.data[x][y])
					return -1;

			}
		}
		return 0;
	}

	@Override
	public boolean equals(Object o) {
		HraciPole p = (HraciPole) o;
		return compareTo(p) ==0;
	}

	@Override
	public int hashCode() {

		return Arrays.hashCode(data);

	}

	public List<HraciPole> getMoves(){
		List<HraciPole> l = new ArrayList<>();
		for (int i =0; i<=4;i++){
			HraciPole h =this.klonujAPohni(i);
			if (h!=null)
				l.add(h);

		}
		return l;
	}
}
