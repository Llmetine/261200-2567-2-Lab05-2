import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User(){
        name = null;
        dob = LocalDate.now(); // current date
    }

    public User(String name,int year, int month ,int day){
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Date of Birth: " + dob);

    }
    void getNow(){
        System.out.println(LocalDate.now());;
    }
}
