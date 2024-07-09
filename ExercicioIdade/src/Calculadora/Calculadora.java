package Calculadora;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.time.DateTimeException;

public class Calculadora {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.now();
        
        int dia;
        int mes;
        int ano;
        int anoatual = localDate.getYear();
        
        LocalDate data = null;
        boolean dataValida = false;
        
        while (!dataValida) {
            try {
                System.out.println("Digite sua data de nascimento:");
                System.out.println("Dia(1-31):");
                dia = teclado.nextInt();
                while (dia < 1 || dia > 31) {
                    System.out.println("Tente novamente.");
                    System.out.println("Dia(1-31):");
                    dia = teclado.nextInt();
                }
                System.out.println("Mês(1-12):");
                mes = teclado.nextInt();
                while (mes < 1 || mes > 12) {
                    System.out.println("Tente novamente.");
                    System.out.println("Mês(1-12):");
                    mes = teclado.nextInt();
                }
                System.out.printf("Ano(1900-%s):", anoatual);
                ano = teclado.nextInt();
                while (ano < 1900 || ano > anoatual) {
                    System.out.println("Tente novamente.");
                    System.out.printf("Ano(1900-%s):", anoatual);
                    ano = teclado.nextInt();
                }
                
                data = LocalDate.of(ano, mes, dia);
                dataValida = true;
                
            } catch (DateTimeException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        System.out.println(data.format(formato));
        
        long contagem = ChronoUnit.DAYS.between(data, localDate);
        System.out.printf("Se passaram %d dias desde o seu nascimento!", contagem);
    }
}

