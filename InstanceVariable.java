//Instance variables are also called as non-static variables.

class InstanceVariable{
	String jav = "hi";
  public static void main(String args[]){
		
	//non static variables are accessed by using object. This is called Instantiation.
	InstanceVariable ins = new InstanceVariable();
	
	System.out.println(ins.jav);

	}
  }
