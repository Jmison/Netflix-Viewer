package oop;

public class NetflixViewer {

	public static void main(String[] args) {
		Netflix m1 = new Movies("Game Over Man", "comedy", 120, true);
		Netflix s1 = new Shows("Staircase", "documentary", 40, true, 12);
		
		System.out.println(m1.toString());
		System.out.println();
		System.out.println(s1.toString());

	}

}
