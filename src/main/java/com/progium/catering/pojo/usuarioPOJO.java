package com.progium.catering.pojo;

public class usuarioPOJO {
	private int IdUsuario;
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private String Telefono1;
	private String Telefono2;
	private String Correo;
	private String Fotografia;
	private String Contrasenna;
	private Integer TipoUsuarioId;
	
	public usuarioPOJO(){
		super();
	}

	public int getIDUsuario() {
		return IdUsuario;
	}
	public void setIDUsuario(int idUsuario) {
		this.IdUsuario = idUsuario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String apellido1) {
		this.Apellido1 = apellido1;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String apellido2) {
		this.Apellido2 = apellido2;
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

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		this.Correo = correo;
	}

	public String getFotografia() {
		return Fotografia;
	}

	public void setFotografia(String fotografia) {
		this.Fotografia = fotografia;
	}
	
	public String getContrasenna() {
		return Contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.Contrasenna = contrasenna;
	}

	public Integer getTipoUsuarioId() {
		return TipoUsuarioId;
	}

	public void setTipoUsuarioId(Integer tipoUsuarioId) {
		this.TipoUsuarioId = tipoUsuarioId;
	}
}
