package lacos;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pedro =  1.45;
		double joao =   1.34;
	    int  i=0;
	
		
		while(joao<=pedro){
			pedro =  (pedro+ 0.02);
			joao =  (joao + 0.025);
			
			i++;
		}
		
		System.out.println("João ficará maior que Pedro em  " +i+" anos");
	}


	
	}