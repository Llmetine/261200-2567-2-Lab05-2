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
            System.out.print("Today's date: ");
            super.getNow();
        }
        else{
            System.out.println("Name: "+this.name);
        }

    }
}
