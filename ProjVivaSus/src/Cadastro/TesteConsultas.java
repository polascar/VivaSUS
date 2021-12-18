package Cadastro;

import java.util.Scanner;

public class TesteConsultas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		ClinicoGeral cg = new ClinicoGeral();
		Dentista den = new Dentista();
		Ginecologista gin = new Ginecologista();
		Paciente pc = new Paciente("Maria","Maria","ela/dela", "feminino", "515866","31/02/2000","R. nada,233", 963852, "13564");
		Especialidades esp = null;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Dados Pessoais:");
		System.out.println(pc.getNomeCompleto());
		System.out.println(pc.getNomeSocial());
		System.out.println(pc.getPronome());
		System.out.println(pc.getGenero());
		System.out.println(pc.getCpf());
		System.out.println(pc.getDataNascimento());
		System.out.println(pc.getEndereco());
		System.out.println(pc.getNumSus());
		System.out.println(pc.getContatoEmerg());
		System.out.println("\n--------------------------------------------------------------");
		System.out.println("\nEscolha qual especialidade deseja a consulta: ");
		System.out.println("\n1- Clinico Geral");
		System.out.println("\n2- Dentista");
		System.out.println("\n3- Ginecologista");
		op = leia.nextInt();
		
		switch(op) {
		  
		case 1: esp = cg; break;
		case 2: esp = den; break;
		case 3: esp = gin; break;
		default: System.out.println("\nErro inesperado.");
		
		}
		 
		 if(esp != null) {
			 esp.medico(1);
			 esp.dia(1);
			 esp.horario(1);
		 }
		
		 
	}

}
