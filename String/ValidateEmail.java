 package javaworkout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

	public static void main(String[] args) {
		
	  /*Write a Program to verify whether the given String is valid address
		Input = "gunalan.110997@gmail.com" , "gunalan@gmail.co.uk" 
		Output = True
		Input = gunalan @gmail.com
		Output = False
		Note = Spl chaeracter like ._ are only allowed*/
		
		String s="gunalan.110997@gmail.com";
		String pattern = "[a-zA-z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
		Pattern compile=Pattern.compile(pattern);
		Matcher matcher=compile.matcher(s);
		System.out.println(matcher.matches());

	}

}
