package ar.edu.grupoesfera.cursospring.modelo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "Factura", catalog ="Cuenta_Corriente_BD")
public class Factura {
	public Documento documento;
	public ArrayList<RenglonFactura> listadoRenglonesFactura;
	public Boolean estado;
	
	public Factura () {
		
	}
	
	public Factura (Documento documento, ArrayList<RenglonFactura> listadoRenglonesFactura, Boolean estado) {
		this.documento = documento;
		this.listadoRenglonesFactura = listadoRenglonesFactura;
		this.estado = estado;
	}

	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public ArrayList<RenglonFactura> getListadoRenglonesFactura() {
		return listadoRenglonesFactura;
	}
	public void setListadoRenglonesFactura(ArrayList<RenglonFactura> listadoRenglonesFactura) {
		this.listadoRenglonesFactura = listadoRenglonesFactura;
	}
	@Column(name = "Estado", nullable = false)
	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	
}