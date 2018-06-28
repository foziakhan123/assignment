public class blackjack {
	
	public static void main (String[]args) {
		
		System.out.println(black(2, 10));
}
	
	public static int black (int a, int b) {
	
		
		if (a > b && a <= 21) { 
			return a;
		
		}
		
		else if (b > a && b <= 21) {
			return b;
			
		}
		
		else if (a == b) {
			
			if (a > 21 && b >21) {
			
			return 0;
			}else 
				return 0;
		}
		
		
		
		return 0;
		
	}

}

