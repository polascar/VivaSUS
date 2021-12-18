package Cadastro;

public abstract class Especialidades {

	private String Especialidades;
	
	abstract public void medico(int nome);
	abstract public void horario(int horario);
	abstract public void dia(int dia);
	
	public Especialidades(String Especialidades) {
		this.Especialidades = Especialidades;
	}
	public String getEspecialidade() {
		return Especialidades;
	}
	public void setEspecialidade(String especialidades) {
		Especialidades = especialidades;
	}
}
