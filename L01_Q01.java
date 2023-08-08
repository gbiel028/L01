import java.util.Scanner;
public class L01_Q01 {

	public static void main(String[] args) {
		int AnoNas,AnoAtual,Idade;
		char Nome;
		Scanner LerAno = new Scanner(System.in);
		Scanner LerNome = new Scanner(System.in);

		System.out.println("Ano de Nascimento: ");
		AnoNas = LerAno.nextInt();
		
		System.out.println("Ano Atual: ");
		AnoAtual = LerAno.nextInt();
		
		Idade = AnoAtual - AnoNas;
		
		 if (Idade >= 18) {
	          
	            System.out.print("Digite o nome da pessoa: ");
	            String nome = LerNome.nextLine();
	            System.out.println(nome + ", você tem idade superior a 18 anos, portanto, sua entrada foi permitida.");
	        }

	}

}	
