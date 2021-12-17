package Cadastro;

public class Dentista extends Especialidades{

	public Dentista() {
		super("Dentista");
	}
	@Override
	public String getEspecialidade() {
		return "\n\tDentista";
	}
	@Override
	public void medico(int medico) {
		System.out.println("\nEscolha o Dentista: "+"\n1-Maria\n2-Paulo");
		switch(medico) {
		case 1:
			System.out.println("\nConsulta agendada com a Dr.Maria");
			break;
		case 2:
			System.out.println("\nConsulta agendada com a Dr.Paulo");
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
		
	}
}
