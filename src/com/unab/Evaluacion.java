package com.unab;

public class Evaluacion {
	
	private String pregunta;
	private String respuesta;
	private String correcta;
	
	Evaluacion(String pregunta, String correcta){
		this.pregunta = pregunta;
		this.correcta = correcta;
	}
	
	public String getPregunta() {
		return pregunta;
	}
	
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	public String getRespuesta() {
		return this.respuesta;
	}
	
	public boolean validar() {
		
	
		return  this.correcta.equals(this.respuesta);
	}


	
	
	
	
	

}
