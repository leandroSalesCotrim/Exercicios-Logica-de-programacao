import java.util.Scanner;
public class Exercicios {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		double b;
		double c;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o valor A do tri�ngulo:");
		a=ler.nextDouble();
		System.out.println("Insira o valor B do tri�ngulo:");
		b=ler.nextDouble();
		System.out.println("Insira o valor C do tri�ngulo:");
		c=ler.nextDouble();
		
		if (a>b+c) {
			System.out.println("As medidas n�o seguem as leis para ser um tri�ngulo");
			
		}
		else if (a == b && a == c) {
			System.out.println("Tri�ngulo do tipo Equil�tero");
			
		}else if (a == b || a == c) {
			System.out.println("Tri�ngulo do tipo Is�sceles");
		}
	}

}
