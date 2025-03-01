//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Giovani Zuniga

public class PalinListRunner
{
	public static void main ( String[] args )
	{
		String[] testCases = {
        	   	"one two three two one",
         	        "1 2 3 4 5 one two three four five",
         	        "a b c d e f g x y z g f h",
         	  	"racecar is racecar",
         		"1 2 3 a b c c b a 3 2 1",
          		"chicken is a chicken"
       		 };

        for (String testCase : testCases) {
            PalinList palinList = new PalinList(testCase);
	    if (painList.isPalin()) {
		System.out.println("[" + testCase + "] " + "is a palinlist.");
	    }
	    if (!painList.isPalin()) {
		System.out.println("[" + testCase + "] " + "is not palinlist.");
	    }    
        }			
	}
}
