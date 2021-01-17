import java.util.Scanner;
public class Exercicios {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		double b;
		double c;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o valor A do triângulo:");
		a=ler.nextDouble();
		System.out.println("Insira o valor B do triângulo:");
		b=ler.nextDouble();
		System.out.println("Insira o valor C do triângulo:");
		c=ler.nextDouble();
		
		if (a>b+c) {
			System.out.println("As medidas não seguem as leis para ser um triângulo");
			
		}
		else if (a == b && a == c) {
			System.out.println("Triângulo do tipo Equilátero");
			
		}else if (a == b || a == c) {
			System.out.println("Triângulo do tipo Isósceles");
		}
	}

}
