//Import user input
import java.util.Scanner;

//initial Statement
class LittleRedRideingHood {
static void littleRedRidingHood(){
// START METHOD CODE

// variables HERE START
int flowers = 0;
// Variables End

// Makeing a Scanner
Scanner sc = new Scanner(System.in);
//stopping scanner
//START
System.out.println("\tPress Enter To Begin");

sc.nextLine();

System.out.println();

// Information
    //introduction
        System.out.println("You are delivering cake and wine to your grandma in your favoirte red hood, poor grandma isnt feeling good\n\tPress Enter");
        // Thread.sleep(100);
        sc.nextLine();

// Question C
System.out.println("Your Mother wants you to bring this cake and wine to Grandmas Will you do it?");

// if yes if no
System.out.println("\n(yes) \'y\'/ (no) \'n\'");

// questionC
String willYouDoIt = sc.nextLine();

// char answer = 
if (willYouDoIt.equals("y")) {

    System.out.println(" DEBUG Will you do it == y");  //Location Sequence

	//story lines begin
    System.out.println("\nYou start on the trail to grandmas and meet an aufully friendly Wolf, he leads you to the flowes and and promptly you forget what you were doing\n\tPress Enter");

    sc.nextLine();
    System.out.println("\nAs you are investigateing the flowers, you look back at Wolf but see nothing but a flash of a tail and then he is gone.\n\tPress Enter");

    sc.nextLine();
    System.out.println("\n\tMeanwhile: \nWolf goes to grandmas house and eats her up before putting on her clothes.\n\tPress Enter");

    sc.nextLine();

	//story lines end
	//question beginns
    System.out.println("\n\tScene Returns to you in the flower feild:");

    // user will answer the question "do you want to pick more flowers"
    // if yes then the count will add + 1 and ask the question again Unless there has already been 5 or more flowers picked
	while(true){

		System.out.println("\nContinue Picking Flowers?\n\n(yes) \'y\'/ (no) \'n\'");


		String keepPickingFlowers = sc.nextLine();

		if (keepPickingFlowers.equals("y")){

			System.out.println("\n\t*You Pick Flowers*");
			//add flowers to count
			flowers += 1;

			// if there are 5 or more flowers then you cannot pick any more flowers and must continue with the story
			if(flowers >= 5){

				System.out.println("There Are no more Flowers to be Picked\n\tPress Enter");
				sc.nextLine();
				keepPickingFlowers = "n";
				break;
			}
		} else if(keepPickingFlowers.equals("n")) {

			break;
		}
	}		
		System.out.println("\nYou arrive to Grandmas cottage you see the door is already open, you then notice Grandma looks different\n\tPress Enter");

		sc.nextLine();

		System.out.println("Do you Observe Grandma Closer?\n\n(yes) \'y\'/ (no) \'n\'");
		String observeGrandma = sc.nextLine();

		if(observeGrandma.equals("y"))
		{

			System.out.println("You notice Grandma Has and Extra Large Nose\n\tPress Enter");
			sc.nextLine();
			System.out.println("You notice what big ears Grandma has\n\tPress Enter");
			sc.nextLine();
			System.out.println("THIS ISNT GRANDMA! ITS WOLF!\n\tPress Enter!");
			sc.nextLine();
			System.out.println("\nCONGRATULATIONS YOU SAVED GRANDMA!\nYou call the huntsman into the cottage and he cuts out Grandma from Wolf!\n\nGrandma gets her Pie and Wine And there is even extra for the Huntsman\n\t\tTHE END! thank you for completing the story\n\tBy: Lucas Carpenter");
		} else if (observeGrandma.equals("n")){

			System.out.println("You get closer to grandma without thinking too much. Only to see that it is Wolf, but it is too late and he gobbles you up too\n\t\tTHE END");
		}else{

			System.out.println("Invalid INPUT Rerun the program\n\tRemember:\n\t\tClick the y key and then enter for yes\n\n\t\tAnd the n key for no");
		}
} else if (willYouDoIt.equals("n")) {

    System.out.println("Your Mother is upset, but understands; there are wolfs on that trail anyway.\n\tTHE END");
//end of question 1
}
// // END METHOD CODE
}
//Main Method
public static void main(String[] args)
{
//creating a New Scanner Object for Main Method Inputs
Scanner outclass = new Scanner(System.in);

//ask player to continue or exit
System.out.println("Ready to play? type yes or no");

String answer = outclass.nextLine();

if(answer.equals("yes")){

	littleRedRidingHood();
	System.out.println("\n\nPress Enter");
	outclass.nextLine();
}else if(answer.equals("no")){

	System.out.println("Press Enter to Exit Program");

	outclass.nextLine();

	System.out.println("End.Program == Succsessful");

	outclass.close();  

	System.out.print("Exiting Program");

	System.exit(0);
	}
System.out.println("Exiting Program now");

System.exit(0);

}

}

