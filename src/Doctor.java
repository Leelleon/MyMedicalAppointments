public class Doctor {
    static int id;
    String name;
    String speciality;

    Doctor(){
        id++;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println(id);
    }
}