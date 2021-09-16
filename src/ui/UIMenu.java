package ui;
import java.util.Scanner;

public class UIMenu {
	
	public static final String[] MONTHS = {
			"Enero", "Febrero", "Marzo",
			"Abril", "Mayo", "Junio",
			"Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre"
	};
	
	public static void showMenu(){
		
		System.out.println("Bienvenido a My Appointments");
		System.out.println("Que desea hacer?");
		
		int response;
		do{
			System.out.println("1. Doctor");
			System.out.println("2. Paciente");
			System.out.println("0. Salir");
			
			Scanner input = new Scanner(System.in);
			response = Integer.parseInt(input.nextLine());
			
			switch (response){
				case 1:
					System.out.println("Doctor");
					break;
				case 2:
					showPatientMenu();
					break;
				case 0:
					System.out.println("Gracias por su visita");
					break;
				default:
					System.out.println("No existe tal opción");
					break;
			}
		}while (response != 0);
	}
	
	public static void showPatientMenu(){
		int response;
		do {
			System.out.println("\n\n");
			System.out.println("Paciente");
			System.out.println("1. Hacer una reserva");
			System.out.println("2. Mis reservas");
			System.out.println("0. Regresar");
			
			Scanner input = new Scanner(System.in);
			response = Integer.parseInt(input.nextLine());
			
			switch (response) {
				case 1:
					showMonths();
					break;
				case 2:
					System.out.println("Mis reservas");
					break;
				case 0:
					showMenu();
					break;
				default:
					System.out.println("No existe esa opcion");
					break;
			}
		}while (response != 0);
	}
	
	public static void showMonths(){
		for (int i = 1; i < 4; i++) {
			System.out.println(i + ". " + MONTHS[i]);
		}
	}
}
