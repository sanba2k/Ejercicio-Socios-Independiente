	package ar.com.unpaz.repo;
	
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.util.HashMap;
	
	import ar.com.unpaz.model.Socio;
	import ar.com.unpaz.model.SocioPremium;
	import ar.com.unpaz.model.SocioSimple;
	import ar.com.unpaz.service.ILecturaService;
	
	public class LecturaRepo implements ILecturaService{
	
		@Override
		public HashMap<Integer, Socio> Lectura() {
			HashMap<Integer, Socio> mapa = new HashMap<Integer, Socio>();
			
			File sfile = new File("src/socios.txt");
		try {
			FileReader fiRe= new FileReader(sfile);
			BufferedReader buffer = new BufferedReader(fiRe);
			String linea = "";
			while ((linea = buffer.readLine()) != null) {
				String [] array = linea.split(";");
				String tipo = array[0];
				int numeroSocio = Integer.parseInt(array[1]);
				String socio = array[2];
				int antiguedad = Integer.parseInt(array[3]);
				double cuotaMensual = Double.parseDouble(array[4]);
				
				switch(tipo) {
				case "S":
					SocioSimple simple = new SocioSimple(tipo, numeroSocio, socio, antiguedad, cuotaMensual);
					mapa.put(numeroSocio, simple);
					break;
				
				case "P":
					String ubicacion = array[5];
					SocioPremium premium = new SocioPremium(tipo, numeroSocio, socio, antiguedad, cuotaMensual, ubicacion);
					mapa.put(numeroSocio, premium);
					break;
				}
				
			}
			buffer.close();
		}
		
		catch(Exception e) 
		{e.printStackTrace();}
			
			return mapa;
		}
	
	}
