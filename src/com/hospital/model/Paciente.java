package com.hospital.model;

public class Paciente {
	//Dados modificaveis pela Secretaria
	private String nome;
	private String dataNascimento;
	private String endereco;
	private String email;
	private String celular;
	private String tipoConvenio;

	
	//Dados modificaveis pelo Medico
	private String bebe;
	private String fuma;
	private String colesterol;
	private String diabete;
	private String doencaCardiaca;
	private String cirurgias;
	private String alergias;

	
	
	public Paciente(String nome, String dataNascimento, String endereco, String email, String celular, String tipoConvenio, 	String bebe, String fuma, String colesterol, String diabete, String doencaCardiaca, String cirurgias, String alergias
) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.email = email;
		this.celular = celular;
		this.tipoConvenio = tipoConvenio;
		this.bebe = bebe;
		this.fuma = fuma;
		this.colesterol = colesterol;
		this.diabete = diabete;
		this.cirurgias = cirurgias;
		this.alergias = alergias;
		
	
		
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getAlergias() {
		return alergias;
	}
	
	public String getCirurgias() {
		return cirurgias;
	}
	
	public String getDiabete() {
		return diabete;
	}
	
	public String getFuma() {
		return fuma;
	}
	
	public String getBebe() {
		return bebe;
	}
	
	public String getColesterol() {
		return colesterol;
	}
	
	public String getDoencaCardiaca() {
		return doencaCardiaca;
	}
	
	public String getTipoConvenio() {
		return tipoConvenio;
	}
	
	public String getCelular() {
		return celular;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	
	

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setTipoConvenio(String tipoConvenio) {
		this.tipoConvenio = tipoConvenio;
	}
	
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	
	public void setBebe(String bebe) {
		this.bebe = bebe;
	}
	
	public void setCirurgias(String cirurgias) {
		this.cirurgias = cirurgias;
	}
	
	public void setColesterol(String colesterol) {
		this.colesterol = colesterol;
	}
	
	public void setDiabete(String diabete) {
		this.diabete = diabete;
	}
	
	public void setDoencaCardiaca(String doencaCardiaca) {
		this.doencaCardiaca = doencaCardiaca;
	}
	
	public void setFuma(String fuma) {
		this.fuma = fuma;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
