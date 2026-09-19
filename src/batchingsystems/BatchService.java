package batchingsystems;
import java.util.ArrayList;

public class BatchService {
	// All Array Lists initialized
	private ArrayList<Dairy> dairies = new ArrayList<Dairy>();
	private ArrayList<Sugar> sugars = new ArrayList<Sugar>();
	private ArrayList<FinProd> finProds =  new ArrayList<FinProd>();
	private ArrayList<Batch> batches = new ArrayList<Batch>();
	
	
	
	// Method for adding new batches to the list if it is not a duplicate
	public void addBatch(Batch newBatch) {
		for(Batch batch: batches) {
			if(batch.getBatchId().equals(newBatch.getBatchId())) {
				throw new IllegalArgumentException("Please try again");
			}
		}
		
		batches.add(newBatch);
	}
	// Method for adding sugar to its list as long as it is not a duplicate
	public void addSugar(Sugar newSugar) {
		for(Sugar sugar: sugars) {
			if(sugar.getTankNum().equals(newSugar.getTankNum())) {
				throw new IllegalArgumentException("Please try again");
				
			}
		}
		
		sugars.add(newSugar);
	}
	// Method for adding FinProd to its list if it is not a duplicate
	public void addFinProd(FinProd newFinProd) {
		for(FinProd finProd: finProds) {
			if(finProd.getTankNum().equals(newFinProd.getTankNum())) {
				throw new IllegalArgumentException("Please try again");
			}
		}
		
		finProds.add(newFinProd);
	}
	// Method for adding dairy to its list if it is not a duplicate
	public void addDairy(Dairy newDairy) {
		for(Dairy dairy: dairies) {
			if(dairy.getTankNum().equals(newDairy.getTankNum())) {
				throw new IllegalArgumentException("Please try again");
			}
		}
		
		dairies.add(newDairy);
	}
	
	// Method for removing a batch from the list if the Id matches one that is in the list
	public void removeBatch(Batch existingBatch) {
		for(Batch batch: batches) {
			if(batch.getBatchId().equals(existingBatch.getBatchId())) {
				batches.remove(batch);
				return;
			}
		}
		throw new IllegalArgumentException("Please try again");
	}
	// Runs a blended batch to its assigned finished-product tank when the conditions are met
	public void startRunning(boolean startRunning, String batchId) {
		if(startRunning == true) {
			for(Batch batch: batches) {
				if(batch.getBatchId().equals(batchId)) {
					for(FinProd finProd: finProds) {
						if(finProd.getTankNum().equals(batch.getFpTankNum())) {
						finProd.setFpTankAmount(batch.getBatchSize() + finProd.getFpTankAmount());
						
						removeBatch(batch);
						return;
					}
				}
			}
		}
			
	}
		
	
	
		
		
	}
	// Transfers dairy from the assigned tanks based on 10% of the batch size
	public void dairyToBatch(String batchId) {
		for(Batch batch: batches) {
			if(batch.getBatchId().equals(batchId)) {
				for(Dairy dairy: dairies) {
					if(batch.getCreamTankNum().equals(dairy.getTankNum())) {
						 dairy.subMixFrmTank((int) (batch.getBatchSize() * 0.10));
					}
					
					else if(batch.getSkimTankNum().equals(dairy.getTankNum())) {
						dairy.subMixFrmTank((int) (batch.getBatchSize() * 0.10));
					}
					
					
				}
			}
		}
	}
	// Transfers sugar from the assigned tanks based on 25% of the batch size
	public void sugarToBatch(String batchId) {
		for(Batch batch: batches) {
			if(batch.getBatchId().equals(batchId)) {
				for(Sugar sugar: sugars) {
					if(batch.getSucTankNum().equals(sugar.getTankNum())) {
						sugar.subMixFrmTank((int)(batch.getBatchSize() * 0.25));
					}
					else if(batch.getFrucTankNum().equals(sugar.getTankNum())) {
						sugar.subMixFrmTank((int)(batch.getBatchSize() * 0.25));
					}
				}
			}
		}
	}
	
	// Method to display all batches in list
	public void viewAllBatches() {
		if(batches.isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			for(Batch batch: batches) {
				batch.printAllInfo();
			}
		}
		
		
	}
	// Method to display all FinProd in list
	public void viewAllFinProds() {
		if(finProds.isEmpty()) {
			System.out.println("List is empty");
		}
		
		else {
			for(FinProd finProd: finProds) {
				finProd.printAllInfo();
			}
		}
	}
	// Method to view all dairies and sugars in their respective list
	public void viewInventory() {
		if(dairies.isEmpty()) {
			System.out.println("Dairy list is empty");
		}
		if(sugars.isEmpty()) {
			System.out.println("Sugar list is empty");
		}
		
		for(Dairy dairy: dairies) {
			dairy.printDairyInfo();
		
			
		}
		for(Sugar sugar: sugars) {
			sugar.printAllInfo();
		}
	}
	// Validates the assigned dairy and sugar tanks, then starts and stores the batch
	public void startBlending(String answer, Batch batch) {
		if(answer.equalsIgnoreCase("yes")) {
			if(dairies.isEmpty() || sugars.isEmpty()) {
				throw new IllegalArgumentException("Check empty diary or sugar tanks");
			}
			for(Dairy dairy: dairies) {
				if(batch.getCreamTankNum().equals(dairy.getTankNum())) {
					if(dairy.getTankAmount() < 100){
						throw new IllegalArgumentException("Not enough in cream");
					}
					

		}
				else if(batch.getSkimTankNum().equals(dairy.getTankNum())) {
					if(dairy.getTankAmount() < 100) {
						throw new IllegalArgumentException("Not enough skim");
						
						
	}
				}
			}
			for(Sugar sugar: sugars) {
				if(batch.getSucTankNum().equals(sugar.getTankNum())) {
					if(sugar.getTankAmount() < 250) {
						throw new IllegalArgumentException("Not enough sugar");
					}
				}
				else if(batch.getFrucTankNum().equals(sugar.getTankNum())) {
					if(sugar.getTankAmount() < 250) {
						throw new IllegalArgumentException("Not enough sugar");
					}
				}
				
			}
			batch.setBatchBlending(true);
			addBatch(batch);
			dairyToBatch(batch.getBatchId());
			sugarToBatch(batch.getBatchId());
			
			return;
			
		}
		else if(answer.equalsIgnoreCase("no")) {
			System.out.println("Have a nice day");
			return;
		}
	}
}


	
	
	






























