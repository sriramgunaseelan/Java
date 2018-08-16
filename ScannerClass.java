//Scanner is used to get the input from the user . The Scanner is a class in util package .

import java.util.Scanner;

class ScannerClass{
  public static void main(String args[]){
    
	Scanner cg = new Scanner(System.in);

	//Integer...
	int a = cg.nextInt();

	//String -> next get input till space only.(one word only) .To get whole line ,use "nextLine()".
	String s = cg.next();
	
	//we can't get character input directly.
	char c = cg.next().charAt(0);
	
	//Float
	float f = cg.nextFloat();
	
	//Double
	Double d = cg.nextDouble();
	
	//long 
	long l = cg.nextLong();

	}
}
