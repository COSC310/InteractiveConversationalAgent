
import java.util.ArrayList;
import java.util.Arrays;

import rita.*;

public class test{	
	public static void main(String[] args){
		//System.out.println("Test");
		String noun = "p";
		RiWordNet rw = new RiWordNet("C://Program Files (x86)//WordNet//2.1//dict");
		rw.randomizeResults(false);
		String[] s = rw.getPos("@#$!#$");
		for (int i = 0; i<s.length; i++){
			System.out.println(s[i]);
			if (s[i].equals("n")){
				System.out.println("is noun");
			}
			else{
				System.out.println("fail");
			}
		}
		if (noun.length()==0)
			System.out.println("null is null");
		//			String[] ns = new String[2];
		//			ns[0] = "one";
		//			ns[1] = "two";
		//			String onetwo = String.join(" ",ns);
		//			System.out.println(onetwo);

	}


}
