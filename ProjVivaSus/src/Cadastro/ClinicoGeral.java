package VivaSUS.ProjVivaSus.src.Cadastro;

import java.util.Date;
import java.util.Scanner;

public class ClinicoGeral extends Especialidades{
	
	//construtor
	public ClinicoGeral(String pessoaMedica) {
		super("Clinico Geral", pessoaMedica);
	}
	
	Scanner leia= new Scanner(System.in);


	@Override
	public void setPessoaMedica(String pessoaMedica) {
		System.out.println("\nEscolha a pessoa Médica que te atende: "+"\n1-Ana\n2-David");
		int med= leia.nextInt();//resposta do usuário
		
		switch(med) {
		case 1:
			System.out.println("\nConsulta agendada com a Dr. Ana que atende na unidade de Saúde Rua Barão do Duprat, 323");
			pessoaMedica= "Ana";
			endereco="Rua Barão do Duprat, 323";
			break;
		case 2:
			System.out.println("\nConsulta agendada com a Dr. David que atende na Rua Aracatu, 02");
			break;
			default:
			System.out.println("\nInvalido!!");
		}
	}
	int hr;
	@Override
	public void setDataHorario(Date dataHorario) {
		System.out.println("\nEscolha o horario:\n1- Segunda9:00\n2-11:00");
		switch(hr) {
		case 1:
			System.out.println("\n1-9:00");
			break;
		case 2:
			System.out.println("\n2-11:00");
			break;
			default:
			System.out.println("\nInvalido!!");
		}
	}

}
