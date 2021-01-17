package lacos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		int f1=0, f2=0, f3=0, f4=0, f5=0;
		int i=1;
		int id;
		int porcentagem;
		
		Scanner user= new Scanner(System.in);
		
		
		while(i<=15){
		   System.out.println("Digite a idade");
		   id = user.nextInt();
		
		
		if (id<=15) {
		  f1=f1+1;
		}
		else if(id<=30){
			f2=f2+1;
			}
		
			else if(id<=45){
				f3=f3+1;
			    }
				
				else if(id<=60){
					f4=f4+1;
			    	}
					else{
					   f5=f5+1;
					   }
		i++;
	}
		
		 System.out.println("A quantidade de pessoas com até 15 anos:" +f1);
		 System.out.println("A quantidade de pessoas com até 30 anos:" +f2);
		 System.out.println("A quantidade de pessoas com até 45 anos:" +f3);
		 System.out.println("A quantidade de pessoas com até 60 anos:" +f4);
		 System.out.println("A quantidade de pessoas com mais de 60 anos:" +f5);
		 
		 porcentagem=f1*100/15;
		 System.out.println("Porcentagem de pessoas com até 15 anos"+porcentagem+"%");
  
		 porcentagem=f2*100/15;
		 System.out.println("Porcentagem de pessoas com até 30 anos"+porcentagem+"%");
		 
		 porcentagem=f3*100/15;
		 System.out.println("Porcentagem de pessoas com até 45 anos"+porcentagem+"%");
		 
		 porcentagem=f4*100/15;
		 System.out.println("Porcentagem de pessoas com até 60 anos"+porcentagem+"%");
		 
		 porcentagem=f5*100/15;
		 System.out.println("Porcentagem de pessoas com mais de 60 anos"+porcentagem+"%");
	}
}