import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
    
        Doctor myDoctor = new Doctor("Leonardo", "Cardiologia");
        myDoctor.addAppointment(new Date(), "5pm");
        myDoctor.getAppointment();
        System.out.println(myDoctor);
        myDoctor.showDataUser();
        
        Patient patient = new Patient("leo", "leo@mail.com");
        System.out.println(patient);
        patient.showDataUser();
    }
}