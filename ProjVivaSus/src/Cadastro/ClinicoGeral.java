package Cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class ClinicoGeral extends Especialidades{
	
	public ClinicoGeral() {
		super("Clinico Geral");
	}
	
	int medico,dia,horario;
	Scanner leia = new Scanner (System.in);
	
	ArrayList <String> estoque = new ArrayList();
	
	@Override
	public void medico(int medico) {
		System.out.println("\nEscolha o médico: "+"\n1-Ana\n2-David");
		medico = leia.nextInt();
		switch(medico) {
		case 1:
			System.out.println("\nObs. Dr. Ana que atende na Rua Barão do Duprat, 323");
			break;
		case 2:
			System.out.println("\nObs. Dr. David que atende na Rua Aracatu, 02");
			break;
			default:
			System.out.println("\nInvalido!!");
		}
	}

	@Override
	public void dia(int dia) {
		// TODO Auto-generated method stub
		System.out.println("\nEscolha o dia da semana: "+"\n1 - Segunda-feira \n2 - Terça-feira \n3 - Quarta-feira \n4 - Quinta-feira \n5 - Sexta-feira");
		dia = leia.nextInt();
		switch(dia) {
		case 1:
			System.out.println("\nSegunda-feira");
			break;
		case 2:
			System.out.println("\nTerça-feira");
			break;
		case 3:
			System.out.println("\nQuarta-feira");
			break;
		case 4:
			System.out.println("\nQuinta-feira");
			break;
		case 5:
			System.out.println("\nSexta-feira");
			break;
			default:
			System.out.println("\nInvalido!!");
		}
	}
	
	@Override
	public void horario(int horario) {
		System.out.println("\nEscolha o horario: "+"\n1-9:00\n2-11:00");
		horario = leia.nextInt();
		switch(horario) {
		case 1:
			System.out.println("\n1-Agendado ás 9:00");
			break;
		case 2:
			System.out.println("\n2-Agendado ás 11:00");
			break;
			default:
			System.out.println("\nInvalido!!");
		} 
	}
	System.out.print("\nSua consulta foi agendada com o/a Dr. "+medico+", na "+dia+" no horário "+horario);
 
}
