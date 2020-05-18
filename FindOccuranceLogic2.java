package javaworkout;

public class FindOccuranceLogic2 {

	public static void main(String[] args) {

		/*Write a java program to find the occurance of the character 'o' in
		the following String.
		Input="You have no choice other than following me!"
		Output=Occurrence of o : 6*/
		
		String s="You have no choice other than following me";
		String replace=s.replaceAll("[^o]","");
		System.out.println("Ocuurance of o:"+replace.length());
	}
  }
