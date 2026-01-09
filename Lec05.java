void main() {

    // Create an instance of User named john
    User john = new User("John", 1954, 2, 18);

    // Display John's information
    john.displayInfo();
    System.out.println();
//    john.getNow();
    Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
    nicolas.displayInfo();
    System.out.println();
    nicolas.displayInfo(true);
    System.out.println();
    nicolas.displayInfo(false);

}
