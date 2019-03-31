public class While 
{
	public static void main(String[] argv)
	{
		
		System.out.println(isPalindrome(11));
		
		int count = 0;
		
		while(true)
		{
			if(count==5)
				break;
			count++;
		}
		count = 6;
		do {
			System.out.println("Value - " + count);
			count++;
		}while(count<=6);
	}
	
	public static int sumDigits(int number)
	{
		if(number<=10) return -1;
		int sum = 0;
		
		while (number>0)
		{
			int remaining = number%10;
			number = number/10;
			sum = sum+remaining;
		}
		return sum;
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
	        
	        System.out.println(reverse);
	        
	        if(Math.abs(number) == reverse) return true;
	        return false;
	    }
}
