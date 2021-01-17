package lacos;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner user= new Scanner(System.in);
		int i=0;
		int t;
		int v1=1;
		int v2=0;

		
		System.out.println("Insira a quantidade de termos desejada:");
		t=user.nextInt();
		
		while (i<t) {
			v1=v1+v2;
			v2=v1-v2;
			System.out.print(v2+" ");
			i++;
		}
		

	}

}
