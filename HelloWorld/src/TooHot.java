public class TooHot {
	
	public static void main (String [] args) {
		
		System.out.println(tooHot(80,true));
		
	}
	
	public static boolean tooHot (int a, boolean issummer) {
		
		if (a >=60 && a <=100 && issummer == true) {
			return true;
		}
		else if (a >=60 && a<=90) {
			return true;
		}
		
		return false;
		
	}

}
