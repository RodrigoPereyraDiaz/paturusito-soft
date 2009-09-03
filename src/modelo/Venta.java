package modelo;
import java.util.*;
import java.math.*;
public class Venta {
	public Articulo[] getArticulos() {
		return articulos;
	}

	public void setArticulos(Articulo[] articulos) {
		this.articulos = articulos;
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

	public int getNumeroDeVenta() {
		return numeroDeVenta;
	}

	public void setNumeroDeVenta(int numeroDeVenta) {
		this.numeroDeVenta = numeroDeVenta;
	}

	public String getCondicionDeVenta() {
		return condicionDeVenta;
	}

	public void setCondicionDeVenta(String condicionDeVenta) {
		this.condicionDeVenta = condicionDeVenta;
	}

	public int getDescuentoAsociado() {
		return descuentoAsociado;
	}

	public void setDescuentoAsociado(int descuentoAsociado) {
		this.descuentoAsociado = descuentoAsociado;
	}

	public Date getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	Articulo[] articulos=new Articulo[100];
	BigDecimal total;
	Date fecha;
	int numeroDeVenta;
	String condicionDeVenta;
	int descuentoAsociado;
	Date vencimiento;
	String responsable;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
