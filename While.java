public class Polindrome 
{
	public static void main(String[] argv)
	{
		System.out.println(isPalindrome(-11));
	}
	
	public static boolean isPalindrome(int number)
	    {
	       
	        int copyNumber = Math.abs(number);
	        int reverse = copyNumber%10;
	        
	        while(copyNumber>10)
	        {
	            copyNumber=copyNumber/10;
	            int remaining = copyNumber%10;
	            reverse = reverse * 10 + remaining;
	        }
	        
	        if(Math.abs(number) == reverse) return true;
	        return false;
	    }
}
