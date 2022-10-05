package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		  
		int a = 1184;
		int b = 1210;
		int toplamA=0; 
		int toplamB=0;
		
		for(int i=1;i<a;i++) {
			if(a % i == 0) {
			toplamA= toplamA + i;
			}}
			
			for(int j=1;j<b;j++) {
				if(b % j == 0)
				toplamB = toplamB +j;
			}
			
			
			if(toplamA == b && toplamB == a) {
				
				System.out.println("Bu sayilar arkadastir");
			}
			else {
				
				System.out.println("Bu sayilar arkadas değildir");
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


