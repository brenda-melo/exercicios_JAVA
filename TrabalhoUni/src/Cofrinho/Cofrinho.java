package Cofrinho;

import java.util.ArrayList;
// Criação da listaMoedas
public class Cofrinho {
    ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    public Cofrinho() {
        listaMoedas = new ArrayList<Moeda>();
    }
   
// Métodos adicionar e remover da lista de moedas, listar e converter valores
    public void adicionar(Moeda v) {
        listaMoedas.add(v);
    }

    public void remover(Moeda v) {
        listaMoedas.remove(v);
    }

    public void listar() {
        for (Moeda v : listaMoedas) {
            v.info();
        }
    }

    public double converter() {
    		double totalConvertido = 0;
    		for (Moeda v : listaMoedas) {
    			totalConvertido += v.converter();
    	}
    		return totalConvertido;
    }
}