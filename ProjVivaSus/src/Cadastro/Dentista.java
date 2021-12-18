package Cadastro;

public class Dentista extends Especialidades{

	public Dentista() {
		super("Dentista");
	}
	
	@Override
	public void medico(int medico) {
		System.out.println("\nEscolha o Dentista: "+"\n1-Maria\n2-Paulo");
		switch(medico) {
		case 1:
			System.out.println("\nConsulta agendada com a Dr.Maria que atende na Avenida Monteiro Lobato, 267");
			break;
		case 2:
			System.out.println("\nConsulta agendada com a Dr.Paulo que atende na Av Washigton Luis, 400");
			break;
			default:
			System.out.println("\nInvalido!!");
		}
	}
	@Override
	public void horario(int horario) {
		System.out.println("\nEscolha o horario: "+"\n1-9:00\n2-11:00");
		switch(horario) {
		case 1:
			System.out.println("\n1-13:00");
			break;
		case 2:
			System.out.println("\n2-16:00");
			break;
			default:
			System.out.println("\nInvalido!!");
		}
	}
	@Override
	public void dia(int dia) {
		// TODO Auto-generated method stub
		switch(dia) {
		case 1:
			System.out.println("\nConsulta agendada para segunda-feira");
			break;
		case 2:
			System.out.println("\nConsulta agendada para terça-feira");
			break;
		case 3:
			System.out.println("\nConsulta agendada para quarta-feira");
			break;
		case 4:
			System.out.println("\nConsulta agendada para quinta-feira");
			break;
		case 5:
			System.out.println("\nConsulta agendada para sexta-feira");
			break;
			default:
			System.out.println("\nInvalido!!");
		}
	}

}
