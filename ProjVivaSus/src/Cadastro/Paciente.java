package Cadastro;

public class Paciente{
	
	private String nomeCompleto;
	private String nomeSocial;
	private String cpf;
	private int pronome;
	private String dataNascimento;
	private String endereco;
	private int genero;
	private float numSus;
	private String contatoEmerg;
	
	public Paciente(String nomeCompleto,String nomeSocial,int pronome,int genero,String cpf,String dataNascimento,String endereco, float numSus, String contatoEmerg) 
	{
		//padrão
		this.nomeCompleto = nomeCompleto;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.pronome = pronome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.genero = genero;
		this.numSus = numSus;
		this.contatoEmerg = contatoEmerg;
	}
	
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getPronome() {
		return pronome;
	}

	public void setPronome(int pronome) {
		this.pronome = pronome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public float getNumSus() {
		return numSus;
	}

	public void setNumSus(float numSus) {
		this.numSus = numSus;
	}

	public String getContatoEmerg() {
		return contatoEmerg;
	}

	public void setContatoEmerg(String contatoEmerg) {
		this.contatoEmerg = contatoEmerg;
	}
	
}
