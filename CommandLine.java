//Command line argument

class CommandLine{
	public static void main(String args[]){
		
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		//It consider commandline inputs as strings . Hence we need to parse for other datatypes.(example : int a = Integer.parseInt(args[0]);)
	}
  }
