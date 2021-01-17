package lacos;

import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i=0;
		int fatorial;
		int valor;
		
		
		System.out.println("Digite o número a ser fatorado");
	    fatorial= in.nextInt();
	    
		while(i==fatorial){
		valor=	fatorial-1* fatorial- 2;
		
		i--;
		
	}
		valor=	fatorial-1* fatorial- 2;
		System.out.println ("O número fatorado será :" + valor);
		

}
}