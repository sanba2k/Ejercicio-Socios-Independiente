package ar.com.unpaz.model;

public class SocioSimple extends Socio{
	
	public SocioSimple(String tipoSocio, int numeroSocio, String socio, int antiguedad, double cuotaMensual){
		super(tipoSocio, numeroSocio, socio, antiguedad, cuotaMensual);
		
	}
	
	@Override
	public double calcularCuotaFinal() {
		double total = getCuotaMensual();
		
		return total;
	}

		
}
