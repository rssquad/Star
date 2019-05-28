package test.test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Linked {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linked linked = new Linked();
		linked.getCom();

	}
	//1,2,3
	
	public void getCom(){
		
//		for(int i=0; i<n; n++) {
//			
//		}
		
		String str = "37+5";
		
		String regex = "(\\d)";
		
		Pattern patter =  Pattern.compile(regex);
		
		Matcher matcher = patter.matcher(str);
		
		while(matcher.find())
		{
			System.out.println(matcher.group(0));
//			System.out.println(matcher.group(1));
		}
		
	}

}
