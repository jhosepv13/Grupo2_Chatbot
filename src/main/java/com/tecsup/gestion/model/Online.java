package com.tecsup.gestion.model;

public class Online {
	
	int onl_id;
	String nombre;
	String descripcion;
	String fecha_ini;
	String fecha_fin;
	String precio;
	String img_curso;
	String objetivos;
	
	public Online() {
		super();
	}

	public Online(String nombre, String descripcion, String fecha_ini, String fecha_fin, String precio,
			String img_curso, String objetivos) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
		this.precio = precio;
		this.img_curso = img_curso;
		objetivos = objetivos;
	}

	public int getOnl_id() {
		return onl_id;
	}

	public void setOnl_id(int onl_id) {
		this.onl_id = onl_id;
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

	public String getFecha_ini() {
		return fecha_ini;
	}

	public void setFecha_ini(String fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getImg_curso() {
		return img_curso;
	}

	public void setImg_curso(String img_curso) {
		this.img_curso = img_curso;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		objetivos = objetivos;
	}

	@Override
	public String toString() {
		return "Online [onl_id=" + onl_id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_ini="
				+ fecha_ini + ", fecha_fin=" + fecha_fin + ", precio=" + precio + ", img_curso=" + img_curso
				+ ", objetivos=" + objetivos + "]";
	}
	
	
	
	
}
