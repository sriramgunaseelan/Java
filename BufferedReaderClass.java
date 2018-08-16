//BufferedReader in io package.BufferedReader is also a class.

import java.io.*;

class BufferedReaderClass{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//we can get only string input in bufferedreader. To get other types you can "parse".
		String s = br.readLine();
		
		int a = Integer.parseInt(br.readLine());
		Float f = Float.parseFloat(br.readLine());

	System.out.println(s+" "+a+" "+f);
	}	
 }
