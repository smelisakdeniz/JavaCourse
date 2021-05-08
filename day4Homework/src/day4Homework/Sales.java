package day4Homework;

public class Sales {
	int gameId;
	String gameName;
	double gamePrice;
	
	public Sales(int salesId, String gameName, double gamePrice) {
		super();
		this.gameId = salesId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getSalesId() {
		return gameId;
	}

	public void setSalesId(int salesId) {
		this.gameId = salesId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	
}
