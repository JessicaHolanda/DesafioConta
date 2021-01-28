package lacosJava;

import java.util.Scanner; 

public class exercioBanco {

	public static void main(String[] args) {
		/*DESAFIO DA CONTAS

GRUPOS DE 4 A 5 ALUNOS


CONTAS POSSÍVEIS

CONTA POUPANÇA - DATA DE ANIVERSÁRIO CORREÇÃO DE 0.05%
CONTA CORRENTE - PODE EMITI TALÃO NO MAXIMO 3
CONTA ESPECIAL - TEM LIMITE DE CHEQUE ESPECIAL 
CONTA EMPRESA - PODE PEDI EMPRESTIMO
CONTA ESTUDANTIL - TEM LIMITE ESTUDANTE


STOREBOARD DE TELAS

[1/1]

NOME DO BANCO G#
//SLOGAN - FRASE


1 - CONTA POUPANÇA
2 - CONTA CORRENTE
3 - CONTA ESPECIAL 
4 - CONTA EMPRESA
5 - CONTA ESTUDANTIL
6 - SAIR

SELECIONE O TIPO DE CONTA:_

[1 / 2 ] - CONTA XXXXX


10 movimentos
SELECIONE O MOVIMENTO - D/C:
VALOR: _
DESCRIÇÃO: 
SALDO ATUAL:_
CONTINUA S/N:
A CONTA NÃO PODE FICA NEGATIVA

PEDIDO POR CONTA:
CONTA POUPANÇA - CORREÇÃO MONETÁRIA S/N: (SALDO +  0.05%)
CC - DESEJA EMITI TALÃO S/N: SE SIM SÓ ACEITA ENTRE 1/3: 
C ESPECIAL - DESEJA USAR O LIMITE - SE SIM QUANTO: [1000] - SALDO
C EMPRESA - DESEJA FAZER UM EMPRESTIMO S/N: SE SIM O LIMITE É  10.000 - SALDO
C ESTUDANTIL - DESEJA USAR O LIMITE DE ESTUDANTE - S/N: SE SIM ELE TE PODE USAR 5 MIL - SALDO
APÓS MOSTRA O NOVO SALDO


VOLTA PARA O MENU INICIAL

		 * 
		 * */

		Banco_Conta_Poupanca();
		
	}
	public  static void Banco_Conta_Poupanca() {
		
		double saldoTotal = 0.00, saldo = 0.00; 
		char movimentacao = 't', continuacao = 'o', monetaria = 'o';
		String descricao = "";
		int conta = 0, saldoNegativo =0;
		
		Scanner ler = new Scanner(System.in);
		
		
		do {
		System.out.printf("\nSELECIONE O MOVIMENTO - D/C: ");
		movimentacao = ler.next().charAt(0);
		System.out.printf("\nEntre com o Valor: ");
		saldo = ler.nextFloat();
		
		if(saldoTotal>=0) {
	
		if(movimentacao == 'D'||movimentacao == 'd')
		{
			saldoTotal += - saldo; 
			
		}else if(movimentacao == 'C'||movimentacao == 'c') {
			
			saldoTotal += + saldo;	
		}
			
		}else if(saldoTotal<0){
			
			System.out.printf("Não pode fazer movimentação com saldo negativo");		
			break;
			
		}
		
		System.out.println("\n Descrição: ");
		descricao = ler.nextLine();
		
		System.out.printf("\n CONTA POUPANÇA - CORREÇÃO MONETÁRIA S/N: ");
		monetaria = ler.next().charAt(0);
		
		
		if(monetaria == 'S'||monetaria == 's')
		{
			saldoTotal += + saldo * 0.05; 
			
		}else if(monetaria == 'N'||monetaria == 's') {
			
			System.out.printf("\n Você escolheu a opção sem correção monetaria");
			
		}
		
		System.out.printf("\n CONTINUA S/N: ");
		continuacao = ler.next().charAt(0);
		
		if(continuacao == 'S'||movimentacao == 's')
		{
			conta++;	 
			
		}else if(continuacao == 'N'||continuacao == 'n') {

			System.out.printf("Seu saldo é: %.2f",saldoTotal);
		}
		
		}while(continuacao == 'S' && conta<10 ||movimentacao == 's' && conta<10);
			
		
		System.out.printf("\nFim da Consulta!!!");
	}
	

}
