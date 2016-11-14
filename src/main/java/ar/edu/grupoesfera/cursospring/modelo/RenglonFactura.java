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
@Table(name = "Renglon_Factura", catalog ="Cuenta_Corriente_BD")
public class RenglonFactura {
	public Integer renglon_Factura_ID;
	public Renglon renglonRemito;
	public Double precioUnitario;
	public Double subTotal;
	
	public RenglonFactura () {
		
	}
	
	public RenglonFactura (Renglon renglonRemito, Double precioUnitario, Double subTotal) {
		this.renglonRemito = renglonRemito;
		this.precioUnitario = precioUnitario;
		this.subTotal = subTotal;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Renglon_Factura_ID", unique = true, nullable = false)
	public Integer getRenglon_Factura_ID() {
		return renglon_Factura_ID;
	}

	public void setRenglon_Factura_ID(Integer renglon_Factura_ID) {
		this.renglon_Factura_ID = renglon_Factura_ID;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_Renglon_Remito", nullable = false)
	public Renglon getRenglonRemito() {
		return renglonRemito;
	}
	
	public void setRenglonRemito(Renglon renglonRemito) {
		this.renglonRemito = renglonRemito;
	}
	@Column(name = "Precio",nullable = false)
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	@Column(name = "Subtotal",nullable = false)
	public Double getSubTotal() {
		return subTotal;
	}
	
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	
	
}
