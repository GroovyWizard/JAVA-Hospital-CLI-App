package com.hospital.menu;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.hospital.model.*;

public class MenuGeral {
	
	Scanner leitor = new Scanner(System.in);
	public ArrayList<Paciente> pacienteLista = new ArrayList<Paciente>();
	public ArrayList<Consulta> consultaLista = new ArrayList<Consulta>();
	public ArrayList<Prontuario> prontuarioLista = new ArrayList<Prontuario>();
	LocalDate teste = LocalDate.of(2026, 1, 22);
	LocalDate hoje = LocalDate.now();
	LocalDate amanha = hoje.plusDays(1);
	//objetos para simulação 
			Paciente paciente1 = new Paciente("Josias", "12", "12", "12", "12","12", "", "", "", "", "", "", "");
			Consulta consulta1 = new Consulta(paciente1, "Cleber", hoje, "232");
			Paciente paciente2 = new Paciente("Ronaldo", "12", "12", "12", "12","12", "", "", "", "", "", "", "");
			Consulta consulta2 = new Consulta(paciente2, "Everton", amanha, "232");
			Paciente paciente3 = new Paciente("Marcelo", "12", "12", "12", "12","12", "", "", "", "", "", "", "");
			Consulta consulta3 = new Consulta(paciente3, "Jorge", teste, "232");
			Paciente paciente4 = new Paciente("Rafael", "12", "12", "12", "12","12", "", "", "", "", "", "", "");
			Consulta consulta4 = new Consulta(paciente4, "Marco", hoje, "232");
	//
			
	public void menuSecretaria(){
		pacienteLista.add(paciente1);
		pacienteLista.add(paciente2);
		pacienteLista.add(paciente3);
		pacienteLista.add(paciente4);
		
		consultaLista.add(consulta1);
		consultaLista.add(consulta2);
		consultaLista.add(consulta3);
		consultaLista.add(consulta4);

		
		
		int opcao;
	

		do {
		
		System.out.println("Selecione uma opção");
		System.out.println("OUTRAS FUNCIONALIDADES:");
		System.out.println("0 - MENU MEDICO");
		System.out.println("111 - ENVIAR MENSAGEM PARA PACIENTES DO DIA SEGUINTE");
		System.out.println("---------------------------");
		System.out.println("PACIENTES:");
		System.out.println("1- Cadastrar paciente");
		System.out.println("2- Atualizar paciente");
		System.out.println("3- Deletar paciente");
		System.out.println("---------------------------");
		System.out.println("CONSULTAS:");
		System.out.println("4- Cadastrar consulta");
		System.out.println("5- Atualizar consulta");
		System.out.println("6- Deletar consulta");
		System.out.println("---------------------------");
		System.out.println("RELATORIOS:");
		System.out.println("7- Relatorio: consultas do dia seguinte");
		System.out.println("8- SAIR");
		System.out.println("---------------------------");
		System.out.println("DESENVOLVIMENTO");
		System.out.println("9- Listar todos os pacientes ");
		System.out.println("10- Listar todos as consultas ");

		
		opcao = leitor.nextInt();


			switch(opcao) {
				case 111:
					mostrarTodasConsultas();
					break;
				case 0:
					menuMedico();
					break;
				case 1:
					cadastrarPaciente();
					break;
				case 2:
					atualizarPaciente();
					break;
				case 3:
					deletarPaciente();
					break;
				case 4:
					cadastrarConsulta(); 
					break;
				case 5: 
					atualizarConsulta();
					break;
				case 6:
					deletarConsulta();
					break;
				case 7:
					gerarRelatorio();
					break;
				case 8: 
					System.out.println("Aplicação terminada!");
					System.exit(0);
					break;
				case 9:
					mostrarTodosPacientes();
					break;
				case 10:
					mostrarTodasConsultas();
					break;
					
			}
	} while(opcao != 8);
}
	
