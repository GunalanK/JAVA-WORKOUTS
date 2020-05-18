package javaworkout;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		/*Write a program to reverse the even words of the below sentences
		Input  = "When the world realise its own mistakes, corona will disslove automatically"
		Output = "When eht world seilaer its mow mistakes, anoroc will evolssid automatically"*/	
		
		String s="When the world realise its own mistakes, corona will disslove automatically";
		String[] split=s.split(" ");
		for (int i = 0; i < split.length; i++)
		 {
		   if (!(i%2==0))
		     {
			    for (int j = split[i].length()-1; j >=0; j--) 
			    {
					System.out.print(split[i].charAt(j));
			    }
			 }
		   else {
					System.out.print(split[i]);
				}
			System.out.print(" ");
		}
	}
}
	
	
	

