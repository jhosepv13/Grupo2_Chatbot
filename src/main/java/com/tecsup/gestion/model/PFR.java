package com.tecsup.gestion.model;

public class PFR {
	
	int pfr_id;
	String name;
	String descripcion;
	int duracion;
	String sede;
	String objetivo;
	String img_malla;
	String img_carrera;
	
	public PFR() {
		super();
	}

	public PFR(String name, String descripcion, int duracion, String sede, String objetivo, String img_malla,
			String img_carrera) {
		super();
		this.name = name;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.sede = sede;
		this.objetivo = objetivo;
		this.img_malla = img_malla;
		this.img_carrera = img_carrera;
	}

	public int getPfr_id() {
		return pfr_id;
	}

	public void setPfr_id(int pfr_id) {
		this.pfr_id = pfr_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getImg_malla() {
		return img_malla;
	}

	public void setImg_malla(String img_malla) {
		this.img_malla = img_malla;
	}

	public String getImg_carrera() {
		return img_carrera;
	}

	public void setImg_carrera(String img_carrera) {
		this.img_carrera = img_carrera;
	}

	@Override
	public String toString() {
		return "PFR [pfr_id=" + pfr_id + ", name=" + name + ", descripcion=" + descripcion + ", duracion=" + duracion
				+ ", sede=" + sede + ", objetivo=" + objetivo + ", img_malla=" + img_malla + ", img_carrera="
				+ img_carrera + "]";
	}
	
	
	
}