	public void menuMedico() {
		pacienteLista.add(paciente1);
		pacienteLista.add(paciente2);
		pacienteLista.add(paciente3);
		pacienteLista.add(paciente4);
		
		consultaLista.add(consulta1);
		consultaLista.add(consulta2);
		consultaLista.add(consulta3);
		consultaLista.add(consulta4);
		
		int opcao;
		
		do {
			
			System.out.println("Selecione uma opção");
			System.out.println("---------------------------");
			System.out.println("0 - ACESSAR O MENU SECRETARIA");
			System.out.println("---------------------------");
			System.out.println("PACIENTES:");
			System.out.println("1- Atualizar dados medicos");
			System.out.println("2- Remover dados medicos");
			System.out.println("---------------------------");
			System.out.println("PRONTUARIO:");
			System.out.println("3- Cadastrar prontuario");
			System.out.println("4- Atualizar prontuario");
			System.out.println("5- Deletar prontuario");
			System.out.println("---------------------------");
			System.out.println("RELATORIOS MEDICOS");
			System.out.println("6- Gerar receita");
			System.out.println("7- Gerar atestado");
			System.out.println("8- Gerar declaracao de acompanhamento");
			System.out.println("9- Mostrar clientes atendidos no mes");
			System.out.println("---------------------------");
			System.out.println("10- SAIR");
			System.out.println("DESENVOLVIMENTO");
			System.out.println("11- Listar todos os pacientes ");
			System.out.println("12- Listar todas as consultas ");
			System.out.println("13- Listar todos os prontuarios ");


			
			opcao = leitor.nextInt();


				switch(opcao) {
					case 0:
						menuSecretaria();
						break;
					case 1:
						atualizarDadosMedicos();
						break;
					case 2:
						removerDadosMedicos();
						break;
					case 3:
						criarProntuario();
						break;
					case 4:
						atualizarProntuario();
						break;
					case 5: 
						deletarProntuario();
						break;
					case 6:
						gerarReceita();
						break;
					case 7:
						criarAtestado();
						break;
					case 8: 
						criarDeclaracao();
						break;
					case 9:
						clientesAtendidos();
						break;
					case 10:
						System.out.println("Aplicação terminada!");
						System.exit(0);
						break;
					case 11:
						mostrarTodosPacientes();
						continuarNoMenu();
						break;
					
					case 12:
						mostrarTodasConsultas();
						continuarNoMenu();

						break;
					case 13:
						mostrarTodosProntuarios();
						continuarNoMenu();

						break;
				
						
				}
		} while(opcao != 8);
	}
	
	
	
	public void gerenciadorMensagens() {
		LocalDate hoje = LocalDate.now();
		LocalDate amanha = hoje.plusDays(1);
		limparTela();
		for(int i = 0; i < consultaLista.size(); i++) {
			//verifica se a data da consulta e igual a amanha
			if(consultaLista.get(i).getData().compareTo(amanha) == 0) { 
				System.out.println("MENSAGENS QUE SERAO ENVIADAS");
				System.out.println("ID 		|	 NOME DO PACIENTE 	|   CELULAR");
				System.out.println(i + "			" + consultaLista.get(i).getPaciente().getNome() + "			" + consultaLista.get(i).getPaciente().getCelular());

			}
			
		}
		System.out.println("");
		continuarNoMenu();
	}
	
	
	public void cadastrarPaciente() {
		System.out.println("Insira o nome do paciente");
		leitor.nextLine();
		String nome = leitor.nextLine();
		
		System.out.println("Insira a data de nascimento do paciente");
		String nascimento = leitor.nextLine();
		
		System.out.println("Insira o endereco do paciente");
		String endereco = leitor.nextLine();
		
		System.out.println("Insira o email do paciente");
		String email = leitor.nextLine();
		
		System.out.println("Insira o celular do paciente");
		String celular = leitor.nextLine();
		
		System.out.println("Insira o tipo de convenio do paciente");
		String convenio = leitor.nextLine();

		Paciente paciente = new Paciente(nome, nascimento, endereco, email, celular,convenio, "", "", "", "", "", "", "");
		
		pacienteLista.add(paciente);
		
		limparTela();		
	}
	
	public void deletarPaciente(){
		System.out.println("Escolha um paciente para remover");
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("");
		System.out.println("Escolha um paciente, inserindo seu ID");
		int idInput = leitor.nextInt();
		
		pacienteLista.remove(idInput);
	}
	
