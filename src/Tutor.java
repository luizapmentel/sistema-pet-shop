public class Tutor {
	private String nome, cpf, email, telefone, dataCadastro;
	
	public Tutor(String nome, String cpf, String email, String telefone, String dataCadastro) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
	}

	// Setter de CPF omitido pois é identificador único, não podendo ser alterado.
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

     public String getTelefone() {
        return telefone;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

     public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override 
	public String toString() {
	    return "Tutor: " + nome + 
	           " | CPF: " + cpf + 
	           " | E-mail: " + email + 
	           " | Telefone: " + telefone + 
	           " | Data Cadastro: " + dataCadastro;
	}
}