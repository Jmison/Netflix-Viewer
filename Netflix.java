package oop;

abstract class Netflix {
    //variables
	public String title;
	public String genre;
    public int runTime;
    public boolean thumbsUp;
    
	public abstract String toString();
	//constructor
	public Netflix(String title, String genre, int runTime, boolean thumbsUp) {
		super();
		this.title = title;
		this.genre = genre;
		this.runTime = runTime;
		this.thumbsUp = thumbsUp;
	}

	//getters
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public int getRunTime() {
        return runTime;
    }
    public boolean isThumbsUp() {
        return thumbsUp;
    }
    //setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }
    public void setThumbsUp(boolean thumbsUp) {
        this.thumbsUp = thumbsUp;
    }
}