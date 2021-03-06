package entidadesEnum;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa F?sica"), PESSOA_JURIDICA(2, "Pessoa Jur?dica"),
	PESSOA_ESTRANGEIRA(3, "Pessoa Estrangeira");

	private int id;
	private String descricao;

	// convertendo c?digo int para enum
	public static TipoCliente converterEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		for (TipoCliente tipoCliente : TipoCliente.values()) {
			if (codigo.equals(tipoCliente.getId())) {
				return tipoCliente;
			}
		}
		throw new IllegalArgumentException("Tipo de Pessoa N?o Registrada");
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	private TipoCliente(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

}
