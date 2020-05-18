package javaworkout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserName {

	public static void main(String[] args) {
		
		/*Write a program to validate the given username is valid or not
		Input = "Viratkohli1"   Output=true
		Input = "Virat_1"   Output=false
		Note = 1.It Should contain minimum 8 Characters.
		       2.It allows alpha numeric characters and special characters like ._@$ */
		
		String s="Viratkohli";
		String pattern = "[a-zA-z0-9._$@]{8,}";
		Pattern compile=Pattern.compile(pattern);
		Matcher matcher=compile.matcher(s);
		System.out.println(matcher.matches());

	}

}
