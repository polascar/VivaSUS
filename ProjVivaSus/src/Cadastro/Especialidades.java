package Cadastro;

public abstract class Especialidades {

	private String Especialidade;
	
	abstract public void medico(int nome);
	abstract public void horario(int horario);
	
	public Especialidades(String Especialidade) {
		this.Especialidade = Especialidade;
	}
	public String getEspecialidade() {
		return Especialidade;
	}
	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}
	
}
