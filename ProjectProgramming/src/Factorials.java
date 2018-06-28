public class Factorials {
	
	public static void main (String[]args) {

		factNumber(22);
	}
	
	
	
	public static void factNumber(int a) {
		
		Boolean bool = true;
		
//		int [] arrayofInts = new int[2];
		
		int b = 2;
		
		while (bool) {
			
//			b++;
		
//			System.out.println(arrayofInts [b] = b);
			
			System.out.println(a / b);
			
			a = a/b;
			
			if (a == 1 ) {

			System.out.println("this is a fact");
			
			bool = false;
			
			}
			
			else if (a < 1) {
			
				break;
				
			}
			
//			System.out.println("This is not a factorial");
				
			b++;
		
			}
		
	
			
			
		}
		
		
		
		
		
	}




	