package controleDisciplinas;

import javax.swing.JOptionPane;

public class Main {

	
	public static void main(String[] args) {
		boolean ativo = true;
		String menu = "Sistema de Controle de Disciplinas"
				+ "\n"
				+ "\nEscolha a opção desejada: "
				+ "\n"
				+ "\n1. Cadastrar Professor"
				+ "\n2. Listar Professores"
				+ "\n3. Cadastrar Disciplina"
				+ "\n4. Listar Disciplinas"
				+ "\n5. Consultar Professor da Disciplina"
				+ "\n6. Consutar Professores por Titulação"
				+ "\n"
				+ "\n0. Sair"
				+ "\n";
		
		do {
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (escolha) {
			case 1:
				cadastrarProfessor();
				
				break;
			case 2:
				
				JOptionPane.showMessageDialog(null,Professor.getListaProfessores());
				
				break;
			case 3:
				cadastrarDisciplina();
				
				break;
			case 4:
				JOptionPane.showMessageDialog(null,Disciplina.getListaDisciplinas());
				
				break;
			case 5:
				String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
				JOptionPane.showMessageDialog(null, Disciplina.buscarProfessorDeDisciplina(nomeDisciplina));
				
				break;
			case 6:
				String titulacao = JOptionPane.showInputDialog("Informe a titulação: ");
				JOptionPane.showMessageDialog(null, Professor.buscarPorTitulacao(titulacao));
				
				break;
			case 0:
				ativo = false;
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema!");
				break;
			

			default:
				JOptionPane.showMessageDialog(null,"Opção inválida!");
			}
			
			
		} while (ativo);
		
	}

	private static void cadastrarProfessor() {
		String nomeProfessor = JOptionPane.showInputDialog("Informe o nome do professor: ");
		String titulacao = JOptionPane.showInputDialog("Informe a titulação máxima do professor: ");
		double cargaHorariaProfessor = Double.parseDouble(JOptionPane.showInputDialog("Informe a carga horária do professor: "));
		new Professor(nomeProfessor, titulacao, cargaHorariaProfessor);
		JOptionPane.showMessageDialog(null,"Professor cadastrado com sucesso!");
	}

	private static void cadastrarDisciplina() {
		String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
		double cargaHorariaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Informe a carga horária da disciplina: "));
		int opcao = JOptionPane.showConfirmDialog(null, "A disciplina é ministrada por um professor já cadastrado?");
		
		if (opcao == 0) {
			String nomeProfessor = JOptionPane.showInputDialog("Informe o nome do professor: ");
			Professor professorEncontrado = Professor.buscarPorNome(nomeProfessor);
			new Disciplina(nomeDisciplina, cargaHorariaDisciplina, professorEncontrado);

		} else if (opcao == 1) {
			JOptionPane.showMessageDialog(null, "Vamos cadastrar um novo professor!");
			cadastrarProfessor();
			new Disciplina(nomeDisciplina, cargaHorariaDisciplina, Professor.getListaProfessores().get(Professor.getListaProfessores().size() - 1));
		}
		
		JOptionPane.showMessageDialog(null,"Disciplina cadastrada com sucesso!");
	}
	
}
