public class Endereco {
    private String cep, estado, cidade, bairro, rua, numero;

	public Endereco(String cep, String estado, String cidade, String bairro, String rua, String numero) {
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getRua() {
		return rua;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return rua + ", " + numero + " - " + bairro + ", " + cidade + "/" + estado + " | CEP: " + cep;
	}
}
