package ar.edu.grupoesfera.cursospring.test;

import static org.junit.Assert.*;
import javax.inject.Inject;

import org.junit.Test;

import ar.edu.grupoesfera.cursospring.modelo.ListadoProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.servicios.ProductoService;

public class Tests {


	@Inject
	private ProductoService productoservice;
	
	@Test
	public void agregarProductoAListadoProducto() throws Exception{
		
		Producto producto1 = new Producto("Cemento",80.00,100);
		
		productoservice.agregarOModificarProducto(producto1);
		
		assertTrue(productoservice.getLista().contains(producto1));
		
	}
}
