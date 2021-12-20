package Cadastro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ginecologista extends Especialidades{

	String d, h, m,r,dhm;
	public Ginecologista() {
		super("Ginecologista");
	}
	
	Scanner leia = new Scanner (System.in);
	boolean continueLoop;
	@Override
	public void medico(int medico) {
		do {
		continueLoop = true;		
		try {
		System.out.println("\nEscolha o Ginecologista: "+"\n1-Sandra\n2-Samyra");
		medico = leia.nextInt();
	}catch(InputMismatchException inputMismatchException)
	{	continueLoop = false;
		System.err.printf("\nException: %s\n",inputMismatchException);
		leia.nextLine();
		System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
	}
		}while(continueLoop==false);
		do {
			switch(medico) {
			case 1:
				System.out.println("\nObs. Dr.Sandra atende na rua Apuracana, 500");
				m="Dr.Sandra";
				r="rua Apuracana, 500";
				
				break;
			case 2:
				System.out.println("\nObs. Dr.Samyra atende na Avenida Indianopólis, 1000");
				m="Dr.Samyra";
				r="Avenida Indianopólis, 1000";
				
				break;
			default:
				do {
				continueLoop = true;	
				try {
				System.out.println("\nOpção inválida. Escolha o Ginecologista novamente:");
				System.out.println("\nEscolha o Ginecologista: "+"\n1-Sandra\n2-Samyra");
				medico = leia.nextInt();
			}catch(InputMismatchException inputMismatchException)
			{	continueLoop = false;
				System.err.printf("\nException: %s\n",inputMismatchException);
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			}
				}while(continueLoop==false);
				switch(medico) {
				case 1:
					System.out.println("\nObs. Dr.Sandra atende na rua Apuracana, 500");
					m="Dr.Sandra";
					r="rua Apuracana, 500";
				
					break;
				case 2:
					System.out.println("\nObs. Dr.Samyra atende na Avenida Indianopólis, 1000");
					m="Dr.Samyra";
					r="Avenida Indianopólis, 1000";
					
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
		System.out.println("\nEscolha o dia da semana: "+"\n1 - Segunda-feira \n2 - Terça-feira \n3 - Quarta-feira \n4 - Quinta-feira \n5 - Sexta-feira");
		dia = leia.nextInt();
	}catch(InputMismatchException inputMismatchException)
	{	continueLoop = false;
		System.err.printf("\nException: %s\n",inputMismatchException);
		leia.nextLine();
		System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
	}
		}while(continueLoop==false);
		do {
		switch(dia) {
		case 1:
			d="Segunda-feira";
			break;
		case 2:
			d="Terça-feira";
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
			System.out.println("Opção inválida. Digte o dia da semana novamente:");
			System.out.println("\nEscolha o dia da semana: "+"\n1 - Segunda-feira \n2 - Terça-feira \n3 - Quarta-feira \n4 - Quinta-feira \n5 - Sexta-feira");
			dia = leia.nextInt();
		}catch(InputMismatchException inputMismatchException)
		{	continueLoop = false;
			System.err.printf("\nException: %s\n",inputMismatchException);
			leia.nextLine();
			System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
		}
			}while(continueLoop==false);
			switch(dia) {
			case 1:
				d="Segunda-feira";
				break;
			case 2:
				d="Terça-feira";
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
		System.out.println("\nEscolha o horario: "+"\n1-12:00\n2-15:00");
		horario = leia.nextInt();
	}catch(InputMismatchException inputMismatchException)
	{	continueLoop = false;
		System.err.printf("\nException: %s\n",inputMismatchException);
		leia.nextLine();
		System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
	}	
		}while(continueLoop==false);
		do {
			switch(horario) {
			case 1:
				h="12:00";
				break;
			case 2:
				h="15:00";
				break;
			default:
				do {
				continueLoop = true;
				try {
				System.out.println("\\nOpção inválida. Digte o horário novamente:");
				System.out.println("\nEscolha o horario: "+"\n1-12:00\n2-15:00");
				horario = leia.nextInt();
			}catch(InputMismatchException inputMismatchException)
			{	continueLoop = false;
				System.err.printf("\nException: %s\n",inputMismatchException);
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			}
				}while(continueLoop==false);
				switch(horario) {
				case 1:
					h="12:00";
					break;
				case 2:
					h="15:00";
					break;
				}
			}
		}while(horario<1 || horario>2);
	}
}
