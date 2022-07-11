package com.javaprogram;

public class Class1GetterSetter {
	
	int number;
	public Class1GetterSetter(int number, String playerName, String club) {
		super();
		this.number = number;
		this.playerName = playerName;
		this.club = club;
	}
	String playerName;
	String club;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	
	
	}
	

	

	


