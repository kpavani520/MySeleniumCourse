package StreamsLearining;


import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;



public class creatingArrayListUsingStreams {

	
	public static void main(String[] args) {
	//public void regular() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("nihanth");
		names.add("nikki");
		names.add("pavani");
		names.add("srikanth");
		names.add("nayni");
		names.size();
		
		int s =0;
		for(int i=0;i<names.size();i++)
		{
			 String actual=names.get(i);
			 if(actual.startsWith("n")) {
				//String count = actual;
				//System.out.println(count);
				 s= actual.length();
			 }
			System.out.println(s);
			s=0;
		}
		
		
	}
	
	}


