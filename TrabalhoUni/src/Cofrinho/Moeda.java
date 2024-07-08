package Cofrinho;

import java.util.Objects;
//Criação da classe-mãe Moeda
public abstract class Moeda {

	Double valor;
	
	Moeda(Double v){
		valor=v;
	}
	
	abstract void info();
	
// Criação do equals para comparar se o objeto é igual ao alocado na memória
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Objects.equals(valor, other.valor);
	}
// Método para converter baseado na cotação da moeda específica
	public double converter() {
		return this.valor;
	}
	
}
