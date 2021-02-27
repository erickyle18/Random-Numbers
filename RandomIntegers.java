import java.security.SecureRandom;

public class RandomIntegers {
	
	public static void main(String[] args) {
		
		//create a randomNumbers object to produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();
		
		//loop 20 times
		for(int count = 1; count <= 20; count++)
		{
			//call SecureRandom method "nextInt()" to produce a random # 1-6
			int face = 1 + randomNumbers.nextInt(6);
			
			//display the generated value
			System.out.printf("%d  ", face);
			
			//if the remainder of dividing count by 5 == 0, start a new line
			if(count % 5 == 0)
			{
				System.out.println();
			}
			
		}
		
		
	}

}
