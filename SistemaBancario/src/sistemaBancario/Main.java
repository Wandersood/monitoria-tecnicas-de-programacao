package sistemaBancario;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Nelson", "464691649420", 5000);		
		/*Declarar um objeto com a classe pai, permite que o valor alocado na memória
		 varie entre as possíveis classes filhas. Porém só terá acesso a métodos presentes na classe
		 pai.
		 
		 ex: Funcionario g1 = new Gerente();
		 */
		Gerente g1 = new Gerente("Caio", "4545545454", 5000, 123456, 10);
	
	
		Conta cc = new ContaCorrente(f1, 0);
		Conta cl = new ContaLimite(g1, 0, 200);
		
		cc.depositar(350);
		cl.depositar(100);
		
		System.out.println(cl.toString());
		
		cl.tranferir(cc, 200);
		
		System.out.println(cl.toString());
		
		
	}

}
