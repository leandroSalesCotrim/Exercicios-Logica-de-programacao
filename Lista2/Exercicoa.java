import java.util.Scanner;
public class Exercicoa {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double ir;
		double s;
		
		System.out.println("Digite o seu salario");
		s = ler.nextDouble();
		if (s<= 1903.98){
			System.out.println("Você não deve impostos");
		}else if (s<= 2826.65){
			ir = (((s*7.5)/100)-142.80);
			System.out.println("O valor de impostos a ser pago será de"+ir);
		
		}else if (s<=3751.05){
			ir = (((s*15)/100)-354);
			System.out.println("O valor de impostos a ser pago será de"+ir);

		}else if (s<= 4664.68){
			ir = (((s*22.5)/100)-636.13);
			System.out.println("O valor de impostos a ser pago será de"+ir);	
		}else {
			ir= (((s*27.5)/100)-869);
			System.out.println("O valor de impostos a ser pago será de"+ir);
			
		}
		ler.close();
	} 

}