package com.hospital.model;

import java.time.LocalDate;

public class Consulta {
	
	public LocalDate data;
	public String horario;
	public Paciente paciente;
	public String medico;

	
	public Consulta(Paciente paciente, String medico, LocalDate data, String horario) {
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
		this.horario = horario;
		
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public String getMedico() {
		return medico;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public void setMedico(String medico) {
		this.medico = medico;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
	
	
	
}
