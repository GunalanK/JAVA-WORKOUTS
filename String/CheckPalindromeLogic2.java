package javaworkout;

public class CheckPalindromeLogic2 {

	public static void main(String[] args) {
		  /*Write a Program to check the palindrome in the given String
			Input="malayalam"  ------>   Output=Yes,Given String is Palindrome
			Input="testleaf"  ------>   Output=Yes,Given String is not Palindrome*/
			
			String s="testleaf";
			StringBuffer buffer=new StringBuffer(s);
			StringBuffer reverse=buffer.reverse();
			String reverseString=reverse.toString();
			if (reverseString.equals(s)) {
				System.out.println("yes,Given String "+s+" is Palindrome");
			}else {
			System.out.println("yes,Given String "+s+" is not Palindrome");
		}
  }
}