//Methods enhance the reusability of code.
//Methods are classified into 2 types => 1)Inbuilt Methods. 2)User Defined Methods.


//Here we are going to see user defined methods.

class Methods{

	//*** void method return nothing. ***

	//Non-static void method.
	public void print(){
		System.out.println("Non Static void method.");
	}
	
	//Static void method.
	public static void voidPrint(){
		System.out.println("static void print");
	}
	
	//*** non-void method should return something. ***
	//Static non-void method.
	public static String returnPrint(){
		return "static returning print";
	}
	
	//Non-static Non-void method.
	public String disp(){
		return "non-static returning disp";
	}

	public static void main(String args[]){
		
		//No need to create objects for accessing static methods.
		voidPrint();
		System.out.println(returnPrint());
	
		//object needed to access non-static methods.
		Methods meth = new Methods();
		meth.print();
		System.out.println(meth.disp());
	}
   }
