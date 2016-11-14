package ar.edu.grupoesfera.cursospring.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "CuentaCorriente", catalog ="Cuenta_Corriente_BD")
public class CuentaCorriente {
	private Integer cliente_ID;
	private Integer limite;
	private Date fecha;
	public Persona persona;
	
	
	@GenericGenerator(name = "generator", strategy = "foreign",
			parameters = @Parameter(name = "property", value = "Cliente"))
			@Id
			@GeneratedValue(generator = "generator")
			@Column(name = "STOCK_ID", unique = true, nullable = false)
	public Integer getCliente_id() {
		return cliente_ID;
	}
	public void setCliente_id(Integer cliente_id) {
		cliente_ID = cliente_id;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	@Column(name = "Limite_Plata",nullable = false)
	public Integer getLimite() {
		return limite;
	}
	public void setLimite(Integer limite) {
		this.limite = limite;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Limite_Factura",nullable = false)
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
