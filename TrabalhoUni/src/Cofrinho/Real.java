package Cofrinho;

public class Real extends Moeda {

	Real(double v) {
		super(v);
	}

	@Override
	void info() {
		System.out.println("Real:"+valor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	
// Apenas retorna o valor
	@Override
	public double converter() {
		return this.valor;
	}
	
}
