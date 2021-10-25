package com.hospital.model;

public class Prontuario {
	
	private Paciente paciente;
	private String sintomas;
	private String diagnostico;
	private String prescricao;
	
	public Prontuario(Paciente paciente, String sintomas, String diagnostico, String prescricao){
		this.paciente = paciente;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.prescricao = prescricao;
		
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public String getPrescricao() {
		return prescricao;
	}
	
	public String getSintomas() {
		return sintomas;
	}
	
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}
	
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	

}
