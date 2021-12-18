package Cadastro;

public class Paciente{
	
	private String nomeCompleto;
	private String nomeSocial;
	private String cpf;
	private String pronome;
	private String dataNascimento;
	private String endereco;
	private String genero;
	private float numSus;
	private String contatoEmerg;
	
	public Paciente(String nomeCompleto,String nomeSocial,String pronome,String genero,String cpf,String dataNascimento,String endereco, float numSus, String contatoEmerg) 
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
	
	
	public Paciente(String nomeSocial,String cpf,String pronome,String dataNascimento,String endereco, float numSus, String contatoEmerg) 
	{
		//pessoa trans e não-binária
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.pronome = pronome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.numSus = numSus;
		this.contatoEmerg = contatoEmerg;
	}
	
	public void Pessoa(String nomeCompleto,String cpf,String dataNascimento,String endereco,String genero, float numSus, String contatoEmerg) 
	{
		//pessoa sem pronome e nomeSocial
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
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

	public String getPronome() {
		return pronome;
	}

	public void setPronome(String pronome) {
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
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
