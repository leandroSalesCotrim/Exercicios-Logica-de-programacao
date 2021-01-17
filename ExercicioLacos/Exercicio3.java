package lacos;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		int expo;
		int base;
		int i=1;
		int result=0;
		int baset=0;
		
		Scanner user = new Scanner (System.in);
		System.out.println("insira o valor da base");
		base=user.nextInt();
		System.out.println("insira o valor do expoente");
		expo=user.nextInt();
		
		while (i<=expo) {
			
			baset=base*base;
			result=baset;
			
			
			i++;
		}
		System.out.println(+result);
		
	}
	
}
