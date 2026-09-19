package batchingsystems;
// Fields to store sugar information 
public class Sugar {
	private String tankNum;
	private String materialNum;
	private String lotNum;
	private String tankContent;
	private int tankAmount;
	
	// Constructor to store all sugar information into the class fields
	public Sugar(String tankNum, String materialNum, String lotNum, String tankContent, int tankAmount) {
		this.tankNum = tankNum;
		this.materialNum = materialNum;
		this.lotNum = lotNum;
		this.tankContent = tankContent;
		this.tankAmount = tankAmount;
	}
	// getters for sugar information
	public String getTankNum() {
		return this.tankNum;
	}
	
	public String getMaterialNum() {
		return this.materialNum;
	}
	
	public String getLotNum() {
		return this.lotNum;
	}
	
	public String getTankContent() {
		return this.tankContent;
	}
	
	public int getTankAmount() {
		return this.tankAmount;
	}
	// Setter to update tank amount
	public void setTankAmount(int tankAmount) {
		this.tankAmount = tankAmount;
	}
	// Method to add mix to the sugar tank
	public void addMixToTank(int addAmount) {
		this.tankAmount += addAmount;
	}
	// Method to subtract mix from sugar tank
	public void subMixFrmTank(int subAmount) {
		if(this.tankAmount < subAmount) {
			throw new IllegalArgumentException("Not allowed");
		}
		else {
			this.tankAmount -= subAmount;
		}
	}

	// Display sugar information method
	public void printAllInfo() {
		System.out.println("Tank number: " + this.tankNum);
		System.out.println("Material number: " + this.materialNum);
		System.out.println("Lot number: " + this.lotNum);
		System.out.println("Tank content: " + this.tankContent);
		System.out.println("Tank amount: " + this.tankAmount);
		System.out.println();
	}
	

}
