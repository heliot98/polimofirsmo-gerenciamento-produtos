package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Produto> list = new ArrayList<>();
		
		System.out.print("Informe o numero de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Produto #" + i);
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
            System.out.print("Preco: ");
            double preco = sc.nextDouble();
            if (ch == 'u') {
            	System.out.print("Data de fabricacao(DD/MM/YYYY):  ");
            	String data = sc.next();
            	
            	Produto prod = new ProdutoUsado(nome, preco, LocalDate.parse(data,fmt));
            	list.add(prod);
            	
            }else if(ch == 'i') {
            	System.out.print("Taxa alfandegária: ");
            	double taxaAlfandega = sc.nextDouble();
                Produto prod = new ProdutoImportado(nome, preco, taxaAlfandega);
                list.add(prod);
                
            }else {
            	Produto prod = new Produto(nome, preco);
            	list.add(prod);
            }
		}

		System.out.println();
		System.out.println("Etiquetas de preco finais: ");
		for (Produto prod : list) {
			System.out.println(prod.precoEtiqueta());
		
		}
		
		
		
		sc.close();
	}

}