	public void atualizarPaciente(){
		System.out.println("Escolha um paciente para atualizar");
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("");
		System.out.println("Escolha um paciente, inserindo seu ID");
		int idInput = leitor.nextInt();

		System.out.println("Insira o nome do paciente");
		leitor.nextLine();
		String nome = leitor.nextLine();
		
		System.out.println("Insira a data de nascimento do paciente");
		String nascimento = leitor.nextLine();
		
		System.out.println("Insira o endereco do paciente");
		String endereco = leitor.nextLine();
		
		System.out.println("Insira o email do paciente");
		String email = leitor.nextLine();
		
		System.out.println("Insira o celular do paciente");
		String celular = leitor.nextLine();
		
		System.out.println("Insira o tipo de convenio do paciente");
		String convenio = leitor.nextLine();

		Paciente paciente = new Paciente(nome, nascimento, endereco, email, celular,convenio, "", "", "", "", "", "", "");
		
		
		pacienteLista.set(idInput, paciente);	
	}
	
	public void cadastrarConsulta() {
		System.out.println("Insira o Medico que ira atender o paciente");
		leitor.nextLine();
		String medico = leitor.nextLine();
		
		System.out.println("Insira o Horario da consulta");
		leitor.nextLine();
		String horario = leitor.nextLine();
		
		System.out.println("Insira a Data da consulta");
		LocalDate data = inputData();
		System.out.println(data);
		
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("");
		System.out.println("Escolha um paciente, inserindo seu ID");
		int idInput = leitor.nextInt();
				
		Consulta consulta = new Consulta(pacienteLista.get(idInput), medico, data, horario);
		
		consultaLista.add(consulta);
		
		
		
		limparTela();
	}
	
	public void deletarConsulta(){
		System.out.println("Escolha uma consulta para remover");
		System.out.println("");
		mostrarTodasConsultas();
		System.out.println("");
		System.out.println("Escolha uma consulta, inserindo o ID");
		int idInput = leitor.nextInt();
		
		consultaLista.remove(idInput);

	}
	
	public void atualizarConsulta(){
		System.out.println("Escolha uma consulta para atualizar");
		System.out.println("");
		mostrarTodasConsultas();
		System.out.println("");
		System.out.println("Escolha uma consulta, inserindo o ID");
		int idInput = leitor.nextInt();
		
		System.out.println("Insira o Medico que ira atender o paciente");
		leitor.nextLine();
		String medico = leitor.nextLine();
		
		System.out.println("Insira o Horario da consulta");
		leitor.nextLine();
		String horario = leitor.nextLine();
		
		System.out.println("Insira a Data da consulta");
		leitor.nextLine();
		LocalDate data = inputData();
		
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("");
		System.out.println("Escolha um paciente, inserindo seu ID");
		idInput = leitor.nextInt();
				
		Consulta consulta = new Consulta(pacienteLista.get(idInput), medico, data, horario);
		consultaLista.set(idInput, consulta);
	}
	
	public void gerarRelatorio(){
		LocalDate hoje = LocalDate.now();
		LocalDate amanha = hoje.plusDays(1);
		limparTela();
		for(int i = 0; i < consultaLista.size(); i++) {
			//verifica se a data da consulta e igual a hoje
			if(consultaLista.get(i).getData().compareTo(amanha) == 0) { 
				System.out.println("CONSULTAS PARA AMANHA");
				System.out.println("ID 		|	 NOME DO PACIENTE");
				System.out.println(i + "			" + consultaLista.get(i).getPaciente().getNome());

			}
			
		}
		System.out.println("");
		continuarNoMenu();
		
	}
	
	//Metodos exclusivos medico
	
