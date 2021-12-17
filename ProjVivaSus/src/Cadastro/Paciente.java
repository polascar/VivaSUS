package Cadastro;

public class Paciente implements Consultas{
	
	private String nomeCompleto;
	private String nomeSocial;
	private String cpf;
	private String pronome;
	private String dataNascimento;
	private String endereco;
	private String genero;
	private float numSus;
	private String contatoEmerg;
	private String regiao;
	private int dia;
	
	public Paciente(String nomeCompleto,String nomeSocial,String cpf,String pronome,String dataNascimento,String endereco,String genero, float numSus, String contatoEmerg,String regiao) 
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
		this.regiao = regiao;
	}
	
	public void imprimirInfoPadrao() 
	{
		System.out.println("\nEssa pessoa é a"+nomeCompleto+" com o CPF "+
	cpf+". Esta pessoa utiliza o pronome "+pronome+" e o seu gênero é: "+genero+
	". Sua data de nascimento é: "+dataNascimento+" e com o endereço "+endereco);
	}
	
	public Paciente(String nomeSocial,String cpf,String pronome,String dataNascimento,String endereco, float numSus, String contatoEmerg,String regiao) 
	{
		//pessoa trans e não-binária
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.pronome = pronome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.numSus = numSus;
		this.contatoEmerg = contatoEmerg;
		this.regiao = regiao;
	}
	
	public void imprimirInfoPessoa() 
	{
		System.out.println("\nEssa pessoa é a"+nomeSocial+" com o CPF "+
		cpf+". Esta pessoa utiliza o pronome "+pronome+" e o seu gênero é: "+genero+
		". Sua data de nascimento é: "+dataNascimento+" e com o endereço "+endereco+".");
	}
	
	public void Pessoa(String nomeCompleto,String cpf,String dataNascimento,String endereco,String genero, float numSus, String contatoEmerg,String regiao) 
	{
		//pessoa sem pronome e nomeSocial
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.numSus = numSus;
		this.contatoEmerg = contatoEmerg;
		this.regiao = regiao;
	}
	
	public void imprimirInfoSem() 
	{
		System.out.println("\nEssa pessoa é a"+nomeCompleto+" com o CPF "+
		cpf+". Esta pessoa utiliza o gênero: "+genero+". Sua data de nascimento"
		+ " é: "+dataNascimento+" e com o endereço "+endereco);
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

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public String marcarConsulta() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void dia() {
		
		System.out.println("\n------------------------------");
		System.out.println("\nPor gentileza, selecione algum número a seguir para marcar a consulta: ");
		System.out.println("\n(1) Segunda-feira");
		System.out.println("\n(2) Terça-feira");
		System.out.println("\n(3) Quarta-feira");
		System.out.println("\n(4) Quinta-feira");
		System.out.println("\n(5) Sexta-feira");
		// TODO Auto-generated method stub
		switch(dia) {
		case 1:
			System.out.println("\nA consulta foi agendada para Segunda-feira");
			break;
		case 2: 
			System.out.println("\nA consulta foi agendada para Terça-feira");
			break;
		case 3: 
			System.out.println("\nA consulta foi agendada para Quarta-feira");
			break;
		case 4: 
			System.out.println("\nA consulta foi agendada para Quinta-feira");
			break;
		case 5:
			System.out.println("\nA consulta foi agendada para Sexta-feira");
			break;
			default:
				System.out.println("\nO dia digitado foi inválido! Por favor, digite um número de 1 até 5.");
		}
	}

	@Override
	public void horario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void medico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEspecialidade() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEspecialidade() {
		// TODO Auto-generated method stub
		
	}
	
		
}
