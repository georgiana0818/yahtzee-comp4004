Student Name:      Meitong Liu
Student Number:    101014282
student email: 	   meitong.liu@carleton.ca
Github url:        https://github.com/georgiana0818/yahtzee-comp4004
Github commit url: https://github.com/georgiana0818/yahtzee-comp4004/tree/assignmentSubmit


=====================Install Instruction======================

Step 1: Clone the git repository from OR
	Download from culearn and unzip it.

	for clone the git repository:

		1. copy https://github.com/georgiana0818/yahtzee-comp4004.git from my Github url in [Clone or download]

		2. open git bash and go to the folder you want to clone the repository in
		
		3. git clone https://github.com/georgiana0818/yahtzee-comp4004.git

		4. cd yahtzee-comp4004

		5. git switch assignmentSubmit

Step 2: open the eclipse and import the project.

step 3: You can run the project in eclipse or build the project as a jar file.
	In my video, I run junit test in eclipse and run the game in command line.

	if you want to run game in command line:

		1. click File -> Export -> Java -> JAR file -> next -> select src/main/java which include 5 java file (Dice, Game, Player, Server, UI)

		   click Export generated class files and resources.

		   select the location you want to save JAR file and name it yahtzee

		
		2. open 4 command line windows and go to the location you save yahtzee.jar


		3. Run    java -cp ./yahtzee.jar YahtzeeGame.YahtzeeGame.Server 

		   in one of the command line


		4. Run    java -cp ./yahtzee.jar YahtzeeGame.YahtzeeGame.Player

		   in the other three command line


		5. Then follow the game that professor show in snapshot for yahtzee game example