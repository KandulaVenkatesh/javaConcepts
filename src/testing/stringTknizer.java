package testing;

import java.util.StringTokenizer;

import sun.util.locale.StringTokenIterator;

public class stringTknizer {
	public static void main(String[] args){
		String test= "Hi:How?was your.day going";
	//for default delemeter ,space considered as a token  //if we give a space option inside our delemeter.it will takes it otherwise it won't consider space.
		StringTokenizer st=new StringTokenizer(test,":?.");
		
		System.out.println("No.of words or Tokens: "+st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken().toUpperCase());
		}
	}

}
