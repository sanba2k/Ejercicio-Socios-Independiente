package ar.com.unpaz.inicio;

import java.util.Scanner;

import ar.com.unpaz.repo.SociosImp;
import ar.com.unpaz.service.IServiceSocio;

public class Inicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		IServiceSocio service = new SociosImp();
		
		int opcion;
		
		do {
			System.out.println(" iniciando ");
			System.out.println("1 mostrar socios");
			System.out.println("2 buscar socio");
			System.out.println("3 recaudacion total");
			System.out.println("4 socio con la cuota mas alta");
			System.out.println("5 cant de socios premium");
			System.out.println("6 cuotas mayores a 15k");
			System.out.println("7 promedio de cuotas simples");
			System.out.println("8 Socios Premium");
			System.out.println("9 salir");
			System.out.println("Elegir opcion:   ");
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcion) {
			case 1:
				service.mostrarSocios();
				break;
			
			case 2:
				System.out.println("Introducir numero de socio");
				int num = scanner.nextInt();
				
				service.buscarSocio(num);
				break;
				
			case 3:
				System.out.println("La recaudacion total fue de: " + service.recaudacionTotal());
				break;
				
			case 4:
				System.out.println("El socio con la cuota mas alta es: " + service.socioCuotaMasCostosa());
				break;
				
			case 5:
				System.out.println("La cantidad de socios premium son: " + service.cantSociosPremium());
				break;
				
			case 6:
				service.cuotasMay15k();
				break;
			
			case 7:
				System.out.println(service.promedioSimple());
				break;
				
			case 8:
				service.sociosPremium();
				break;
				
			default:
				System.out.println("Saliendo... ... .. . ");
			}
			
			
		} while(opcion != 9);
		
	}

}
