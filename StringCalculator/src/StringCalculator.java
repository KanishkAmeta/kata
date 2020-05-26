
public class StringCalculator {
	
	
	public static int Add(String input) {int r=0;char c=',';
		if(input.isEmpty())
	    return 0;
		char C[] = input.toCharArray();
		 if(input.startsWith("//"))
		 {  c= C[2];
		 String[] s1= input.split("\n",2);
		 input=s1[1];
		}
		
			String[] numAr =input.split(Character.toString(c));
			
			 for(int i=0;i<numAr.length;i++)
			 {r=r+ Integer.parseInt(numAr[i]);
			 if (Integer.parseInt(numAr[i])<0)
			 {throw new IllegalArgumentException("negatives not allowed %d");
			 
			 }
			 }
			
			 
			 			 
				return r;	
				
	}
	
}
		
					
	


