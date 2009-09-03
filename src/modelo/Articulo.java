package modelo;

public class Articulo {
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


	public String getRubro() {
		return rubro;
	}


	public void setRubro(String rubro) {
		this.rubro = rubro;
	}


	public Proveedor getProveedores() {
		return proveedores;
	}


	public void setProveedores(Proveedor proveedores) {
		this.proveedores = proveedores;
	}


	public Temporada getTemporadas() {
		return temporadas;
	}


	public void setTemporadas(Temporada temporadas) {
		this.temporadas = temporadas;
	}


	String nombre;
	String descripcion;
	String rubro;
	Proveedor proveedores=new Proveedor[10];
	Temporada temporadas=new Temporada[4];
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
