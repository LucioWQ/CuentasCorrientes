package ar.edu.grupoesfera.cursospring.modelo;

import java.util.Calendar;

public class Documento {
	public Integer nro;
	public Calendar fecha;
	public Persona persona;
	
	public Documento () {
		
	}
	
	public Documento (Integer nro, Calendar fecha, Persona persona) {
		this.nro = nro;
		this.fecha = fecha;
		this.persona = persona;
	}
	
	public Integer getNro() {
		return nro;
	}
	public void setNro(Integer nro) {
		this.nro = nro;
	}
	
	public Calendar getFecha() {
	Calendar fecha = Calendar.getInstance();
		return fecha;
	}
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
		
	//Devuelve la fecha actual del servidor (lo hice para probar, creo que con el metodo Calendar.getInstance() alcanza)
	public static void main(String[] args) {
       
       	Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        System.out.println("Fecha: "+ dia + "/" + (mes) + "/" + año);
        		
    }
}
