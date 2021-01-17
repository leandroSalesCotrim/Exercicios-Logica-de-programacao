import java.util.Scanner;
public class Exercicioc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int dest;
		int dias;
		double vlr;
		
		System.out.println("Insira o numero do destino desejado:");
		System.out.println("1-Ilhabela");
		System.out.println("2-Fernando de Noronha");
		dest=ler.nextInt();
		System.out.println("Insira a quantidade de dias desejado:");
		dias=ler.nextInt();
		
		if (dest==1 && dias>=2 || dias<6 ) {
			vlr=240.00;
			System.out.println("ata1");
		}if (dest==1 && dias>=6 ) {
	
			vlr=220.00+130.00;
			System.out.println("ata2");
		}
		
		
	}

}
