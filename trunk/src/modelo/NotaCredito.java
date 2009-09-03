package modelo;
import java.math.*;
import java.util.*;
public class NotaCredito {
	public Articulo[] getArticulos() {
		return articulos;
	}
	public void setArticulos(Articulo[] articulos) {
		this.articulos = articulos;
	}
	public int getNumeroNota() {
		return numeroNota;
	}
	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	Articulo[] articulos=new Articulo[100];
	int numeroNota;
	BigDecimal total;
	Date fecha;
	String motivo;
	String responsable;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
