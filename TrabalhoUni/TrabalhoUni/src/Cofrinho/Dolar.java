package Cofrinho;

public class Dolar extends Moeda {

	Dolar(double v) {
		super(v);
	}

	@Override
	void info() {
		System.out.println("Dolar:"+valor);
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

	@Override
	public double converter() {
		return this.valor * 5.10;
	}
	
}
