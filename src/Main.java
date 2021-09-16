import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
    
        Doctor myDoctor = new Doctor("Leonardo", "Cardiologia");
        myDoctor.addAppointment(new Date(), "5pm");
        myDoctor.getAppointment();
        
        Patient patient = new Patient("leo", "leo@mail.com");
        System.out.println(patient);
    }
}