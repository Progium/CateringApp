package com.progium.catering.ejb;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the catering database table.
 * 
 */
@Entity
@NamedQuery(name="catering.findAll", query="SELECT cs FROM catering cs")
public class catering implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int IdCatering;
	
	private String Nombre;
	private String CedulaJuridica;
	private String Direccion;
	private String Telefono1;
	private String Telefono2;
	private String Horario;
	private boolean Estado;
	private String Fotografia;
	private Integer ProvinciaId;
	private Integer CantonId;
	private Integer AdministradorId;
	private Integer DistritoId;
	
	public int getIdCatering() {
		return this.IdCatering;
	}

	public void setIdCatering(int idCatering) {
		this.IdCatering = idCatering;
	}

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getCedulaJuridica() {
		return this.CedulaJuridica;
	}

	public void setCedulaJuridica(String cedulaJuridica) {
		this.CedulaJuridica = cedulaJuridica;
	}

	public String getDireccion() {
		return this.Direccion;
	}

	public void setDireccion(String direccion) {
		this.Direccion = direccion;
	}

	public String getTelefono1() {
		return this.Telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.Telefono1 = telefono1;
	}
	
	public String getTelefono2() {
		return this.Telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.Telefono2 = telefono2;
	}

	public String getHorario() {
		return this.Horario;
	}

	public void setHorario(String horario) {
		this.Horario = horario;
	}

	public boolean isEstado() {
		return this.Estado;
	}

	public void setEstado(boolean estado) {
		this.Estado = estado;
	}

	public String getFotografia() {
		return this.Fotografia;
	}

	public void setFotografia(String fotografia) {
		this.Fotografia = fotografia;
	}

	public Integer getProvinciaId() {
		return this.ProvinciaId;
	}

	public void setProvinciaId(Integer provinciaId) {
		this.ProvinciaId = provinciaId;
	}

	public Integer getCantonId() {
		return this.CantonId;
	}

	public void setCantonId(Integer cantonId) {
		this.CantonId = cantonId;
	}

	public Integer getAdministradorId() {
		return this.AdministradorId;
	}

	public void setAdministradorId(Integer administradorId) {
		this.AdministradorId = administradorId;
	}

	public Integer getDistritoId() {
		return this.DistritoId;
	}

	public void setDistritoId(Integer distritoId) {
		this.DistritoId = distritoId;
	}
}
