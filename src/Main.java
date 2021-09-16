import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
    
        Doctor myDoctor = new Doctor("Leonardo", "Cardiologia");
        myDoctor.addAppointment(new Date(), "5pm");
        myDoctor.getAppointment();
    }
}