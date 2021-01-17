import java.util.Scanner;
public class Exerciciob {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double dis;
		double distotal;
		double disfinal;
		int qbag;
		int tbandeira;
		double bag=2.75;
		
		System.out.println("Insira quantos quilometros foram andados:");
		dis=ler.nextDouble();
		
		System.out.println("Insira o numero de bandeira desta corrida:");
		System.out.println(" 1-6h ás 20h ");
		System.out.println(" 2-20h ás 6h");
		tbandeira=ler.nextInt();
	
		
		System.out.println("Insira a quantidade de bagagens:");
		qbag=ler.nextInt();
		
		if (tbandeira==1) {
			distotal=dis*4.50;
			disfinal=distotal+(qbag*bag);
					System.out.println("A tarifa a ser paga pelo passageiro sera de:"+"R$"+disfinal);
		}if (tbandeira==2) {
			distotal=dis*5.65;
			disfinal=distotal+(qbag*bag);
					System.out.println("A tarifa a ser paga pelo passageiro sera de:"+"R$"+disfinal);
		}
		ler.close();
	}

}
