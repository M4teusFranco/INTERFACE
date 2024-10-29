package Classes; // Classe pertencente ao Pacote Classes

// Criação da Classe Abstrata Funcionário Assalariado, herdando a Classe Funcionário e Implementando a Interface Bônus
public class FuncionarioAssalariado extends Funcionario implements Bonus{
	public FuncionarioAssalariado(String nome, double salario) {
		super(nome, salario); // Chama o Construtor da Classe Funcionário para inicializar os Atributos
		this.nome=nome; // Inicializa o Nome
		this.salario=salario; // Inicializa o Salário
	}
	
	// Método para exibir os Dados do Funcionário Assalariado
	@Override
	public void calcularBonus(double bonus) {
	double salarioTotal=salario+bonus;
	System.out.println("- Assalariado - "
	+ "\nNome: "+nome+"\n" // Exibe o Nome
	+"Salário: "+salario+"\n" // Exibe o Salário
	+"Bônus:" +bonus+"\n" // Exibe o Bônus já fixado em 5000.00
	+"Salário Total: "+salarioTotal // Exibe o Salário Total
	);
	}
	

}
