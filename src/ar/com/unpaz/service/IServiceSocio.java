package ar.com.unpaz.service;

import java.util.stream.Stream;

import ar.com.unpaz.model.Socio;

public interface IServiceSocio {
	
	void mostrarSocios();
	
	void buscarSocio(int id);
	
	double recaudacionTotal();
	
	double socioCuotaMasCostosa();
	
	long cantSociosPremium();
	
	void cuotasMay15k();
	
	double promedioSimple();
	
	void sociosPremium();
	
}
