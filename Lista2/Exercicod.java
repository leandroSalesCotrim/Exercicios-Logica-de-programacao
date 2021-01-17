import java.util.Scanner;
public class Exercicod {


	
		public static void main(String[] args) {
			
			double salario;
			double vferias;
			double abono;
			int ferias;
			 Scanner in = new Scanner (System.in);
			 
			 System.out.println("Digite seu sálario:");
			 salario = in.nextDouble();
			 System.out.println("Digite 01 se deseja vender suas férias, se não, digite 02:");
			 ferias = in.nextInt();
			
			
			 if (ferias == 1) {
				 abono =  ((salario/30) *10);
				 System.out.println("O abono a ser recebido será de: R$" +abono);
			 }else {
				  vferias = ((salario/0.33)+ salario);
				  System.out.println("O valor a ser recebido pelas férias será de: R$"+vferias);
				 
			 	in.close();
		  }  

		}


	}