package lacos;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner user= new Scanner(System.in);
		int num;
		int resul=0;
		int i=1;
		int c=0;
		
		System.out.println("Insira o valor no número:");
		num=user.nextInt();
		
		while(i<=num) {
			if (num%i==0) {
				c++;
				resul=c;
				
			}
			else {
				
			}
			i++;
		}
		if (resul==2) {
		System.out.println("o número é primo");
	}
		else {
		System.out.println("o número não é primo");
		}
	}

}
