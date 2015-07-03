package com.progium.catering.ejb;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="usuario.findAll", query="SELECT u FROM usuario u")
public class usuario implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
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
		
		public int getIDUsuario() {
			return this.IdUsuario;
		}

		public void setIDUsuario(int iDUsuario) {
			this.IdUsuario = iDUsuario;
		}

		public String getNombre() {
			return this.Nombre;
		}

		public void setNombre(String nombre) {
			this.Nombre = nombre;
		}

		public String getApellido1() {
			return this.Apellido1;
		}

		public void setApellido1(String apellido1) {
			this.Apellido1 = apellido1;
		}

		public String getApellido2() {
			return this.Apellido2;
		}

		public void setApellido2(String apellido2) {
			this.Apellido2 = apellido2;
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

		public String getCorreo() {
			return this.Correo;
		}

		public void setCorreo(String correo) {
			this.Correo = correo;
		}

		public String getFotografia() {
			return this.Fotografia;
		}

		public void setFotografia(String fotografia) {
			this.Fotografia = fotografia;
		}
		
		public String getContrasenna() {
			return this.Contrasenna;
		}

		public void setContrasenna(String contrasenna) {
			this.Contrasenna = contrasenna;
		}

		public Integer getTipoUsuarioId() {
			return this.TipoUsuarioId;
		}

		public void setTipoUsuarioId(Integer tipoUsuarioId) {
			this.TipoUsuarioId = tipoUsuarioId;
		}
		
}
