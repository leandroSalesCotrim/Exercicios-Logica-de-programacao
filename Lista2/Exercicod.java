import java.util.Scanner;
public class Exercicod {


	
		public static void main(String[] args) {
			
			double salario;
			double vferias;
			double abono;
			int ferias;
			 Scanner in = new Scanner (System.in);
			 
			 System.out.println("Digite seu s�lario:");
			 salario = in.nextDouble();
			 System.out.println("Digite 01 se deseja vender suas f�rias, se n�o, digite 02:");
			 ferias = in.nextInt();
			
			
			 if (ferias == 1) {
				 abono =  ((salario/30) *10);
				 System.out.println("O abono a ser recebido ser� de: R$" +abono);
			 }else {
				  vferias = ((salario/0.33)+ salario);
				  System.out.println("O valor a ser recebido pelas f�rias ser� de: R$"+vferias);
				 
			 	in.close();
		  }  

		}


	}