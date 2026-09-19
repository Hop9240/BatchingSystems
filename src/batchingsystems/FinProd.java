package batchingsystems;

public class FinProd {
	// Fields to store all of the FinProd information
		private String tankNum;
		private String fpMaterialNum;
		private String fpLotNum;
		private int fpTankAmount;
		private double fpFatResults;
		private double fpSolidResults;
		
		// Constructor used to store all of the FinProd information into the classes fields
		public FinProd(String tankNum, String fpMaterialNum, String fpLotNum, 
				double fpFatResults, double fpSolidResults) {
			this.tankNum = tankNum;
			this.fpMaterialNum = fpMaterialNum;
			this.fpLotNum = fpLotNum;
			this.fpTankAmount = 0;
			this.fpFatResults = fpFatResults;
			this.fpSolidResults = fpSolidResults;
		}
		// Getters used to retrieve FinProd information
		public String getTankNum() {
			return this.tankNum;
		}
		
		public String getFpMaterialNum() {
			return this.fpMaterialNum;
		}
		
		public String getFpLotNum() {
			return this.fpLotNum;
		}
		
		public int getFpTankAmount() {
			return this.fpTankAmount;
		}
		
		public double getFpFatResults() {
			return this.fpFatResults;
		}
		
		public double getFpSolidResults() {
			return this.fpSolidResults;
		}
		// Setters to update the FinProd tank amount
		public void setFpTankAmount(int fpTankAmount) {
			this.fpTankAmount = fpTankAmount;
		}
		// Setter to update the fat results
		public void setFpFatResults(double fpFatResults) {
			this.fpFatResults = fpFatResults;
		}
		// Setter to update the solid results
		public void setFpSolidResults(double fpSolidResults) {
			this.fpSolidResults = fpSolidResults;
		}
		// Method to add mix to the tank
		public void addMixToTank(int addAmount) {
			fpTankAmount += addAmount;
		}
		// Method used to display all FinProd information
		public void printAllInfo() {
			System.out.println("Tank number: " + this.tankNum);
			System.out.println("Finished Product material number: " + this.fpMaterialNum);
			System.out.println("Finished Product Lot number: " + this.fpLotNum);
			System.out.println("Finished Product tank amount: " + this.fpTankAmount);
			System.out.println("Finished Product fat results: " + this.fpFatResults);
			System.out.println("Finished Product solid results: " + this.fpSolidResults);
			System.out.println();
		}
		

	}


