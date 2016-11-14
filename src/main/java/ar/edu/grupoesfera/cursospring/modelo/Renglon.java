package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Renglon", catalog ="Cuenta_Corriente_BD")
public class Renglon {
	public Integer nroRenglon;
	public Integer cantidadProd;
	public Producto producto;
	public String descripAdicicional;
	public Remito nro;
	
	public Renglon () {
		
	}
	
	public Renglon (Integer nroRenglon, Integer cantidadProd, Producto producto, String descripAdicional, Remito nro) {
		this.nroRenglon = nroRenglon;
		this.cantidadProd = cantidadProd;
		this.producto = producto;
		this.descripAdicicional = descripAdicional;
		this.nro = nro;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_Renglon_Remito", unique = true, nullable = false)
	public Integer getNroRenglon() {
		return nroRenglon;
	}
	
	public void setNroRenglon(Integer nroRenglon) {
		this.nroRenglon = nroRenglon;
	}
	
	@Column(name = "Cantidad",nullable = false)
	public Integer getCantidadProd() {
		return cantidadProd;
	}
	
	public void setCantidadProd(Integer cantidadProd) {
		this.cantidadProd = cantidadProd;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Producto_ID", nullable = false)
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@Column(name = "Descripcion_Adicional_RR", nullable = false, length = 100)
	public String getDescripAdicicional() {
		return descripAdicicional;
	}
	
	public void setDescripAdicicional(String descripAdicicional) {
		this.descripAdicicional = descripAdicicional;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Numero_Remito", nullable = false)
	public Remito getNro() {
		return nro;
	}
	
	public void setNro(Remito nro) {
		this.nro = nro;
	}
}
