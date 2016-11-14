package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Cliente", catalog = "Cuenta_Corriente_BD")
public class Persona implements Comparable<Persona> {
 private Integer persona_ID;
 private String nombre;
 private String apellido;
 private String email;
 private String password;
 private Boolean estado = true;


public Persona (){

}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "persona_ID", unique = true, nullable = false)
public Integer getId() {
	return persona_ID;
}

public void setId(Integer id) {
	this.persona_ID = id;
}

public Persona (String nombre, String apellido, String email, String password) {
	 
	 this.nombre = nombre;
	 this.apellido = apellido;
	 this.email = email;
	 this.password = password;
	 
 }

@Column(name = "nombre", nullable = false, length = 50)
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Column(name = "apellido", nullable = false, length = 50)
public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

@Column(name = "email", unique = true, nullable = false, length = 50)
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
@Column(name = "password", nullable = false)
public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Column(name = "estado", nullable = false)
public Boolean getEstado() {
	return estado;
}

public void setEstado(Boolean estado) {
	this.estado = estado;
}

public String toString(){
	return (this.getNombre()+ " | " + this.getApellido() + " | " + this.getEmail() +  " | " + this.getPassword());
}

public boolean equals(Object obj){
	
	if(obj instanceof Persona){
		
		Persona diferente = (Persona) obj;
		
		if(this.getEmail().equalsIgnoreCase(diferente.getEmail())){
			
			return true;
		
		} else {
			
			return false;
			
		}
		
	} else {
		
		return false;
		
	}
	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
	return result;
}

@Override
public int compareTo(Persona obj) {
	return this.getEmail().compareTo(obj.getEmail());
}

}