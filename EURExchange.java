// [enis time !!!!!! i mean PENIS time. dont forget fagg. I have seen classmates use other methods of getting user input but I was familliar with the scanner utility and used this.
import java.util.Scanner;
public class EURExchange{																
//The Program Starts Here
	public static void main(String[] args) {											
// Setting up a scanner and calling for input
		Scanner scanner = new Scanner( System.in);										
		System.out.println("Hello! Please enter the Amount (EUR), Exchange rate (to 1 EUR), and any effective commission for the exchange.\n Please note that a default comission of 0.75% will be applied if no comission is entered");
		String input = scanner.nextLine();						
// Splitting  up input data into an array of strings
			
		String[] tokens = input.split(",");												
// This was used to test the scanner and the split method.		
		/*for (String t:tokens){														
		System.out.println(t);
}*/
// Faliure conditions for input data
	if (tokens.length<2){																
		System.out.println("Terribly Sorry, but you seem to have entered too few numbers.\n Please restart the program \n Then enter Amount (EUR), Exchange Rate (Foreign currency to 1 EUR), and any commission. \n Please note: you can leave the commission blank or enter a 0. Also note that the numbers must be separated by a comma. ");
// this is to make this program run as a loop and it does not yet work	
	//input = scanner.nextLine(); 
	//tokens = input.split(",");
	}
	else {if (tokens.length>3){
		System.out.println("Terribly Sorry, but you seem to have entered too many numbers.\n Please enter Amount (EUR), Exchange Rate (Foreign currency to 1 EUR), and any commission. \n Please note: you can leave the commission blank or enter a 0. Also note that the numbers must be separated by a comma. ");
	//input = scanner.nextLine();
	//tokens = input.split(",");
	}
// WHen all conditions are met the program runs this following section	
	else{																			

 float amount = Float.parseFloat(tokens[0]);
 float exr = Float.parseFloat(tokens[1]);

// This was used to test if the parsing was sucessful but now can be used to create a user verification step for the data entered.	
	System.out.println("Amount Entered: " + amount);									
	System.out.println("Exchange Rate Entered: " + exr + " : 1 EUR");

// This calculates the principle amount that needs to be converted then looks at if there is any commission.	
float principle = amount/exr;															
if (tokens.length==2){
	float comm = 0.75f;
	float commission = (principle*(comm/100));
	float result = principle - commission;
	System.out.println("Comission: " + comm + " %");
	System.out.println("The total amount without commission is: " + principle + " EUR");
	System.out.println("The total commission is: " + commission +" EUR " + "at a rate of: " + comm + " %" );
	System.out.println("your final amount is: " + result + " EUR");
	 
}
// The calculations below are for the case with comission.
else {																					
	float comm = Float.parseFloat(tokens[2]);	
	float commission = (principle*(comm/100));
	float result = principle - commission;
	System.out.println("Comission: " + comm + " %");
	System.out.println("The total amount without commission is: " + principle + " EUR");
	System.out.println("The total commission is: " + commission +" EUR " + "at a rate of: " + comm + " %" );
	System.out.println("your final amount is: " + result + " EUR");

}

	}
}
//main() method ends here
}																						
//class EURExchange ends here
}																					