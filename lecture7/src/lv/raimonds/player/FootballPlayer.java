package lv.raimonds.player;

public class FootballPlayer {
	String name;
	String position;
	int shirtNumber = 15;
	boolean build;
	long height;
	int wieght;
	
	public FootballPlayer(String name, String position, int shirtNumber, boolean build, long height, int wieght){
		this.name = name;
		this.position = position;
		this.shirtNumber = shirtNumber;
		this.build = build;
		this.height = height;
		this.wieght = wieght;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getShirtNumber() {
		return shirtNumber;
	}
	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}
	public boolean isBuild() {
		return build;
	}
	public void setBuild(boolean build) {
		this.build = build;
	}
	public long getHeight() {
		return height;
	}
	public void setHeight(long height) {
		this.height = height;
	}
	public int getWieght() {
		return wieght;
	}
	public void setWieght(int wieght) {
		this.wieght = wieght;
	}
	
}
