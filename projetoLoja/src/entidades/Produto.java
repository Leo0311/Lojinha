package entidades;

public class Produto {
	private Integer preco;
	private Integer codigo;
	private String descricao;

	public Produto(Integer preco, Integer codigo, String descricao) {
		this.preco = preco;
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public double adcionarProduto(double produto) {
		double estoque = produto=+ produto;
		return estoque;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [preco=" + preco + ", codigo=" + codigo + ", descricao=" + descricao + "]";
	}
}
