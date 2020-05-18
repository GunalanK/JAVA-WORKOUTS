package javaworkout;

public class FindOccuranceLogic1 {

	public static void main(String[] args) {
		
        /*Write a java program to find the occurance of the character 'o' in
		the following String.
		Input="You have no choice other than following me!"
		Output=Occurrence of o : 6*/
		
		String s="You have no choice other than following me!";
		int count=0; 
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)=='o')
			{
			count++;
		    }
	    }
		System.out.println("Ocuurance of o :" +count);

	}
	}
