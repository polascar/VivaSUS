package Cadastro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TesteConsultas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continueLoop = true;
		int op=0,nsus,g=0,p=0,i=0,f=0,k=0,l=0,o=0;
		String nc,ns,c,dn,end,ce;
		ArrayList <String> agendamentosDentista = new ArrayList();
		ArrayList <String> agendamentosGinecologista = new ArrayList();	
		ArrayList <String> agendamentosGeral = new ArrayList();	
		ClinicoGeral cg = new ClinicoGeral();
		Dentista den = new Dentista();
		Ginecologista gin = new Ginecologista();
		Paciente pc = new Paciente("","",1, 1, "","","",9,"");
		Especialidades esp = null;
		Scanner leia = new Scanner(System.in);	
		System.out.println("\n\t\t\tVivaSUS - Agendamento");
		System.out.println("Insira seus Dados Pessoais:");
		
		do {
				
		System.out.println("\nEntre com o seu Nome Completo:* ");
		nc=leia.nextLine();
		pc.setNomeCompleto(nc);
		if(nc=="") {
			System.out.println("\nCampo obrigatório ");
		}else {
			 i++;
		}
		}while(i<1);
		
		System.out.println("\nEntre com o seu Nome Social: ");
		ns=leia.nextLine();
		pc.setNomeSocial(ns);
		try {
		System.out.println("\nEntre com o seu Pronome: "+"\n1- Ela/Dela \n2- Ele/Dele \n3- Elu/Delu \n4- Não informa");
		p=leia.nextInt();
		pc.setPronome(p);
		}catch(InputMismatchException inputMismatchException)
		{
		System.err.printf("\nException: %s\n",inputMismatchException);
		leia.nextLine();
		System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
		}
		do {
		switch(p) {
		case 1:
			System.out.println("");
			break;
		case 2:
			System.out.println("");
			break;
		case 3:
			System.out.println("");
		case 4:
			System.out.println("");
			break;
			default:
			try {	
			System.out.println("\nOpção inválida. Digte o Pronome novamente:");
			System.out.println("\nEntre com o seu Pronome: "+"\n1- Ela/Dela \n2- Ele/Dele \n3- Elu/Delu \n4- Não informa");
			p=leia.nextInt();
			pc.setPronome(p);
			}catch(InputMismatchException inputMismatchException)
			{
			System.err.printf("\nException: %s\n",inputMismatchException);
			leia.nextLine();
			System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			}
			switch(p) {
			case 1:
				System.out.println("");
				break;
			case 2:
				System.out.println("");
				break;
			case 3:
				System.out.println("");
			case 4:
				System.out.println("");
				break;
		}
		}	
		}while(p<1 || p>4);
				
		try {	
		System.out.println("\nEntre com o seu Gênero: "+"\n1- Feminino \n2- Masculino \n3- Não Binário \n4- Trans");
		g=leia.nextInt();
		pc.setGenero(g);
		}catch(InputMismatchException inputMismatchException)
		{
		System.err.printf("\nException: %s\n",inputMismatchException);
		leia.nextLine();
		System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
		}
		do {
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
			try {
			System.out.println("\nOpção inválida. Digte o Gênero novamente:");
			System.out.println("\nEntre com o seu Gênero: "+"\n1- Feminino \n2- Masculino \n3- Não Binário \n4- Trans");
			g=leia.nextInt();
			pc.setGenero(g);
		}catch(InputMismatchException inputMismatchException)
		{
			System.err.printf("\nException: %s\n",inputMismatchException);
			leia.nextLine();
			System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
		}
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
				}
			}
		}while(p<1 || p>4);
		
				
		System.out.println("\nEntre com a sua Data de Nascimento:* ");
		dn=leia.nextLine();
		dn=leia.nextLine();
		pc.setDataNascimento(dn);
		do {
		if(dn=="") {
			System.out.println("\nCampo obrigatório ");
			System.out.println("\nEntre com a sua Data de Nascimento:* ");
			dn=leia.nextLine();
			pc.setDataNascimento(dn);
		}else {
			 f++;
		}
		}while(f<1);
		
		
		System.out.println("\nEntre com o seu CPF:(somente os numeros)* ");
		c=leia.nextLine();
		pc.setCpf(c);
		do{
		if(c=="") {
			System.out.println("\nCampo obrigatório ");
			System.out.println("\nEntre com o seu CPF:(somente os numeros)* ");
			c=leia.nextLine();
		}else {
			k++;
			if(c.length()!=11) {
				System.out.println("\nDigite o CPF correto");
				System.out.println("\nEntre com o seu CPF:(somente os numeros)* ");
				c=leia.nextLine();
				pc.setCpf(c);
			}	
			if(c.length()!=11) {
				k--;
			}			
		}
		}while(k<1);
		
		
		System.out.println("\nEntre com o seu Endereço:* ");
		end=leia.nextLine();
		do {	
		pc.setEndereco(end);
		if(end=="") {
			System.out.println("\nCampo obrigatório ");
			System.out.println("\nEntre com o seu Endereço: ");
			end=leia.nextLine();
		}else {
			l++;
		}
		}while(l<1);
		
		do {
		continueLoop = true;
		try {
		System.out.println("\nEntre com o seu Número do Sus: ");
		nsus=leia.nextInt();
	
		pc.setNumSus(nsus);}catch(InputMismatchException inputMismatchException)
		{	continueLoop = false;
			System.err.printf("\nException: %s\n",inputMismatchException);
			leia.nextLine();
			System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
		}
		}while(continueLoop==false);
		
		
		System.out.println("\nEntre com o seu Contato de Emergencia: ");
		ce=leia.nextLine();
		ce=leia.nextLine();
		do {	
		pc.setContatoEmerg(ce);
		if(ce=="") {
			System.out.println("\nCampo obrigatório ");
			System.out.println("\nEntre com o seu Contato de Emergencia: ");
			ce=leia.nextLine();
		}else {
			o++;
		}
		}while(o<1);
		
		
		do {
		do {	
		do {
		continueLoop = true;		
		try{
		System.out.println("\n--------------------------------------------------------------");
		System.out.println("\nEscolha qual especialidade deseja a consulta: ");
		System.out.println("\n1- Clinico Geral");
		System.out.println("\n2- Dentista");
		System.out.println("\n3- Ginecologista");
		System.out.println("\n0- Sair do programa?");
		op = leia.nextInt();
		}catch(InputMismatchException inputMismatchException)
		{	continueLoop = false;
			System.err.printf("\nException: %s\n",inputMismatchException);
			leia.nextLine();
			System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
		}
		}while(continueLoop==false);
		switch(op) {
		case 0: System.out.println("\nPrograma finalizado");break;
		case 1: esp = cg; break;
		case 2: esp = den;break;
		case 3: esp = gin; break;
		default: System.out.println("\nOpção inválida. Digte a especialidade novamente:");
			do{
			continueLoop = true;
			try {
			System.out.println("\n--------------------------------------------------------------");
			System.out.println("\nEscolha qual especialidade deseja a consulta: ");
			System.out.println("\n1- Clinico Geral");
			System.out.println("\n2- Dentista");
			System.out.println("\n3- Ginecologista");
			System.out.println("\n0- Sair do programa?");
			op = leia.nextInt();
		}catch(InputMismatchException inputMismatchException)
		{	continueLoop = false;
			System.err.printf("\nException: %s\n",inputMismatchException);
			leia.nextLine();
			System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
		}
		}while(continueLoop==false);
			switch(op) {
			case 1: esp = cg; break;
			case 2: esp = den;break;
			case 3: esp = gin; break;
			case 0: System.out.println("\nPrograma finalizado");break;
			}
		}
		}while(op<0 || op>3);
		 if(esp != null && op!=0) {
			 esp.medico(1);
			 esp.dia(1);
			 esp.horario(1);
		 }
		 if(op==1) {
			 	cg.dhm="";
				cg.dhm= cg.m+cg.d+cg.h;
				
				if(agendamentosGeral.contains(cg.dhm)) {
					System.out.println("\nData e horario indisponível. Escolha outra data e/ou horario. ");
				}else {
					agendamentosGeral.add(cg.dhm);
					System.out.println("\nSua consulta foi agendada com o/a "+cg.m+", no Endereço "+cg.r+" na "+cg.d+", ás "+cg.h+".");
				}
		 }else if(op==2) {
			 	den.dhm="";
				den.dhm= den.m+den.d+den.h;
								
				if(agendamentosDentista.contains(den.dhm)) {
					System.out.println("\nData e horario indisponível. Escolha outra data e/ou horario. ");
				}else {
					agendamentosDentista.add(den.dhm);
					System.out.println("\nSua consulta foi agendada com o/a "+den.m+", no Endereço "+den.r+" na "+den.d+", ás "+den.h+".");
				}			
		 }else if(op==3) {
			 	gin.dhm="";
				gin.dhm= gin.m+gin.d+gin.h;
				
				if(agendamentosGinecologista.contains(gin.dhm)) {
					System.out.println("\nData e horario indisponível. Escolha outra data e/ou horario. ");
				}else {
					agendamentosGinecologista.add(gin.dhm);
					System.out.println("\nSua consulta foi agendada com o/a "+gin.m+", no Endereço "+gin.r+" na "+gin.d+", ás "+gin.h+".");
				}
		 }				
		}while(op!=0);
	}
}
