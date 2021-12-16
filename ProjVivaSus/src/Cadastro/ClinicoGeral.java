package Cadastro;

public class ClinicoGeral extends Especialidades {
	
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
			System.out.println("\n1-Ana");
			break;
		case 2:
			System.out.println("\n2-David");
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
}
