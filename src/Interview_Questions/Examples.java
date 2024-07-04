package Interview_Questions;

public class Examples {

	public static void main(String[] args) {
		
		String s ="JaVaPrOgRaM ";
		for (int i = 0; i < s.length(); i++) {
			if(i%2 !=1) {
				System.out.print(s.charAt(i));
				
			}
			
		}
		
		int num=98765;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("-------------------");
		System.out.println(rev);
	
		
		
	}
}