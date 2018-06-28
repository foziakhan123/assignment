public class Sum {

	public static void main (String[]args) {
			
			System.out.println(add(4, 4, 6));
				
			}
	
	public static int add (int a, int b, int c) {
		
		if (a!=b && a!=c && b!=c) { 
			return a+b+c;
		}
		
		else if (a==b && a==c && b==c) {
			return 0;
		}
		
		else if (a==c && b!=c){
			return b;
			
		}
		
		else if (a== b && b!=c) {
			return c;
			
		}
		
		else if (b==c && c!=a) {
			return a;
		}
		
		return 0;
		
	}
	

	
	}
