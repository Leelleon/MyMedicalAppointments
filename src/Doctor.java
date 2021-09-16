import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id;
    private String name;
    private String email;
    private String speciality;
    
    public Doctor(String name, String speciality){
        this.id = id++;
        this.name = name;
        this.speciality = speciality;
    }
    
    public void ShowID(){
        System.out.println(this.id);
    }
    
    ArrayList<AvailableAppointment> Appointments = new ArrayList<>();
    public void addAppointment(Date date, String time){
        Appointments.add(new Doctor.AvailableAppointment(date, time));
    }
    
    public void getAppointment(){
        for (AvailableAppointment A:
                Appointments) {
            System.out.println(A.date + " " + A.time);
        }
    }
    
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        
        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }
    }
}