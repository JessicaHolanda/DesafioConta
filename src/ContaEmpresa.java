import java.util.Scanner;

public class ContaEmpresa {

	public static void main(String[] args) {
		double saldo = 0.00;
		String resp;
		int opcao;
		Scanner scan = new Scanner (System.in);		
		
		System.out.println("CONTA EMPRESARIAL\nBem vindo!!!!\n\n");
		System.out.printf("Saldo atual: R$ %f \n\n",saldo);
		
		System.out.println("OPÇÕES DISPONIVEIS: ");
		System.out.println("1 - Emprestimo");
		System.out.println("2 - Debitar");
		System.out.println("3 - Creditar");
		System.out.println("4 - Voltar ao menu anterior");
		opcao = scan.nextInt();
		
		switch(opcao) {
		case 1:
			getEmprestimo(saldo);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
			default: 
				System.out.println("Opção inválida!!!");
		}
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//--------------------------------------------------------------------------------
		
		
		
	}
	
	public static double getEmprestimo(double saldo) {
		double valorEmprestimo, emprestimoDisponivel = 10000.00, valor;
		String resp;
		Scanner scan = new Scanner (System.in);		
		System.out.println("\n\nMENU DE EMPRESTIMO\n\n");
		System.out.println("\nDeseja fazer um emprestimo S/N: ");
		resp = scan.next();
		
		if (resp=="S" || resp =="s") {
			do {
				System.out.println("Insira o valor do empréstimo [Até R$ 10.000]: ");
				valorEmprestimo = scan.nextDouble();
				if (valorEmprestimo <= emprestimoDisponivel) {
					valor = emprestimoDisponivel - valorEmprestimo;
					saldo += valor;
				}
			} while (valorEmprestimo > emprestimoDisponivel);
				
			System.out.printf("\nO novo saldo é de: R$ %f", saldo);
			
			System.out.println("\n\nDeseja voltar ao menu anterior S/N? ");
			resp = scan.next();
			if (resp=="S" || resp =="s") {
				
			}else {
				System.exit(0);
			}
		}
		else {
			System.out.println("\n\nDeseja voltar ao menu de contas S/N? ");
			resp = scan.next();
			if (resp=="S" || resp =="s") {
				
			}else {
				System.exit(0);
			}
		}
		return saldo;
	}

}
