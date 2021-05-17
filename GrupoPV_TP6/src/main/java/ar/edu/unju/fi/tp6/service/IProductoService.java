package ar.edu.unju.fi.tp6.service;

import java.util.List;

import ar.edu.unju.fi.tp6.model.Producto;



public interface IProductoService {
	
	public Producto getProducto();
	
	public void addProducto(Producto producto);
	
	public Producto getUltimoProducto();
	
	public List<Producto> getAllProductos();
	
	public Producto searchProducto(int codigo);
	
}
