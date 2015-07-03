package com.progium.catering.ejb;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the categoria database table.
 * 
 */
@Entity
@Table(name="categoria")
@NamedQuery(name="categoria.findAll", query="SELECT c FROM categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCategoria;
	
	private String nombre;
	
/*	//bi-directional many-to-one association to producto
	@OneToMany(mappedBy="categoria")
	private List<Producto> productos;*/
	
	public Categoria(){
		
	}
	
	public int getIdCategoria(){
		return this.idCategoria;
	}
	
	public void setIdCategoria(int idCategoria){
		this.idCategoria = idCategoria;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
/*	public List<Producto> getProductos() {
		return this.producto;
	}

	public void setUsuarios(List<Producto> productos) {
		this.productos = productos;
	}

	public Usuario addUsuario(Producto Producto) {
		getProductos().add(Producto);
		Producto.setTipoUsuario(this);

		return producto;
	}

	public Producto removeUsuario(Producto producto) {
		getProductos().remove(producto);
		producto.setIdCategoria(null);

		return producto;
	}*/
}

