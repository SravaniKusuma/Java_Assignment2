import java.util.*;
public class CheckAllLetters {
	
	public static boolean findAllLetters(String input)
	{
		boolean[] alphabets= new boolean[26];
		int i,index=0;
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)>='A' && input.charAt(i)<='Z')
			{
				index=input.charAt(i)-'A';
			}
			if(input.charAt(i)>='a' && input.charAt(i)<='z')
			{
				index=input.charAt(i)-'a';
			}
			alphabets[index]=true;
			
		}
		for (i = 0; i <=25; i++)
		{
		      if (alphabets[i] == false)
		    	  	return false;
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String input;
		System.out.println("Enter the input string: ");
		input=sc.nextLine();
		if(findAllLetters(input))
		{
			System.out.println("The given input string contains all english letters");
		}
		else
		{
			System.out.println("The given input string does not conatin all english letters");
		}
		sc.close();
		

	}

}

/*
 	Time Complexity:  
 	
 	The time taken is we are here iterating for every single character
 	in the input string to check if it is a letter or not
 	So the time complexity is  in terms of the length of the input string
 	which is  " O(n)"
 	
 	Space Complexity:
 	
 	The auxiliary space complexity is O(1)
 
 */
