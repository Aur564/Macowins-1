package tpMacowins.tpMacowins;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {

	public static final int ValorFijo = 100;
	List<Ventas> ventas = new ArrayList<>();
	double sum;
	
	public Negocio(Ventas unaVenta){
		this.ventas.add(unaVenta);
	}
	public List<Double> filtrarVentasDeUnDia(Ventas venta){
		return this.ventas.stream()
		.filter(otraVenta -> otraVenta.estaEnLaMismaFecha(venta))
		.map(otraVenta -> otraVenta.precioTotalDeVenta())
		.collect(Collectors.toList());
	}
	
	public void sumaTotalDeVentas(Ventas s){
		sum = this.filtrarVentasDeUnDia(s).stream().mapToDouble(Double::doubleValue).sum();
		
	}
	public double getSum() {
		return sum;
	}
	
	public void agregarVenta(Ventas a){
		this.ventas.add(a);
	}
	
	
}
