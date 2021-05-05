package Entitles;

public class Game {
	int id;
	String name;
	double price;
	int numberOfCurrentPlayer;
	int numberOfSales;

	int numberThRecipientOfTheGame;
	
	public Game(int id,String name, double price, int numberOfCurrentPlayer, int numberOfSales, int numberThRecipientOfTheGame) {
		this.id  = id;
		this.name = name;
		this.price = price;
		this.numberOfCurrentPlayer = numberOfCurrentPlayer;
		this.numberOfSales = numberOfSales;
	
		this.numberThRecipientOfTheGame= numberThRecipientOfTheGame;
		
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumberOfCurrentPlayer() {
		return numberOfCurrentPlayer;
	}
	public void setNumberOfCurrentPlayer(int numberOfCurrentPlayer) {
		this.numberOfCurrentPlayer = numberOfCurrentPlayer;
	}
	public int getNumberOfSales() {
		return numberOfSales;
	}
	public void setNumberOfSales(int numberOfSales) {
		this.numberOfSales = numberOfSales;
	}

	public int getNumberThRecipientOfTheGame() {
		return id;
	}
	public void setNumberThRecipientOfTheGame(int numberThRecipientOfTheGame) {
		this.numberThRecipientOfTheGame = numberThRecipientOfTheGame;
	}
	
}
