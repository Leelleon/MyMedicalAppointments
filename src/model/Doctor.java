package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;
    
    public Doctor(String name, String email){
        super(name, email);
        this.speciality = speciality;
    }
    
    public String getSpeciality() {
        return speciality;
    }
    
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
    
    @Override
    public String toString() {
        return super.toString() +
                "speciality='" + speciality + '\'' +
                ", Appointments=" + Appointments;
    }
    
    @Override
    public void showDataUser() {
        System.out.println("Empleado");
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Oncologia");
    }
}