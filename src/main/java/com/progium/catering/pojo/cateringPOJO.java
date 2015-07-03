package com.progium.catering.pojo;

public class cateringPOJO {
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
	
	public cateringPOJO(){
		super();
	}

	public int getIdCatering() {
		return IdCatering;
	}

	public void setIdCatering(int idCatering) {
		this.IdCatering = idCatering;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getCedulaJuridica() {
		return CedulaJuridica;
	}

	public void setCedulaJuridica(String cedulaJuridica) {
		this.CedulaJuridica = cedulaJuridica;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		this.Direccion = direccion;
	}

	public String getTelefono1() {
		return Telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.Telefono1 = telefono1;
	}
	
	public String getTelefono2() {
		return Telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.Telefono2 = telefono2;
	}

	public String getHorario() {
		return Horario;
	}

	public void setHorario(String horario) {
		this.Horario = horario;
	}

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		this.Estado = estado;
	}

	public String getFotografia() {
		return Fotografia;
	}

	public void setFotografia(String fotografia) {
		this.Fotografia = fotografia;
	}

	public Integer getProvinciaId() {
		return ProvinciaId;
	}

	public void setProvinciaId(Integer provinciaId) {
		this.ProvinciaId = provinciaId;
	}

	public Integer getCantonId() {
		return CantonId;
	}

	public void setCantonId(Integer cantonId) {
		this.CantonId = cantonId;
	}

	public Integer getAdministradorId() {
		return AdministradorId;
	}

	public void setAdministradorId(Integer administradorId) {
		this.AdministradorId = administradorId;
	}

	public Integer getDistritoId() {
		return DistritoId;
	}

	public void setDistritoId(Integer distritoId) {
		this.DistritoId = distritoId;
	}


}
