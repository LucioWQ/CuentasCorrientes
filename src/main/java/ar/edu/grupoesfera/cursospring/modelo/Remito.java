package ar.edu.grupoesfera.cursospring.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "Remito", catalog ="Cuenta_Corriente_BD")
public class Remito {
	
	public Documento documento;
	public ArrayList<Renglon> listadoRenglonesRemito;
	
	public Remito () {
		
	}
	
	
	
	public Remito (Documento documento, ArrayList<Renglon> listadoRenglonesRemito) {
		this.documento = documento;
		this.listadoRenglonesRemito = listadoRenglonesRemito;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public ArrayList<Renglon> getListadoRenglonesRemito() {
		return listadoRenglonesRemito;
	}

	public void setListadoRenglonesRemito(ArrayList<Renglon> listadoRenglonesRemito) {
		this.listadoRenglonesRemito = listadoRenglonesRemito;
	}
	
	public void agregarRenglones(Renglon renglon) {
		List<Renglon> listadoRenglonesRemito = new ArrayList<Renglon> ();
		listadoRenglonesRemito.add(renglon);
	}
	
}
