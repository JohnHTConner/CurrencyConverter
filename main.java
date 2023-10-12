import java. util.Scanner;


public class main {

    public static void main(String[] args) {
    	
    	System.out.println("1: £ - British Pound");
    	System.out.println("2: $ - American Dollar");
    	System.out.println("3: € - European Euro");
    	// To take user input
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Please select your desired currency");
    	System.out.println();
    	
    	int choice = sc.nextInt();
    	System.out.println("Please enter the amount you wish to convert");
    	System.out.println();
    	double amount = sc.nextDouble();
    	
    	switch(choice) {
    	case 1: 
    		Pound_to_other(amount);
    		break;
    	case 2:
    		Dollar_to_other(amount);
    		break;
    	case 3: 
    		Euro_to_other(amount);
    		break;
    		default:
    			System.out.println("Choice is invalid");
    	}
    	
    	
    }

    
    // Below, are three seperate functions that convert each currency into it's other two counterparts by utilizing very simple multiplication.

    
    // This is to convert British Pounds into both American Dollars and European Euros
    private static void Pound_to_other(double amount) {
		System.out.println();
		System.out.println("£1.00 British Pounds is = " + "$" + 1.22 + " American Dollars");
		System.out.println();
		System.out.println( "£" +amount + " British Pounds is = " + "$" + (amount *1.22) + " American Dollars");
		System.out.println();
		System.out.println();
		System.out.println("£1.00 British Pounds is =" + "€" + 1.16 + " European Euros");
		System.out.println();
		System.out.println( "£" +amount + " British Pounds is = " + "€" + (amount*1.16) + " European Euros");
		System.out.println();
	}

    
 // This is to convert American Dollars into both British Pounds and European Euros
	private static void Dollar_to_other(double amount) {
		System.out.println();
		System.out.println("$1.00 American Dollars is = " + "£" + 0.78 + " British Pounds");
		System.out.println();
		System.out.println( "$" + amount + " American Dollars is = " + "£" + (amount*0.78) + " British Pounds");
		System.out.println();
		System.out.println();
		System.out.println("$1.00 American Dollars is = " + "€" + 0.95 + " European Euros");
		System.out.println();
		System.out.println( "$" + amount + " 1 American Dollars is = " + "€" + (amount*0.95) + " European Euros");
		System.out.println();
	}

	
	// This is to convert European Euros into both American Dollars and British Pounds
	private static void Euro_to_other(double amount) {
		System.out.println();
		System.out.println("€1.00 European Euros is = " + "$" + 1.05 + " American Dollars");
		System.out.println();
		System.out.println( "€" + amount + " European Euros is = " + "$" + (amount*1.05) + " American Dollars");
		System.out.println();
		System.out.println();
		System.out.println("€1.00 European Euros is = " + "£" + 0.87 + " British Pounds");
		System.out.println();
		System.out.println( "€" + amount + " European Euros is = " +  "£" +(amount*0.87) + " British Pounds");
		System.out.println();
	}
}
