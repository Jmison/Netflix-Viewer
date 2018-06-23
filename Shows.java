package oop;

public class Shows extends Netflix {
	int episodes; 
	public Shows(String title, String genre, int runTime, boolean thumbsUp, int episodes) {
		super(title, genre, runTime, thumbsUp);
		this.episodes = episodes;
	}

	@Override
	public String toString() {
		return "The series " + super.title + " is part of the " + super.genre + " genre. There are " + this.episodes + 
				" episodes with a run time of " + super.runTime + " minutes. It is " + super.thumbsUp + 
				" that I gave this series a thumbs up.";
	}

}
