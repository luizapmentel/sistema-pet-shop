public class Pet {
    private String nome, especie, raca, porte, sexo, numeroCarteiraVacinacao, observacoes;
	private int idade;
	private double peso;
	private Tutor tutor;

	/*
	 * Definições de atributos int em Strings por motivos de exceções. Ex.: numeroCarteiraVacinacao pode conter caracteres "VAC-12345". Comportamento observável em todo projeto.
	 */
	
	public Pet(String nome, String especie, String raca, String porte, String sexo,
			String numeroCarteiraVacinacao, String observacoes, int idade, double peso, Tutor tutor) {
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.porte = porte;
		this.sexo = sexo;
		this.numeroCarteiraVacinacao = numeroCarteiraVacinacao;
		this.observacoes = observacoes;
		this.idade = idade;
		this.peso = peso;
		this.tutor = tutor;
	}
	
	// Setter de numeroCarteiraVacinacao omitido pois é identificador único, não podendo ser alterado.
	public String getNome() {
		return nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public String getPorte() {
		return porte;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public String getNumeroCarteiraVacinacao() {
		return numeroCarteiraVacinacao;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public Tutor getTutor() {
		return tutor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

    @Override
	public String toString() {
	    return "Pet: " + nome + 
	           " | Espécie: " + especie + 
	           " | Raça: " + raca + 
	           " | Porte: " + porte +
	           " | Sexo: " + sexo + 
	           " | Idade: " + idade + " anos" + 
	           " | Peso: " + peso + "kg" + 
	           " | Tutor: " + (tutor != null ? tutor.getNome() : "Não informado") +
	           (observacoes.isEmpty() ? "" : " | Obs.: " + observacoes);
    }
}