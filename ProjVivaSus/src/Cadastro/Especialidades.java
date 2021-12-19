package VivaSUS.ProjVivaSus.src.Cadastro;

public abstract class Especialidades {
	
	//atributos
	private String especialidade;//nome da especialidades: Clínico Geral, Ginecologista e Dentista.
	private String pessoaMedica;// nome da pessoa médica que irá realizar o atendimento.
	private String endereco;//endereço da unidade de saúde em que a consulta acontecerá
	
	//construtor
	public Especialidades(String especialidade, String pessoaMedica) {
		this.especialidade = especialidade;
		this.pessoaMedica = pessoaMedica;
	}
	//gets e sets
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getPessoaMedica() {
		return pessoaMedica;
	}
	public void setPessoaMedica(String pessoaMedica) {
		this.pessoaMedica = pessoaMedica;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
