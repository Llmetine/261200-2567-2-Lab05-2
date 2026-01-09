void main() {

    // Create an instance of User named john
    User john = new User("John", 1954, 1, 9);

    // Display John's information
    john.displayInfo();
    john.displayHappyBirthday();
    System.out.println();
//    john.getNow();
    Admin nicolas = new Admin("Nicolas", 1964, 1, 9);
    nicolas.displayInfo();
    nicolas.displayHappyBirthday();
    System.out.println();
    nicolas.displayInfo(true);
    System.out.println();
    nicolas.displayInfo(false);

}
