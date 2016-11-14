package ar.edu.grupoesfera.cursospring.modelo;

public class RenglonFactura {
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
	
	public Renglon getRenglonRemito() {
		return renglonRemito;
	}
	
	public void setRenglonRemito(Renglon renglonRemito) {
		this.renglonRemito = renglonRemito;
	}
	
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public Double getSubTotal() {
		return subTotal;
	}
	
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	
	
}
