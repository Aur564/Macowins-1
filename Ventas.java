package tpMacowins.tpMacowins;

import java.util.Date;

public class Ventas {
	public Prenda unaPrenda;
	public int unaCantidad;
	public Date unaFecha;
	
	public Ventas(Prenda prenda, int cantidad, Date fecha){
		this.unaPrenda = prenda;
		this.unaCantidad = cantidad;
		this.unaFecha = fecha;
	}

	public boolean estaEnLaMismaFecha(Ventas unaVenta) {
		return this.getUnaFecha().compareTo(unaVenta.unaFecha) == 0;
		}
	public double precioTotalDeVenta(){
		return this.unaPrenda.getPrecioFinal()*this.unaCantidad;
	}

	public Date getUnaFecha() {
		return unaFecha;
	}
	
	
	

}
