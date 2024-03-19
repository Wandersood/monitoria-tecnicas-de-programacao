package sistemaBancario;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario{

	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public Gerente() {}
	
	public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
	
	public boolean alterarSenha(int senhaAtual) {
		if (autentica(senhaAtual)) {
			//String novaSenhaSTR = JOptionPane.showInputDialog("Informe a senha");
			//int novaSenha = Integer.parseInt(novaSenhaSTR);
			boolean aux = true;
			
			do {
				int novaSenha = Integer.parseInt(JOptionPane.showInputDialog("Informe a nova senha:" ));
				int confirmacaoNovaSenha = Integer.parseInt(JOptionPane.showInputDialog("Confirme a nova senha:" ));
				
				if (novaSenha == confirmacaoNovaSenha) {
					this.senha = novaSenha;
					aux = false;
					JOptionPane.showMessageDialog(null, "Senha alterado com sucesso!");	
				} else {
					JOptionPane.showMessageDialog(null, "As senhas não são compatíveis!");
				}
			} while(aux);
			
			return true;
			
		} else {
			JOptionPane.showMessageDialog(null, "Senha atual incorreta!");
			return false;
		} 
	}
	
	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return this.numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	@Override
	public String toString() {
		return "Gerente [numeroDeFuncionariosGerenciados=" + numeroDeFuncionariosGerenciados + ", getBonificacao()="
				+ getBonificacao() + "]";
	}
	
}