	public void atualizarDadosMedicos(){
		System.out.println("Escolha um paciente para alterar ou adicionar dados medicos");
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("");
		System.out.println("Escolha um paciente, inserindo o ID");
		int idInput = leitor.nextInt();
		
		Paciente pacienteAtualizar = pacienteLista.get(idInput);
		
		System.out.println("O paciente fuma?");
		leitor.nextLine();
		String fuma = leitor.nextLine();
		
		System.out.println("O paciente bebe?");
		String bebe = leitor.nextLine();
		
		System.out.println("O paciente tem diabete?");
		String diabete = leitor.nextLine();
		
		System.out.println("O paciente tem alguma doença cardiaca? Se sim quais");
		String doencaCardiaca = leitor.nextLine();
		
		System.out.println("O paciente tem historico de cirurgias? Se sim quais");
		String cirurgias = leitor.nextLine();
		
		System.out.println("O paciente tem alguma alergia? Se sim quais");
		String alergias = leitor.nextLine();		
		
		pacienteAtualizar.setFuma(fuma);
		pacienteAtualizar.setFuma(bebe);
		pacienteAtualizar.setFuma(diabete);
		pacienteAtualizar.setFuma(doencaCardiaca);
		pacienteAtualizar.setFuma(cirurgias);
		pacienteAtualizar.setFuma(alergias);
		
		pacienteLista.set(idInput, pacienteAtualizar);

		
		
	}
	
	public void removerDadosMedicos(){
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("");
		System.out.println("Escolha um paciente para remover dados medicos");
		System.out.println("Escolha um paciente, inserindo o ID");
		int idInput = leitor.nextInt();
		
		Paciente pacienteAtualizar = pacienteLista.get(idInput);		
		
		pacienteAtualizar.setFuma("");
		pacienteAtualizar.setFuma("");
		pacienteAtualizar.setFuma("");
		pacienteAtualizar.setFuma("");
		pacienteAtualizar.setFuma("");
		pacienteAtualizar.setFuma("");
		
		pacienteLista.set(idInput, pacienteAtualizar);
	}
	
	public void criarProntuario() {
		System.out.println("Escolha um paciente para criar o prontuario");
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("");
		System.out.println("Escolha um paciente, inserindo o ID");
		int idInput = leitor.nextInt();
		
		System.out.println("Insira os sintomas");
		leitor.nextLine();
		String sintomas = leitor.nextLine();
		
		System.out.println("Insira o diagnostico");
		leitor.nextLine();
		String diagnostico = leitor.nextLine();
		
		System.out.println("Insira a prescricao");
		String prescricao = leitor.nextLine();
				
		Prontuario prontuario = new Prontuario(pacienteLista.get(idInput), sintomas, diagnostico, prescricao);
		prontuarioLista.add(prontuario);
	}
	
	public void atualizarProntuario() {
		System.out.println("Escolha um prontuario para atualizar");
		System.out.println("");
		mostrarTodosProntuarios();
		System.out.println("");
		System.out.println("Escolha um prontuario, inserindo o ID");
		int prontuarioInput = leitor.nextInt();
		
		System.out.println("Escolha um paciente que ira ter o prontuario atualizado");
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("");
		System.out.println("Escolha um paciente, inserindo o ID");
		int idInput = leitor.nextInt();
		
		System.out.println("Insira os sintomas");
		leitor.nextLine();
		String sintomas = leitor.nextLine();
		
		System.out.println("Insira o diagnostico");
		leitor.nextLine();
		String diagnostico = leitor.nextLine();
		
		System.out.println("Insira a prescricao");
		String prescricao = leitor.nextLine();
				
		Prontuario prontuario = new Prontuario(pacienteLista.get(idInput), sintomas, diagnostico, prescricao);
		prontuarioLista.set(prontuarioInput, prontuario);
	}
	
	public void deletarProntuario() {
		System.out.println("Escolha um prontuario para atualizar");
		System.out.println("");
		mostrarTodosProntuarios();
		System.out.println("");
		System.out.println("Escolha um prontuario, inserindo o ID");
		int idInput = leitor.nextInt();
		
		
		prontuarioLista.remove(idInput);
	}
	
	public void gerarReceita(){
		System.out.println("Escolha um paciente para criar a receita");
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("Escolha um paciente, inserindo seu ID");
		int idInput = leitor.nextInt();
		
		Paciente pacienteReceita = pacienteLista.get(idInput);
		Date date = new Date(); //data de hoje
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("Insira os medicamentos recomendados");
		leitor.nextLine();
		String medicamentos = leitor.nextLine();
		
		limparTela();
		System.out.println("RECEITA MEDICA");
		System.out.println("Atestado para " + pacienteReceita.getNome());
		System.out.println("Data da emissão da receita: " +  formatter.format(date));
		System.out.println("Medicamentos recomendados: " +  medicamentos);
		System.out.println("-----------------------------");
		
		continuarNoMenu();
	}
	
