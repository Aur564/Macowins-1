package tpMacowins.tpMacowins;

public class Prenda {
	public boolean esNacional;
	public int precioBase;
	public double precioFinal;
	
	public Prenda(boolean esNacional, int precio) {
		this.esNacional = esNacional;
		this.precioBase = precio;
		}
	public double precioFinal(int precioBase, boolean esNacional){
		this.precioFinal = precioBase + Negocio.ValorFijo;
		if(!esNacional){
			this.precioFinal = this.precioFinal * 1.3;
		}
		return this.precioFinal;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public double getPrecioFinal() {
		return precioFinal;
	}
	
}
