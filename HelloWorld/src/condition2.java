public class condition2 {

	public static void main (String[]args) {
		
		
		System.out.println (Addition (0,1, true));
		
		
	}
	 
	protected static int Addition(int a, int b, boolean c) {
	
	if (a == 0){
		return b;
		 
	}
	else if(b==0) {
		return a;
	}
	else if (a!= 0 && b!=0 && c) {
		return a+b; 
		
	} else {
		
		return a*b;
	
	
	} 

}
	
	
}