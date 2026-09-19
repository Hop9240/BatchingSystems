package batchingsystems;
// Fields to store dairy tank information
public class Dairy {
	private String tankNum;
	private String materialNum;
	private String lotNum;
	private String dairyContent;
	private int tankAmount;
	private double solidResults;
	private double fatResults;
	
	// Constructor stores all of the dairy information into the classes fields
	public Dairy(String tankNum, String materialNum, String lotNum, String dairyContent, int tankAmount, double solidResults,
			double fatResults) {
		this.tankNum = tankNum;
		this.materialNum = materialNum;
		this.lotNum = lotNum;
		this.dairyContent = dairyContent;
		this.tankAmount = tankAmount;
		// Valid limit on solid results
		if(solidResults < 5 || solidResults > 15) {
			throw new IllegalArgumentException("Retest");
			
		}
		else {
			this.solidResults = solidResults;
		}
		// Valid limit on fat results
		if(fatResults < 20 || fatResults > 35) {
			throw new IllegalArgumentException("Retest");
		}
		
		else {
			this.fatResults = fatResults;
		}
	}
	// Dairy getters 
	
	public String getTankNum() {
		return this.tankNum;
	}
	
	public String getMaterialNum() {
		return this.materialNum;
		
	}
	
	public String getLotNum() {
		return this.lotNum;
		
	}
	
	public String getDairyContent() {
		return this.dairyContent;
				
	}
	
	public int getTankAmount() {
		return this.tankAmount;
	}
	public double getSolidResults() {
		return this.solidResults;
	}
	
	public double getFatResults() {
		return this.fatResults;
	}
	// Dairy setter for updating tank information 
	public void setTankAmount(int tankAmount) {
		this.tankAmount = tankAmount;
	}
	// Method for adding mix to the tank
	public void addMixToTank(int addAmount) {
		this.tankAmount += addAmount;
	}
	// Method for subtracting mix from the tank
	public void subMixFrmTank(int subAmount) {
		if(this.tankAmount < subAmount) {
			throw new IllegalArgumentException("Not allowed");
		}
		else {
			this.tankAmount -= subAmount;
		}
	}
	// Method to display all dair information
	public void printDairyInfo(){
		System.out.println("Tank number: " + this.tankNum);
		System.out.println("Material number: " + this.materialNum);
		System.out.println("Lot number: " + this.lotNum);
		System.out.println("Dairy content: " + this.dairyContent);
		System.out.println("Tank amount: " + this.tankAmount);
		System.out.println("Solid Results: " + this.solidResults);
		System.out.println("Fat Results: " + this.fatResults);
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
