package javaworkout;

public class SumofNumbersLogic1 {

	public static void main(String[] args) {
		
		/*Write a program to find the sum of the numbers from the given string
		Input="asdf1qwer9as8d7"
		Output=1+9+8+7=25*/
	
		String s="asdf1qwer9as8d7";
		int num=0;
		String replace=s.replaceAll("[^0-9]","");
		int i=Integer.parseInt(replace);
		while (i > 0) {
			num += i % 10;
			i = i / 10;
		}
		System.out.println("The Sum of the numbers from String is :" +num);
	}

}