	public void criarAtestado() {
		System.out.println("Escolha um paciente para criar o atestado");
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("Escolha um paciente, inserindo seu ID");
		int idInput = leitor.nextInt();
		
		Paciente pacienteAtestado = pacienteLista.get(idInput);
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		limparTela();
		System.out.println("ATESTADO");
		System.out.println("Atestado para " + pacienteAtestado.getNome());
		System.out.println("Data do atestado:" +  formatter.format(date));
		System.out.println("-----------------------------");
		
		continuarNoMenu();
	}
	
	public void criarDeclaracao() {
		System.out.println("Escolha um paciente para criar a declaracao");
		System.out.println("");
		mostrarTodosPacientes();
		System.out.println("");
		System.out.println("Escolha um paciente, inserindo seu ID");
		int idInput = leitor.nextInt();
		
		System.out.println("Insira o nome do acompanhante");
		leitor.nextLine();
		String acompanhante = leitor.nextLine();
		
		Paciente pacienteDeclaracao = pacienteLista.get(idInput);
		Date date = new Date(); //data de hoje dinamica
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		limparTela();
		
		System.out.println("DECLARACAO DE ACOMPANHAMENTO");
		System.out.println("Declaracao para " + pacienteDeclaracao.getNome());
		System.out.println("Data da declaracao:" +  formatter.format(date));
		System.out.println("Acompanhante " + acompanhante);
		System.out.println("-----------------------------");
		
		continuarNoMenu();
	}
	
	public void clientesAtendidos() {
		LocalDate hoje = LocalDate.now();
		for(int i = 0; i < consultaLista.size(); i++) {
			//verifica se a data da consulta tem mes igual o atual
			System.out.println("CLIENTES ATENDIDOS NO MES");
			if(consultaLista.get(i).getData().getMonth() == hoje.getMonth()) { 
				System.out.println("ID 		|	 NOME DO PACIENTE");
				System.out.println(i + "			" + consultaLista.get(i).getPaciente().getNome());

			}
			
		}
		
		
	}
	
	public LocalDate inputData() {
		
		System.out.println("Insira o dia em numeros ex: 1");
		int dia = leitor.nextInt();
		System.out.println("Insira o mes em numeros ex: 1 para JANEIRO");
		int mes = leitor.nextInt();
		System.out.println("Insira o ano em numeros ex: 2022");
		int ano = leitor.nextInt();
		
		LocalDate data = LocalDate.of(ano, mes, dia);
		
		return data;
	}
	
	
	public void limparTela() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	public void continuarNoMenu() {
		leitor.nextLine();
		System.out.println("Deseja continuar no menu?");
		System.out.println("1- SIM");
		System.out.println("2- NAO");

		int opcao = leitor.nextInt();
		
		if(opcao == 2) {
			System.exit(0);
		}
	}
	
	public void mostrarTodosPacientes() {
		for(int i = 0; i < pacienteLista.size(); i++) {
			System.out.println("ID|NOME|FUMA|COLESTEROL|DIABETE|DOENCAS CARDIACAS|CIRURGIAS|ALERGIAS");
			System.out.println(i + " " + pacienteLista.get(i).getNome() + "	" + pacienteLista.get(i).getFuma() + "	" + pacienteLista.get(i).getColesterol()+ "	" + pacienteLista.get(i).getDiabete()+ "	" + pacienteLista.get(i).getFuma() + "	" + pacienteLista.get(i).getDoencaCardiaca()+ "	" + pacienteLista.get(i).getCirurgias()+ "	" + pacienteLista.get(i).getAlergias());

		}
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}
	
	public void mostrarTodasConsultas() {
		for(int i = 0; i < consultaLista.size(); i++) {
			System.out.println("ID 		|	 NOME DO PACIENTE");
			System.out.println(i + "			" + consultaLista.get(i).getPaciente().getNome());

		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	public void mostrarTodosProntuarios() {
		for(int i = 0; i < prontuarioLista.size(); i++) {
			System.out.println("ID 		|	 NOME DO PACIENTE");
			System.out.println(i + "			" + prontuarioLista.get(i).getPaciente().getNome());

		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
}
