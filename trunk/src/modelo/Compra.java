package modelo;
import java.util.*;
import java.math.*;
public class Compra {
	public Articulo[] getArticulos() {
		return articulos;
	}
	public void setArticulos(Articulo[] articulos) {
		this.articulos = articulos;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public int getNumerofactura() {
		return numerofactura;
	}
	public void setNumerofactura(int numerofactura) {
		this.numerofactura = numerofactura;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public Date getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}
	Articulo[] articulos= new Articulo[100];
	Date fecha;
	BigDecimal total;
	int numerofactura;
	int descuento;
	Date vencimiento;
}
