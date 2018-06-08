package com.tecsup.gestion.model;

public class CT {
	
	int ct_id;
	String nombre;
	String descripcion;
	String img_malla;
	String aspectos;
	String tipo;
	String sede;
	String img_tecnica;
	
	public CT() {
		super();
	}

	public CT(String nombre, String descripcion, String img_malla, String aspectos, String tipo, String sede,
			String img_tecnica) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.img_malla = img_malla;
		this.aspectos = aspectos;
		this.tipo = tipo;
		this.sede = sede;
		this.img_tecnica = img_tecnica;
	}

	public int getCt_id() {
		return ct_id;
	}

	public void setCt_id(int ct_id) {
		this.ct_id = ct_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImg_malla() {
		return img_malla;
	}

	public void setImg_malla(String img_malla) {
		this.img_malla = img_malla;
	}

	public String getAspectos() {
		return aspectos;
	}

	public void setAspectos(String aspectos) {
		this.aspectos = aspectos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getImg_tecnica() {
		return img_tecnica;
	}

	public void setImg_tecnica(String img_tecnica) {
		this.img_tecnica = img_tecnica;
	}

	@Override
	public String toString() {
		return "CT [ct_id=" + ct_id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", img_malla=" + img_malla
				+ ", aspectos=" + aspectos + ", tipo=" + tipo + ", sede=" + sede + ", img_tecnica=" + img_tecnica + "]";
	}
	
	
}
