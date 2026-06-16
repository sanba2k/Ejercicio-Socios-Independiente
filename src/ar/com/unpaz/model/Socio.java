package ar.com.unpaz.model;

public abstract class Socio {
	
	private String tipoSocio;
	private int numeroSocio;
	private String socio;
	private int antiguedad;
	private double cuotaMensual;
	
	
	public Socio(String tipoSocio, int numeroSocio, String socio, int antiguedad, double cuotaMensual) {
		this.tipoSocio = tipoSocio;
		this.numeroSocio = numeroSocio;
		this.socio = socio;
		this.antiguedad = antiguedad;
		this.cuotaMensual = cuotaMensual;
				
	}
		
	public Socio() {
			
		}

	public abstract double calcularCuotaFinal();
	
	public String getTipoSocio() {
		return tipoSocio;
	}

	public void setTipoSocio(String tipoSocio) {
		this.tipoSocio = tipoSocio;
	}

	public int getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	public String getSocio() {
		return socio;
	}

	public void setSocio(String socio) {
		this.socio = socio;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	@Override
	public String toString() {
		return "Socio [tipoSocio=" + tipoSocio + ", numeroSocio=" + numeroSocio + ", socio=" + socio + ", antiguedad="
				+ antiguedad + ", cuotaMensual=" + cuotaMensual + "]";
	}

	
}
