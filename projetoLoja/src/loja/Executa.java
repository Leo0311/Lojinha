package loja;

import entidades.Produto;

public class Executa {

	public static void main(String[] args) {

		Produto produto = new Produto(23, 1, "tv");

		System.out.println(produto.adcionarProduto(10));
	}

}
