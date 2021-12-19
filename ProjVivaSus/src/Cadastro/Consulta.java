package VivaSUS.ProjVivaSus.src.Cadastro;

import java.util.Date;

public class Consulta // mudei de interface para classe pq ele tem mais caracteristicas de classe
{
	//são os atributos (adjetivos) do objeto consulta 
	private Date dataHorario;
	private Especialidades especialidade;
	
	//construtor
	public Consulta(Date dataHorario, Especialidades especialidade) 
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
