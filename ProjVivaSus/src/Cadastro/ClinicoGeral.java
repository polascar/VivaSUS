package Cadastro;

public class ClinicoGeral extends Especialidades{
	
	public ClinicoGeral() {
		super("Clinico Geral");
	}
	
	@Override
	public String getEspecialidade() {
		return "\n\tClinico Geral";
	}
	@Override
	public void medico(int medico) {
		System.out.println("\nEscolha o médico: "+"\n1-Ana\n2-David");
		switch(medico) {
		case 1:
			System.out.println("\nConsulta agendada com a Dr. Ana que atende na Rua Barão do Duprat, 323");
			break;
		case 2:
			System.out.println("\nConsulta agendada com a Dr. David que atende na Rua Aracatu, 02");
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
			System.out.println("\n1-9:00");
			break;
		case 2:
			System.out.println("\n2-11:00");
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
