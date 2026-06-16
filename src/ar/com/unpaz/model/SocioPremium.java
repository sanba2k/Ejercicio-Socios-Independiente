package ar.com.unpaz.model;

public class SocioPremium extends Socio{
	

	private String ubicacion;
	
	public SocioPremium(String tipoSocio, int numeroSocio, String socio, int antiguedad, double cuotaMensual, String ubicacion){
		super(tipoSocio, numeroSocio, socio, antiguedad, cuotaMensual);
		this.ubicacion = ubicacion;
		
	}

	
	@Override
	public double calcularCuotaFinal() {
		double total = 0;
		
		if(getUbicacion().equals("PLATEA")) {
			total = getCuotaMensual() + 5000 ;
		}
		if(getUbicacion().equals("PALCO")) {
			total = getCuotaMensual() + 10000;
		} else {
			total = getCuotaMensual() + 3000;
		}
		
		
		return total;
		
	}
	
	
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	
}
