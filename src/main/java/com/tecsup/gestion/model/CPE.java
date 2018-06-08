package com.tecsup.gestion.model;

public class CPE {
	
	int cpd_id;
	String nombre;
	String fecha_ini;
	String sede;
	String descripcion;
	String objetivo;
	String temario;
	int duracion;
	String area;
	String tipo;
	String precio;
	
	public CPE() {
		super();
	}

	public CPE(String nombre, String fecha_ini, String sede, String descripcion, String objetivo, String temario,
			int duracion, String area, String tipo, String precio) {
		super();
		this.nombre = nombre;
		this.fecha_ini = fecha_ini;
		this.sede = sede;
		this.descripcion = descripcion;
		this.objetivo = objetivo;
		this.temario = temario;
		this.duracion = duracion;
		this.area = area;
		this.tipo = tipo;
		this.precio = precio;
	}

	public int getCpd_id() {
		return cpd_id;
	}

	public void setCpd_id(int cpd_id) {
		this.cpd_id = cpd_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_ini() {
		return fecha_ini;
	}

	public void setFecha_ini(String fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getTemario() {
		return temario;
	}

	public void setTemario(String temario) {
		this.temario = temario;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "CPE [cpd_id=" + cpd_id + ", nombre=" + nombre + ", fecha_ini=" + fecha_ini + ", sede=" + sede
				+ ", descripcion=" + descripcion + ", objetivo=" + objetivo + ", temario=" + temario + ", duracion="
				+ duracion + ", area=" + area + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	
	
	
	

}
