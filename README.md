# BatchingSystems
## Come and SEE my career transition from manufacturing to software development—first here in code, then in reality.
A Java console application inspired by my actual work in manufacturing, using fictional specifications to simulate ingredient inventory, blending, and finished-product storage. My resume tells my experience; this project offers a glimpse into that work and my transition into software development.
## How My Work Connects to This Program

I am responsible for making mix. While my assistant pasteurizer adds certain ingredients manually, I use a computer to add sugar and dairy to the batch.

Before batching, I make sure the dairy and sugar tanks have enough ingredients available. At work, our truck operator handles filling those tanks. In this simulation, you take on that role by creating the tanks and entering their starting amounts.

## Making Your First Batch

### 1. Add the sugar and dairy tanks

Follow the menu options to add a sucrose tank and a fructose tank using option 3. Then add a cream tank and a skim tank using option 2.

The dairy must fall within the program’s fictional fat and solid specifications. The program checks these results when you add each dairy tank.

### 2. Add a finished-product tank

Use option 4 to create the tank that will store your finished mix. Since this tank starts empty, enter 0.00 for its fat and solid results.

### 3. Create and blend a batch

Use option 5 to enter your batch information and select your tanks.

Enter the tank numbers you created for cream, skim, sucrose, fructose, and finished-product storage. Make sure each number matches the correct tank.

Use the same material number for the batch and its finished-product tank. This represents sending the right product to the right storage tank. The current program relies on you to match these material numbers; it does not check them automatically.

Choose yes to blend. The program stores the batch and subtracts ingredients from the assigned dairy and sugar tanks.

### 4. Transfer the batch or prepare another

After blending, you can transfer the batch to its assigned finished-product tank using option 7, or create more batches using option 5, depending on how much mix you want to make.

Use option 6 to view stored batches and option 8 to view finished-product tanks. Once a batch is transferred, its amount is added to the finished-product tank and it is removed from the stored batch list.
## Sample Inputs

All numbers below are fictional demonstration values. Start a new run of the program before entering them.

### 1. Add Dairy Tanks — Option 2

Choose option 2 once for each tank.

| Field | Cream | Skim |
|---|---|---|
| Tank number | 1 | 2 |
| Material number | 101 | 102 |
| Lot number | 201 | 202 |
| Dairy content | cream | skim |
| Tank amount | 10000 | 10000 |
| Solid results | 10 | 10 |
| Fat results | 25 | 25 |

### 2. Add Sugar Tanks — Option 3

Choose option 3 once for each tank.

| Field | Sucrose | Fructose |
|---|---|---|
| Tank number | 3 | 4 |
| Material number | 103 | 104 |
| Lot number | 203 | 204 |
| Tank content | sucrose | fructose |
| Tank amount | 20000 | 20000 |

### 3. Add a Finished-Product Tank — Option 4

| Field | Input |
|---|---|
| Tank number | 5 |
| Material number | 105 |
| Lot number | 205 |
| Fat results | 0.00 |
| Solid results | 0.00 |

### 4. Create Four Batches — Option 5

Choose option 5 four times. Use a different batch id each time:
301, 302, 303, and 304.

Use these same inputs for each batch:

| Field | Input |
|---|---|
| Material number | 105 |
| Batch size | 1000 |
| Skim tank number | 2 |
| Cream tank number | 1 |
| Sucrose tank number | 3 |
| Fructose tank number | 4 |
| Finished-product tank number | 5 |
| Start blending | yes |

### 5. View and Transfer Your Batches

Choose option 6 to view all four stored batches.

Choose option 7 once for each batch id:
301, 302, 303, and 304.

Each transfer adds 1000 to finished-product tank 5.

### Expected Results

After blending and transferring all four batches:

| Tank | Remaining amount |
|---|---|
| Cream — 1 | 9600 |
| Skim — 2 | 9600 |
| Sucrose — 3 | 19000 |
| Fructose — 4 | 19000 |
| Finished product — 5 | 4000 |

Option 6 should display “List is empty.”
Option 8 should show 4000 in finished-product tank 5.
Its fat and solid results remain 0.00 because the program does not calculate new results after transferring batches.

Choose option 9 to exit.
