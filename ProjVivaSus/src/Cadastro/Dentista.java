package Cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class Dentista extends Especialidades{

	String d, h, m,r,dhm;
	public Dentista() {
		super("Dentista");
	}

	Scanner leia = new Scanner (System.in);
	
	@Override
	public void medico(int medico) {
		System.out.println("\nEscolha o Dentista: "+"\n1-Maria\n2-Paulo");
		medico = leia.nextInt();
		do {
			switch(medico) {
			case 1:
				System.out.println("\nObs. Dr. Maria atende na Avenida Monteiro Lobato, 267");
				m="Dr. Maria";
				r="Avenida Monteiro Lobato, 267";
			
				break;
			case 2:
				System.out.println("\nObs. Dr. Paulo atende na Av Washigton Luis, 400");
				m="Dr. Paulo";
				r="Av Washigton Luis, 400";
			
				break;
			default:
				System.out.println("\\nOpção inválida. Escolha o Dentista novamente:");
				System.out.println("\nEscolha o Dentista: "+"\n1-Maria\n2-Paulo");
				medico = leia.nextInt();
			
				switch(medico) {
				case 1:
					System.out.println("\nObs. Dr. Maria atende na Avenida Monteiro Lobato, 267");
					m="Dr. Maria";
					r="Avenida Monteiro Lobato, 267";
					
					break;
				case 2:
					System.out.println("\nObs. Dr. Paulo atende na Av Washigton Luis, 400");
					m="Dr. Paulo";
					r="Av Washigton Luis, 400";
					
					break;
				}
			}
		}while(medico<1 || medico>2);
	}
	
	@Override
	public void dia(int dia) {
		// TODO Auto-generated method stub
		System.out.println("\nEscolha o dia da semana: "+"\n1 - Segunda-feira \n2 - Terça-feira \n3 - Quarta-feira \n4 - Quinta-feira \n5 - Sexta-feira");
		dia = leia.nextInt();
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
				System.out.println("\nOpção inválida. Digte o dia da semana novamente:");
				System.out.println("\nEscolha o dia da semana: "+"\n1 - Segunda-feira \n2 - Terça-feira \n3 - Quarta-feira \n4 - Quinta-feira \n5 - Sexta-feira");
				dia = leia.nextInt();
				
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
		System.out.println("\nEscolha o horario: "+"\n1-9:00\n2-16:00");
		horario = leia.nextInt();
		do {
			switch(horario) {
			case 1:
				h="9:00";
				break;
			case 2:
				h="16:00";
				break;
			default:
				System.out.println("\nOpção inválida. Digte o horário novamente:");
				System.out.println("\nEscolha o horario: "+"\n1-9:00\n2-16:00");
				horario = leia.nextInt();
			
				switch(horario) {
				case 1:
					h="9:00";
					break;
				case 2:
					h="16:00";
					break;
				}	
			}
		}while(horario<1 || horario>2); 	
	}
}
