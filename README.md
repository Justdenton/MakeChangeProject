## Make Change Project

#### Week 1 - Homework - Skill Distillery

### Overview

* The program simulates a basic cash register interaction. The program is simulated for the attendant. Rather than scanning items to display prices, the program trusts the shopper and the attendant (as far as prices and money received). The program takes in 2 inputs (cost & money given to the attendant). The program will take these 2 inputs and generate a breakdown of change for the attendant to give back to the shopper.

### How to Run:

* Prompts the user (attendant) for the cost of an item.
* Prompts the user (attendant) for the amount of money the shopper handed the attendant. 
* Determines if change is due to the shopper.
* Provides a change breakdown (denominations) for the attendant. 
	* Omits any unused denominations.

### Technologies Used:

* Java
* String format() Method
* Git
* Parameters; calling Methods

### Lessons Learned

* Using an array with a loop statement would make the program much more DRY - however, we have not covered arrays yet.

* Using a switch would potentially be possible - but switches require integers rather than doubles.

* For programs that need to filter out multiple sets of numbers, best practice (at least for now) is to work in descending order.

* When laying out the layers/logic of the program, it's best to start with the "easiest" functional parts, then add to that (rather than trying to think of the project as a whole). It's much easier to edit formatting etc. once you have the program functional & TEST OFTEN.
	* You can learn more from starting and fixing mistakes than trying to figure it all out at once. 

* It can be helpful to review your code with a peer, or someone else with no coding experience. This can help you find errors; and reinforce what you have learned while explaining the process to them.  

* String format() Method - Helpful to reduce the number of decimal points to display within a println. %.2f (.2 - will display 2 decimal points.


