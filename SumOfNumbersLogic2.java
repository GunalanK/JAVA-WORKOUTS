package javaworkout;

public class SumOfNumbersLogic2 {

	public static void main(String[] args) {
		
		/*Write a program to find the sum of the numbers from the given string
		Input="asdf1qwer9as8d7"
		Output=1+9+8+7=25*/
	
		String s="asdf1qwer9as8d7";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				sum += Integer.parseInt(String.valueOf(s.charAt(i)));
			} 
		}
		System.out.println("The Sum of the Numbers from the given String is:"+sum);

	}

}
