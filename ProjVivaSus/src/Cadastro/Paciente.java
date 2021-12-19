package VivaSUS.ProjVivaSus.src.Cadastro;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente{
	
	private String nomeCompleto;
	private String nomeSocial;
	private String cpf;
	private String pronome;
	private String dataNascimento;
	private String endereco;
	private String genero;
	private String numSus;
	private String contatoEmerg;
	private String regiao;
	private List <Consulta> listaConsultas;
	
	
	public Paciente(String cpf,String dataNascimento,String endereco,String genero, String numSus) 
	{
		//infos obrigatórias para qualquer paciente
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.numSus = numSus;
		//iniciando uma lista para quando precisarmos mostrar consultas, é só chamar
		this.listaConsultas= new ArrayList<Consulta>();
	}
	
	public void imprimirInfos () throws IllegalAccessException
	{
		
		//informações obrigatórias
		String infos = "\nO número do seu CPF é "+
		cpf+".\nSua data de nascimento é: "+dataNascimento+"\ne o seu endereço é "+endereco+"\n";
		
		//informações opcionais 
		for (Field f : getClass().getDeclaredFields())
	        if (f.get(this) != null)
	        {
	        	infos+=f.getName()+": "+ f.get(this)+"\n";
	        } 
		System.out.print(infos);	
	}
	public void marcarConsulta (Date dataHorario, Especialidades especialidade)
	{
		Consulta consulta = new Consulta(dataHorario, especialidade);
		this.listaConsultas.add(consulta);
		System.out.print("Consulta marcada com sucesso!");
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

	public String getNumSus() {
		return numSus;
	}

	public void setNumSus(String numSus) {
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

	/*@Override
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
	*/
		
}
