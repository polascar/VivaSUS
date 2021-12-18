package Cadastro;

import java.awt.Font;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TesteConsultas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op,nsus,g,p;
		String nc,ns,c,dn,end,ce;
		
		ClinicoGeral cg = new ClinicoGeral();
		Dentista den = new Dentista();
		Ginecologista gin = new Ginecologista();
		Paciente pc = new Paciente("","",1, 1, "","","",9,"");
		Especialidades esp = null;
		Scanner leia = new Scanner(System.in);
		System.out.println("\n\t\t\tVivaSUS - Agendamento");
		System.out.println("Insira seus Dados Pessoais:");
		System.out.println("\nEntre com o seu Nome Completo: ");
		nc=leia.nextLine();
		pc.setNomeCompleto(nc);
		System.out.println("\nEntre com o seu Nome Social: ");
		ns=leia.nextLine();
		pc.setNomeSocial(ns);
		System.out.println("\nEntre com o seu Pronome: "+"\n1- Ela/Dela \n2- Ele/Dele \n3- Elu/Delu");
		p=leia.nextInt();
		switch(p) {
		case 1:
			System.out.println("");
			break;
		case 2:
			System.out.println("");
			break;
		case 3:
			System.out.println("");
			break;
			default:
			System.out.println("\nInvalido!!");
		}
		pc.setPronome(p);
		System.out.println("\nEntre com o seu Genero: "+"\n1- Feminino \n2- Masculino \n3-Não Binário \n4-Trans");
		g=leia.nextInt();
		pc.setGenero(g);
		switch(g) {
		case 1:
			System.out.println("");
			break;
		case 2:
			System.out.println("");
			break;
		case 3:
			System.out.println("");
			break;
		case 4:
			System.out.println("");
			break;
			default:
			System.out.println("\nInvalido!!");}
		
		System.out.println("Entre com o sua Data de Nascimento: ");
		dn= leia.next();
		pc.setDataNascimento(dn);
		
		System.out.println("\nEntre com o seu CPF: ");
		c=leia.next();
		pc.setCpf(c);
		
		System.out.println("\nEntre com o seu Endereço: ");
		end=leia.next();
		pc.setEndereco(end);
		
		try {
		System.out.println("\nEntre com o seu Número do Sus: ");
		nsus=leia.nextInt();
		pc.setNumSus(nsus);}catch(InputMismatchException inputMismatchException)
		{
			System.err.printf("\nException: %s\n",inputMismatchException);
			leia.nextLine();
			System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			
		}
		System.out.println("\nEntre com o seu Contato de Emergencia: ");
		ce=leia.next();
		pc.setContatoEmerg(ce);
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
