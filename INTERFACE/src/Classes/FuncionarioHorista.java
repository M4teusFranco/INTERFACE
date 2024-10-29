package Classes; // Classe pertencente ao Pacote Classes

// Criação da Classe Abstrata Funcionário Horista, herdando a Classe Funcionário e Implementando a Interface Bônus
public class FuncionarioHorista extends Funcionario implements Bonus{
	// Construtor da Classe Funcionário Horista
	public FuncionarioHorista(String nome, double salario) {
		super(nome, salario); // Chama o Construtor da Classe Funcionário para inicializar os Atributos
		this.nome=nome; // Inicializa o Nome
		this.salario=salario; // Inicializa o Salário
	}
		// Método para exibir os Dados do Funcionário Horista
		@Override
		public void calcularBonus(double bonus) {
		double bonusTotal=salario*0.10; // Cálculo do Bônus
		double salarioTotal=salario+bonusTotal; // Cálculo do Salário Total
		System.out.println("\n- Horista - "
		+ "\nNome: "+nome+"\n" // Exibe o Nome
		+"Salário: "+salario+"\n" // Exibe o Salário
		+"Bônus: "+bonusTotal+"\n" // Exibe o Bônus
		+"Salário Total: "+salarioTotal // Exibe o Salário Total
		);
	
	}
}
