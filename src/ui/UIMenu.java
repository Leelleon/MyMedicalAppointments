package ui;
import model.Doctor;
import model.Patient;

import javax.print.Doc;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
	
	public static final String[] MONTHS = {
			"Enero", "Febrero", "Marzo",
			"Abril", "Mayo", "Junio",
			"Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre"
	};
	public static Doctor doctorLogged;
	public static Patient patientLogged;
	
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
					System.out.println("model.Doctor");
					response = 0;
					authUser(1);
					break;
				case 2:
					showPatientMenu();
					response = 0;
					authUser(2);
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
	
	private static void authUser(int userType){
		//userType 1. Doctor,2. Paciente
		ArrayList<Doctor> doctors = new ArrayList<>();
		doctors.add(new Doctor("Alejandro Martinez", "ale@mail.com"));
		doctors.add(new Doctor("Karen Sosa", "karen@mail.com"));
		doctors.add(new Doctor("Rocio Gomez", "rocioe@mail.com"));
		
		ArrayList<Patient> patients = new ArrayList<>();
		patients.add(new Patient("Anahi Salgado", "ana@mail.com"));
		patients.add(new Patient("Roberto Musso", "roberto@mail.com"));
		patients.add(new Patient("Carlos Sanchez", "carlos@mail.com"));
		
		boolean emailCorrect = false;
		do {
			System.out.println("Ingrese su correo user@dominio.com");
			Scanner input = new Scanner(System.in);
			String email = input.nextLine();
			if (userType == 1){
				for (Doctor d: doctors){
					if (d.getEmail().equals(email)){
						emailCorrect = true;
						//Obtener los datos del usuario
						doctorLogged = d;
						//showDoctorMenu
					}
				}
			}
			if (userType == 2){
				for (Patient p: patients){
					if (p.getEmail().equals(email)){
						emailCorrect = true;
						//Obtener los datos del usuario
						patientLogged = p;
						showPatientMenu();
					}
				}
			}
		}while (!emailCorrect);
	}
	public static void showMonths(){
		for (int i = 1; i < 4; i++) {
			System.out.println(i + ". " + MONTHS[i]);
		}
	}
}
