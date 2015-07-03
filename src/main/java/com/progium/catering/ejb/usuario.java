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
public class Usuario implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int idUsuario;
		
		private String nombre;
		private String apellido1;
		private String apellido2;
		private String telefono1;
		private String telefono2;
		private String correo;
		private String fotografia;
		private String contrasenna;
		private Integer tipoUsuarioId;
		
		public int getiDUsuario() {
			return this.idUsuario;
		}

		public void setIDUsuario(int iDUsuario) {
			this.idUsuario = iDUsuario;
		}

		public String getNombre() {
			return this.nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido1() {
			return this.apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}

		public String getApellido2() {
			return this.apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public String getTelefono1() {
			return this.telefono1;
		}

		public void setTelefono1(String telefono1) {
			this.telefono1 = telefono1;
		}

		public String getTelefono2() {
			return this.telefono2;
		}

		public void setTelefono2(String telefono2) {
			this.telefono2 = telefono2;
		}

		public String getCorreo() {
			return this.correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getFotografia() {
			return this.fotografia;
		}

		public void setFotografia(String fotografia) {
			this.fotografia = fotografia;
		}
		
		public String getContrasenna() {
			return this.contrasenna;
		}

		public void setContrasenna(String contrasenna) {
			this.contrasenna = contrasenna;
		}

		public Integer getTipoUsuarioId() {
			return this.tipoUsuarioId;
		}

		public void setTipoUsuarioId(Integer tipoUsuarioId) {
			this.tipoUsuarioId = tipoUsuarioId;
		}
		
}
