import java.util.Scanner;

public class Reajuste {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		float salario;
		float salarioFinal;
		float reajuste;
		
		
		System.out.println("Digite seu salário atual");
		salario = teclado.nextFloat();
		System.out.println("Porcentagem de reajuste");
		reajuste = teclado.nextFloat()/100;
		
		salarioFinal = salario + (salario * reajuste);
		System.out.println(salarioFinal);
		System.out.println("Programa encerrado.");
		
	}
	
}
