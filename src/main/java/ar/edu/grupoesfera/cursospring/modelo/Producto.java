package ar.edu.grupoesfera.cursospring.modelo;

public class Producto implements Comparable<Producto> {

 private String descrip;
 private Double precio;
 private Integer stock;
 private Boolean estado = true;


public Producto (){

}

public Producto (String descrip, Double precio){
	 
	 this.descrip = descrip;
	 this.precio = precio;
	 this.stock = 0;
	 
 }
 
public Producto (String descrip, Double precio, Integer stock){
	
	this.descrip = descrip;
	this.precio = precio;
	this.stock = stock;
	
}

public Producto (String descrip, Integer precio, Integer stock){
	
	
	this.descrip = descrip;
	this.precio = (Double)(double)precio;
	this.stock = stock;
	
}

public String getDescrip() {
	return descrip;
}

public void setDescrip(String descrip) {
	this.descrip = descrip;
}

public Double getPrecio() {
	return precio;
}

public void setPrecio(Double precio) {
	this.precio = precio;
}

public Integer getStock() {
	return stock;
}

public void setStock(Integer stock) {
	this.stock = stock;
}

public Boolean getEstado() {
	return estado;
}

public void setEstado(Boolean estado) {
	this.estado = estado;
}


public void cambiaStock(Integer cant){
	
	this.stock += cant;
}

public String toString(){
	return (this.getDescrip()+" $"+ this.getPrecio());
}

public boolean equals(Object obj){
	
	if(obj instanceof Producto){
		
		Producto diferente = (Producto)obj;
		
		if(this.getDescrip().equalsIgnoreCase(diferente.getDescrip())){
			
			return true;
		
		}else {
			
			return false;
			
		}
		
	} else {
		
		return false;
		
	}
	
}

/*Como sobreescribí el método equals estoy obligado a sobreescribir el 
método hashCode()*/


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((descrip == null) ? 0 : descrip.hashCode());
	return result;
}


@Override
public int compareTo(Producto obj) {
	
	return this.getDescrip().compareTo(obj.getDescrip());
}

}