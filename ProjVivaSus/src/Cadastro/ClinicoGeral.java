package Cadastro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClinicoGeral extends Especialidades{
	
	String d, h, m,r,dhm;
	boolean continueLoop;
	public ClinicoGeral() {
		super("Clinico Geral");
	}
	
	int medico,dia,horario;
	Scanner leia = new Scanner (System.in);
	
	@Override
	public void medico(int medico) {
		do {
		continueLoop = true;	
		try {
		System.out.println("\nEscolha o m�dico: "+"\n1-Ana\n2-David");
		medico = leia.nextInt();
	}catch(InputMismatchException inputMismatchException)
	{	continueLoop = false;
		System.err.printf("\nException: %s\n",inputMismatchException);
		leia.nextLine();
		System.out.println("\nVoc� deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
	}
		}while(continueLoop==false);	
		do {
			switch(medico) {
			case 1:
				System.out.println("\nObs. Dr. Ana que atende na Rua Bar�o do Duprat, 323");
				m="Dr. Ana";
				r="Rua Bar�o do Duprat, 323";
				
				break;
			case 2:
				System.out.println("\nObs. Dr. David que atende na Rua Aracatu, 02");
				m="Dr. Davi";
				r="Rua Aracatu, 02";
				
				break;
			default:
				do {
				continueLoop = true;	
				try {
				System.out.println("\nOp��o inv�lida. Escolha o m�dico novamente:");
				System.out.println("\nEscolha o m�dico: "+"\n1-Ana\n2-David");
				medico = leia.nextInt();
			}catch(InputMismatchException inputMismatchException)
			{	continueLoop = false;
				System.err.printf("\nException: %s\n",inputMismatchException);
				leia.nextLine();
				System.out.println("\nVoc� deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			}
				}while(continueLoop==false);
				switch(medico) {
				case 1:
					System.out.println("\nObs. Dr. Ana que atende na Rua Bar�o do Duprat, 323");
					m="Dr. Ana";
					r="Rua Bar�o do Duprat, 323";
				
					break;
				case 2:
					System.out.println("\nObs. Dr. David que atende na Rua Aracatu, 02");
					m="Dr. Davi";
					r="Rua Aracatu, 02";
					
					break;
				}
			}
		}while(medico<1 || medico>2);
	}

	@Override
	public void dia(int dia) {
		// TODO Auto-generated method stub
		do {
		continueLoop = true;	
		try {
		System.out.println("\nEscolha o dia da semana: "+"\n1 - Segunda-feira \n2 - Ter�a-feira \n3 - Quarta-feira \n4 - Quinta-feira \n5 - Sexta-feira");
		dia = leia.nextInt();
	}catch(InputMismatchException inputMismatchException)
	{	continueLoop = false;
		System.err.printf("\nException: %s\n",inputMismatchException);
		leia.nextLine();
		System.out.println("\nVoc� deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
	}
		}while(continueLoop==false);
		do {
		switch(dia) {
		case 1:
			d="Segunda-feira";
			break;
		case 2:
			d="Ter�a-feira";
			break;
		case 3:
			
			d="Quarta-feira";
			break;
		case 4:
			
			d="Quinta-feira";
			break;
		case 5:
			
			d="Sexta-feira";
			break;
		default:
			do {
			continueLoop = true;	
			try {
			System.out.println("\nOp��o inv�lida. Digte o dia da semana novamente:");
			System.out.println("\nEscolha o dia da semana: "+"\n1 - Segunda-feira \n2 - Ter�a-feira \n3 - Quarta-feira \n4 - Quinta-feira \n5 - Sexta-feira");
			dia = leia.nextInt();
		}catch(InputMismatchException inputMismatchException)
		{	continueLoop = false;
			System.err.printf("\nException: %s\n",inputMismatchException);
			leia.nextLine();
			System.out.println("\nVoc� deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
		}
			}while(continueLoop==false);
				switch(dia) {
				case 1:
					d="Segunda-feira";
					break;
				case 2:
					d="Ter�a-feira";
					break;
				case 3:
					d="Quarta-feira";
					break;
				case 4:	
					d="Quinta-feira";
					break;
				case 5:
					d="Sexta-feira";
					break;
				}
			}
		}while(dia<1 || dia>5);
	}
	
	@Override
	public void horario(int horario) {
		do {
		continueLoop = true;
		try {
		System.out.println("\nEscolha o hor�rio: "+"\n1-9:00\n2-11:00");
		horario = leia.nextInt();
	}catch(InputMismatchException inputMismatchException)
	{	continueLoop = false;
		System.err.printf("\nException: %s\n",inputMismatchException);
		leia.nextLine();
		System.out.println("\nVoc� deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
	}	
		}while(continueLoop==false);
		do {
			switch(horario) {
			case 1:
				h= "9:00";
				break;
			case 2:
				h= "11:00";
				break;
			default:
				do {
				continueLoop = true;	
				try {
				System.out.println("\nOp��o inv�lida. Digte o hor�rio novamente:");
				System.out.println("\nEscolha o hor�rio: "+"\n1-9:00\n2-11:00");
				horario = leia.nextInt();
			}catch(InputMismatchException inputMismatchException)
			{	continueLoop = false;
				System.err.printf("\nException: %s\n",inputMismatchException);
				leia.nextLine();
				System.out.println("\nVoc� deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			}
				}while(continueLoop==false);
				switch(horario) {
				case 1:
					h= "9:00";
					break;
				case 2:
					h= "11:00";
					break;
				}
			} 
		}while(horario<1 || horario>2);
	} 
}
