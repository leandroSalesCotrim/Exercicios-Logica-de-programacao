import java.util.Scanner;
public class Exercicioc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		float valor;
	    int tviagem;
	    double valorconvert;
	    
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o valor a ser convertido");
		valor=ler.nextFloat();
		System.out.println("Insira o tipo de viagem a ser feita:");
		System.out.println("1-Nacional(Real)");
		System.out.println("2-Europeia)");
		System.out.println("3-Norte-americana(Dolar");
		System.out.println("4-Sul-Americana(Pesos Argentinos");
		tviagem=ler.nextInt();
		
		if (tviagem==1) {
			System.out.println("O valor não pode ser convertido pois ja está na moeda real");
			System.out.println("Tipo de viagem:");
			System.out.println("Nacional");
			}else if (tviagem==2) {
				valorconvert= valor/4.50;
				System.out.println("O valor convertido será:"+"R$"+valorconvert);
				System.out.println("Tipo de viagem:");
				System.out.println("Europeia");
			}else if (tviagem==3) {
				valorconvert= valor/4.11;
				System.out.println("O valor convertido será:"+"R$"+valorconvert);
				System.out.println("Tipo de viagem:");
				System.out.println("Norte-Americana");
			}else if (tviagem==4) {
				valorconvert= valor/0.071;
				System.out.println("O valor convertido será:"+"R$"+valorconvert);
				System.out.println("Tipo de viagem:");
				System.out.println("Sul-Americana");
			}
			ler.close();
		
			
	}

}
