//Using getter and setter is a standard coding practice.

class GetterSetter{
	
	String name;
	
	//Setting the value to the variable name.
	public void setName(String name){
		this.name = name;
	}

	//getting the value after setting.
	public String getName(){
		return name;
	}

	public static void main(String args[]){
		
		GetterSetter gs = new GetterSetter();
		gs.setName("hi");
		System.out.println(gs.getName());
	}	
	}
