package Cofrinho;

import java.util.Scanner;

public class Principal {

	static Cofrinho cofrinho = new Cofrinho();	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) { 
		
		int opcao;
// Menu de opções
		System.out.println("Menu do Cofrinho");
		System.out.println("1 - Adicionar Moedas");
		System.out.println("2 - Remover Moedas");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Total convertido em reais");
		System.out.println("5 - Sair");
		opcao=teclado.nextInt();
// Loop para selecionar opções do menu até que se encerre
		while(opcao!=5) {
			switch(opcao) {
			case 1:
				adicionar();
				break;
			case 2:
				remover();
				break;
			case 3:
				listar();
				break;
			case 4:
				double totalConvertido = cofrinho.converter();
		    	System.out.println("Total convertido em reais:" + totalConvertido);
				break;
			default:
				System.out.println("Opcao invalida!");

			}
			
			System.out.println("Menu do Cofrinho");
			System.out.println("1 - Adicionar Moedas");
			System.out.println("2 - Remover Moedas");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Total convertido em reais");
			System.out.println("5 - Sair");
			opcao=teclado.nextInt();
		}
		System.out.println("Sistema encerrado.");
		
	}
	
// Método adicionar (euro, dolar ou real)
    public static void adicionar() {
        int tipoMoeda = 0;
        while (tipoMoeda < 1 || tipoMoeda > 3) {
            System.out.println("1 - Euro");
            System.out.println("2 - Dolar");
            System.out.println("3 - Real");
            tipoMoeda = teclado.nextInt();
        }
        System.out.println("Qual o valor?");
        int quantia = teclado.nextInt();

        Moeda moeda =null;
        if (tipoMoeda == 1) {
            moeda = new Euro(quantia);
        } else if (tipoMoeda == 2) {
            moeda = new Dolar(quantia);
        } else if (tipoMoeda == 3) {
            moeda = new Real(quantia);
        }

        cofrinho.adicionar(moeda);
    }

 // Método remover (euro, dolar ou real)
    public static void remover() {
    	int tipoMoeda = 0;
        while (tipoMoeda < 1 || tipoMoeda > 3) {
            System.out.println("1 - Euro");
            System.out.println("2 - Dolar");
            System.out.println("3 - Real");
            tipoMoeda = teclado.nextInt();
        }
        System.out.println("Qual o valor?");
        int quantia = teclado.nextInt();

        Moeda moeda =null;
        if (tipoMoeda == 1) {
            moeda = new Euro(quantia);
        } else if (tipoMoeda == 2) {
            moeda = new Dolar(quantia);
        } else if (tipoMoeda == 3) {
            moeda = new Real(quantia);
        }

        cofrinho.remover(moeda);
    }
        
 // Método listar valores e tipo de moeda (euro, dolar ou real)
    public static void listar() {
        cofrinho.listar();
    }

 // Método converter todos os valores para real e somar
    public static void converter() {
    	cofrinho.converter();
    }
}