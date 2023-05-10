import java.io.*;
class reverseString
{
 public static void main(String[] args)
 {
	 String input = "Hello World";
	 System.out.println("original string::"+input);
	 String ans =" ";
	 String[] words = input.split(" ");
	 for(String word:words)
	 {
		String revWord="";
		for(int i = word.length()-1;i>=0;i--)
		{
			revWord  = revWord+word.charAt(i);
		}
		ans = ans+revWord+" ";
	 }
      System.out.println("reverse string is:"+ans);
 }
} 
// Input = Hello World
//output = olleH dlroW