public class User {
    String userName;
    String userSurname;
    int userID;
    Pet[] userPets;
    int telNumber;

    public User(String userName, String userSurname, int userID, Pet[] userPets, int telNumber) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userID = userID;
        this.userPets = userPets;
        this.telNumber = telNumber;
    }
    public User() {
        this.userName = "Not Found";
        this.userSurname = "Not Found";
        this.userID = -1;
        this.userPets = new Pet[0];
        this.telNumber = -1;
    }

    public void showMyAppointment(){
        System.out.println("randevular gösterildi");
    }


}
