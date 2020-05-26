
public class StringCalculator {
	
	
	public static int Add(String input) {int r=0;
		if(input.isEmpty())
	    return 0;
		 
		
			String[] numAr =input.split(",");
			
			 for(int i=0;i<numAr.length;i++)
			 r=r+ Integer.parseInt(numAr[i]);
				return r;	
				
	}
	
}
		
					
	


