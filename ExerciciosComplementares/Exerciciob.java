import java.util.Scanner;
public class Exerciciob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int id1;
		int id2;
		String nome1;
		String nome2;
		
		System.out.println("Insira o nome do usuario 1");
		nome1=ler.next();
		System.out.println("Insira a idade do usuario 1");
		id1=ler.nextInt();
		System.out.println("Insira o nome do usuario 2");
		nome2=ler.next();
		System.out.println("Insira a idade do usuario 2");
		id2=ler.nextInt();
		
		if (id1>id2) {
			System.out.println("Sr."+nome1);
			System.out.println("Idade:"+id1);
			System.out.println("Sr."+nome2);
			System.out.println("Idade:"+id2);
		}else if (id1<id2) {
			System.out.println("Sr."+nome2);
			System.out.println("Idade:"+id2);
			System.out.println("Sr."+nome1);
			System.out.println("Idade:"+id1);
		}else if (id1==id2) {
			System.out.println("Sr."+nome1);
			System.out.println("Idade:"+id1);
			System.out.println("Sr."+nome2);
			System.out.println("Idade:"+id2);
			System.out.println("Os dois possuem a mesma idade");
		}
	}

}
