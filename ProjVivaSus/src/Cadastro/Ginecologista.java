package VivaSUS.ProjVivaSus.src.Cadastro;

public class Ginecologista extends Especialidades {

	public Ginecologista(String pessoaMedica) {
		super("Ginecologista",pessoaMedica);
	}
	
	@Override
	public void medico(int medico) {
		System.out.println("\nEscolha o Ginecologista: "+"\n1-Sandra\n2-Samyra");
		switch(medico) {
		case 1:
			System.out.println("\nConsulta agendada com a Dr.Sandra que atende na rua Apuracana, 500");
			break;
		case 2:
			System.out.println("\nConsulta agendada com a Dr.Samyra que atende na Avenida Indianopólis, 1000");
			break;
			default:
			System.out.println("\nInvalido!!");
		}
	}
	
	@Override
	public void horario(int horario) {
		System.out.println("\nEscolha o horario: "+"\n1-12:00\n2-15:00");
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

	@Override
	public void dia(int dia) {
		// TODO Auto-generated method stub
		return;
	}

}
