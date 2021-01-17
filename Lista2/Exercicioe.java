import java.util.Scanner;
public class Exercicioe {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double vlrp;
	int qntd;
	double vlra;
	
	System.out.println("Insira o valor da prestação");
	vlrp=ler.nextDouble();
	System.out.println("Insira a quantidade de dias em atraso da prestação");
	qntd=ler.nextInt();
	
	
	if (qntd<=45) {
		vlra=vlrp+(2*vlrp/100)+(qntd*0.0001);
		System.out.println("O valor atualizado da sua prestação é: "+"R$"+vlra);
	}else if (qntd>=46) {
		vlra=vlrp+(3*vlrp/100)+(2*vlrp/100)+(qntd*0.0001);
		System.out.println("O valor atualizado da sua prestação é: "+"R$"+vlra);
		}
	ler.close();
	}

}
