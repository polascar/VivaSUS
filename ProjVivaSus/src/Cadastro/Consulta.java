package VivaSUS.ProjVivaSus.src.Cadastro;

import java.util.Date;

public class Consulta // mudei de interface para classe pq ele tem mais caracteristicas de classe
{
	//são os atributos (adjetivos) do objeto consulta 
	private Date dataHorario;//em dataHorario vai caber as infos de data e hora juntos
	private Especialidades especialidade;// a escolha da especialidade vai levar até a pessoa médica
	
	
	//construtor
	public Consulta(Date dataHorario, Especialidades especialidade, String endereco) 
	{
		//atribuindo valor aos atributos
		this.dataHorario = dataHorario;
		this.especialidade = especialidade;

	}
	//gets e sets
	public Date getDataHorario() {
		return dataHorario;
	}

	public void setDataHorario(Date dataHorario) {
		this.dataHorario = dataHorario;
	}

	public Especialidades getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidades especialidade) {
		this.especialidade = especialidade;
	}
}
