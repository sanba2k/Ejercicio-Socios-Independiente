package ar.com.unpaz.repo;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import ar.com.unpaz.model.Socio;
import ar.com.unpaz.service.IServiceSocio;

public class SociosImp implements IServiceSocio{

	LecturaRepo lectura = new LecturaRepo();
	HashMap<Integer, Socio> mapa = lectura.Lectura();
	
	
	@Override
	public void mostrarSocios() {
		for(Socio c : mapa.values()) {
			System.out.println(c);
			System.out.println(c.calcularCuotaFinal());
		}
	}

	@Override
	public void buscarSocio(int id) {
		for(Socio c : mapa.values()) {
			if(c.getNumeroSocio() == id) {
				System.out.println(c);
				return;
			}
			
		}

	}

	@Override
	public double recaudacionTotal() {
		double total = mapa.values().stream().mapToDouble(a -> a.calcularCuotaFinal()).sum();
		
		return total;
	}

	@Override
	public double socioCuotaMasCostosa() {
		double total= mapa.values().stream().mapToDouble(a -> a.calcularCuotaFinal()).max().orElse(0.0);
		
		return total;
	}

	@Override
	public long cantSociosPremium() {
		long cantidad = mapa.values().stream().filter(a -> a.getTipoSocio().equals("P")).count();
		
		return cantidad;
	}

	@Override
	public void cuotasMay15k() {
		mapa.values().stream().filter(a -> a.calcularCuotaFinal()> 15000).forEach(a -> System.out.println(a));
		
		
	}

	@Override
	public double promedioSimple() {
		double promedio = mapa.values().stream().
							filter(a -> a.getTipoSocio().equals("S")).
							mapToDouble(a -> a.calcularCuotaFinal()).
							average().
							orElse(0.0);
		
		return promedio;
	}

	@Override
	public void sociosPremium() {
		List<String> lista = mapa.values().stream().
							filter(a -> a.getTipoSocio().equals("P")).
							map(a -> a.getSocio()).
							toList();
		
		lista.forEach(a -> System.out.println(a));

		
	}

}
