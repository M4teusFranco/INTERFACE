package Main; // Classe pertencente ao Pacote Classes
import Classes.Bonus; // Importa a Interface Bônus do Pacote Classes
import Classes.Funcionario; // Importa a Classe Funcionário do Pacote Classes
import Classes.FuncionarioAssalariado; // Importa a Classe Funcionário Assalariado do Pacote Classes
import Classes.FuncionarioHorista; // Importa a Classe Funcionário Horista do Pacote Classes


public class Main {

	public static void main(String[] args) {

		System.out.println("------ Bônus ------");
		
		// Criação de Instância de Funcionário Assalariado
		Funcionario FuncionarioAssalariado1 = new FuncionarioAssalariado("Mateus", 12000.00);
		Bonus FuncionarioAssalariadoBonus = (Bonus) FuncionarioAssalariado1;
		FuncionarioAssalariadoBonus.calcularBonus(5000); // Puxa o Método de Cálculo de Bônus com o mesmo já fixado em 0
		
		// Criação de Instância de Funcionário Horista
		Funcionario FuncionarioHorista1 = new FuncionarioHorista("João", 5000.00);
		Bonus FuncionarioHoristaBonus = (Bonus) FuncionarioHorista1;
		FuncionarioHoristaBonus.calcularBonus(0); // Puxa o Método de Cálculo de Bônus de 10%
		
	}

}
