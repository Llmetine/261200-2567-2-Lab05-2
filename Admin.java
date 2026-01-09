public class Admin extends User {
    public Admin(){
        super();
    }
    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("User type: admin.");
    }
    void displayInfo(boolean full){
        if(full==true){
            super.displayInfo();
            System.out.println("User type: admin.");
            System.out.print("Today's date: "+ today.now());
        }
        else{
            System.out.println("Name: "+this.name);
        }

    }
    public void displayHappyBirthday() {
        int age = today.getYear()-dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }

}
