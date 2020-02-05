package lv.raimonds.module;

import java.util.ArrayList;

public class League {
	private String name;
	private ArrayList<Team> nameOfTeams;
	
	public League(String leagueName){
		this.name = leagueName;
		this.nameOfTeams = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Team> getNameOfTeams() {
		return nameOfTeams;
	}
	public void setNameOfTeams(ArrayList<Team> nameOfTeams) {
		this.nameOfTeams = nameOfTeams;
	}
	@Override
	public String toString() {
		return "League [name=" + name + ", nameOfTeams=" + nameOfTeams + "]";
	}
	
	
	
	
}
