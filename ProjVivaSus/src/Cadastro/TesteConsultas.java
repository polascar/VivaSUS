package Cadastro;

import java.util.Scanner;

public class TesteConsultas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClinicoGeral cg = new ClinicoGeral();
		Dentista den = new Dentista();
		Ginecologista gin = new Ginecologista();
		Paciente pc = new Paciente(null,null, null, null, null,null,null, 0, null, null);
		Especialidades esp = null;
		Scanner leia = new Scanner(System.in);
		
		System.out.println(pc.getNomeCompleto()+" deseja marcar a consulta, paciente tem o CPF"+pc.getCpf());
		
		/*switch(esp) {
		  
		case 0: esp = cg; break;
		case 1: esp = den; break;
		case 2: esp = gin; break;
		default: System.out.println("\nErro inesperado.");
		
		}*/
		 
		 if(esp != null) {
			 esp.medico(1);
			 esp.dia(1);
			 esp.horario(1);
		 }
		
		 
	}

}
