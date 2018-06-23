package oop;

public class Movies extends Netflix {
	public Movies(String title, String genre, int runTime, boolean thumbsUp) {
		super(title, genre, runTime, thumbsUp);
	}

	@Override
	public String toString() {
		return "The movie " + super.title + " is in the " + super.genre + " genre. It has a run time of " 
				+ super.runTime + " minutes, it is " + super.thumbsUp + " that I gave this movie a thumbs up rating.";
	}

}
