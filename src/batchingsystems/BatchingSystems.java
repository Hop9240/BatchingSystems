package batchingsystems;
import java.util.Scanner;
public class BatchingSystems {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BatchService service = new BatchService(); 
		Scanner scnr = new Scanner(System.in);
		boolean keepRunning = true;
		// Loop for menu to keep running
		while(keepRunning) {
			System.out.println("Batching System's Menu");
			System.out.println("1. Inventory");
			System.out.println("2. Dairies");
			System.out.println("3. Sugars");
			System.out.println("4. Finished Product");
			System.out.println("5. Batching");
			System.out.println("6. Stored Batches");
			System.out.println("7. Start Running");
			System.out.println("8. Display Finished Product");
			System.out.println("9. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			
			int choice = scnr.nextInt();
			scnr.nextLine();
			
			// View the inventory
			if(choice == 1) {
			
				service.viewInventory();
					
				
				
			}
			// Creating a Dairy tank item for the batch to use for making mixes
			else if(choice == 2) {
				System.out.print("What is the dairy tank number: ");
				String tankNum = scnr.nextLine();
				
				System.out.print("What is the material number: ");
				String materialNum = scnr.nextLine();
				
				System.out.print("What is the lot number: ");
				String lotNum = scnr.nextLine();
				
				System.out.print("Is dairy content cream or skim?: ");
				String dairyContent = scnr.nextLine();
				
				if(!(dairyContent.equalsIgnoreCase("cream") || dairyContent.equalsIgnoreCase("skim"))) {
					throw new IllegalArgumentException("Must be Cream or Skim");
				}
				
				System.out.print("what is the amount in the dairy tank: ");
				int tankAmount = scnr.nextInt();
				
				
				System.out.print("What are the solid results: ");
				double solidResults = scnr.nextDouble();
				
				System.out.print("What are the fat results: ");
				double fatResults = scnr.nextDouble();
				scnr.nextLine();
				
				Dairy newDairy = new Dairy(tankNum, materialNum, lotNum, dairyContent, tankAmount,
						solidResults, fatResults);
				service.addDairy(newDairy);
			}
			
			// Creating a sugar tank item for the batch to use when creating mixes
			
			else if(choice == 3) {
				System.out.print("What is the sugar tank number: ");
				String tankNum = scnr.nextLine();
				
				System.out.print("What is the material number: ");
				String materialNum = scnr.nextLine();
				
				System.out.print("What is the lot number:" );
				String lotNum = scnr.nextLine();
				
				System.out.print("Is tank content Sucrose or Fructose?: ");
				String tankContent = scnr.nextLine();
				
				if(!(tankContent.equalsIgnoreCase("sucrose") || tankContent.equalsIgnoreCase("fructose"))){
					throw new IllegalArgumentException("Must be Sucrose or Fructose");
					
				}
				
				System.out.print("What is the amount in the tank: ");
				int tankAmount = scnr.nextInt();
				scnr.nextLine();
				
				
				Sugar newSugar = new Sugar(tankNum, materialNum, lotNum, tankContent, tankAmount);
				service.addSugar(newSugar);
					
				
			}
			// Creating finished product tank for the batches to run to for storage
			else if(choice == 4) {
				System.out.print("What is the finished product tank number: ");
				String tankNum = scnr.nextLine();
				
				System.out.print("What is the finished product material number: ");
				String fpMaterialNum = scnr.nextLine();
				
				System.out.print("What is the finished product lot number: ");
				String fpLotNum = scnr.nextLine();
				// Newly created storage tanks must be 0.00 since there is no mix in it that has been tested
				System.out.print("Enter 0.00 for fat results for empty tanks: ");
				double fpFatResults = scnr.nextDouble();
				if(fpFatResults != 0.00) {
					throw new IllegalArgumentException("Tank has to have material in it");
					
				
				}
				// Newly created storage tanks must be 0.00 since there is no mix in it that has been tested
				System.out.print("Enter 0.00 for solid results for empty tanks: ");
				double fpSolidResults = scnr.nextDouble();
				scnr.nextLine();
				
				if(fpSolidResults != 0.00) {
					throw new IllegalArgumentException("Tank has to have material in it");
					
				}
				
				FinProd newFinProd = new FinProd(tankNum, fpMaterialNum, fpLotNum, fpFatResults, 
						fpSolidResults);
				service.addFinProd(newFinProd);
					
					
			}
			// Creating mix bathes that can be run to a finished product tank for storage
			else if(choice == 5) {
				System.out.print("Enter the batch id: ");
				String batchId = scnr.nextLine();
				
				System.out.print("Enter the material number: ");
				String materialNum = scnr.nextLine();
				
				System.out.print("What is the batch size: ");
				int batchSize = scnr.nextInt();
				scnr.nextLine();
				
				System.out.print("What is the skim tank number: ");
				String skimTankNum = scnr.nextLine();
				
				System.out.print("What is the cream tank number: ");
				String creamTankNum = scnr.nextLine();
				
				System.out.print("What is the sucrose tank number: ");
				String sucTankNum = scnr.nextLine();
				
				System.out.print("What is the fructose tank number: ");
				String frucTankNum = scnr.nextLine();
				
				System.out.print("What is the finished product tank number: ");
				String fpTankNum = scnr.nextLine();
				
				System.out.print("Do you want to start blending, Enter yes or no: ");
				
				String answer = scnr.nextLine();
				
				
				Batch batch = new Batch(batchId, materialNum, batchSize, skimTankNum, creamTankNum,
						sucTankNum,frucTankNum, fpTankNum, false);
				service.startBlending(answer, batch);
				
				
			}
			
			
			// Display all stored batches that are ready to be ran to a tank
			else if(choice == 6) {
				service.viewAllBatches();
			}
			// Option to start running batches to its storage tank
			else if(choice == 7) {
				System.out.print("what is the batch id: ");
				String batchId = scnr.nextLine();
				service.startRunning(true, batchId);
				
				
			}
			// Option to view all of the finished product tank storage
			else if(choice == 8) {
				service.viewAllFinProds();
			}
			
			// Exit the program
			else if(choice == 9) {
				keepRunning = false;
			}
			
			else {
				System.out.print("invalid option");
			}
		}
		// close the scanner
		scnr.close();
		

	}
}

