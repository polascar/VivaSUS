package Cadastro;

import java.util.Scanner;

public class Ginecologista extends Especialidades{

	public Ginecologista() {
		super("Ginecologista");
	}
	
	Scanner leia = new Scanner (System.in);
	
	@Override
	public void medico(int medico) {
		System.out.println("\nEscolha o Ginecologista: "+"\n1-Sandra\n2-Samyra");
		medico = leia.nextInt();
		switch(medico) {
		case 1:
			System.out.println("\nObs. Dr.Sandra atende na rua Apuracana, 500");
			break;
		case 2:
			System.out.println("\nObs. Dr.Samyra atende na Avenida Indianopólis, 1000");
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
		System.out.println("\nEscolha o horario: "+"\n1-12:00\n2-15:00");
		horario = leia.nextInt();
		switch(horario) {
		case 1:
			System.out.println("\n1-12:00");
			break;
		case 2:
			System.out.println("\n2-15:00");
			break;
			default:
			System.out.println("\nInvalido!!");
		}
	}


}
