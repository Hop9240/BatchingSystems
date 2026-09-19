package batchingsystems;
// Fields to store batching information
public class Batch {
	private String batchId;
	private String materialNum;
	private int batchSize;
	private String skimTankNum;
	private String creamTankNum;
	private String sucTankNum;
	private String frucTankNum;
	private String fpTankNum;
	private boolean batchBlending;
	// Constructor stores all of the batching information into the classes fields
	public Batch(String batchId, String materialNum, int batchSize, String skimTankNum, String creamTankNum, String sucTankNum,
			String frucTankNum, String fpTankNum, boolean batchBlending) {
		this.batchId = batchId;
		this.materialNum = materialNum;
		this.batchSize = batchSize;
		this.skimTankNum = skimTankNum;
		this.creamTankNum = creamTankNum;
		this.sucTankNum = sucTankNum;
		this.frucTankNum = frucTankNum;
		this.fpTankNum = fpTankNum;
		this.batchBlending = batchBlending;
	}
	// Getters for batching information
	public String getBatchId() {
		return this.batchId;
	}
	
	public String getMaterialNum() {
		return this.materialNum;
	}
	
	public int getBatchSize() {
		return this.batchSize;
	}
	
	public String getSkimTankNum() {
		return this.skimTankNum;
	}
	
	public String getCreamTankNum() {
		return this.creamTankNum;
	}
	public String getSucTankNum() {
		return this.sucTankNum;
	}
	
	public String getFrucTankNum() {
		return  this.frucTankNum;
	}
	
	public String getFpTankNum() {
		return this.fpTankNum;
	}
	
	public boolean getBatchBlending() {
		return this.batchBlending;
		
	}
	// Setter used to update blending status
	public void setBatchBlending(boolean batchBlending) {
		this.batchBlending = batchBlending;
		
	}
	// Setter used to update batching size
	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}
	// Method used to display all batching information
	public void printAllInfo() {
		System.out.println("Batch Id: " + this.batchId);
		System.out.println("Material number: " + this.materialNum);
		System.out.println("Batch size: " + this.batchSize);
		System.out.println("Skim tank: " + this.skimTankNum);
		System.out.println("Cream tank: " + this.creamTankNum);
		System.out.println("Sucrose tank: " + this.sucTankNum);
		System.out.println("Fructose tank: " + this.frucTankNum);
		System.out.println("Finished Product tank: " + this.fpTankNum);
		System.out.println("Did this batch blend correctly? " + this.batchBlending);
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
