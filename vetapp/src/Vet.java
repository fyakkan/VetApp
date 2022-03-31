public class Vet {
    String vetName;
    String vetSurname;
    int vetID;
    int telNumber;

    public Vet(String vetName, String vetSurname, int vetID, int telNumber) {
        this.vetName = vetName;
        this.vetSurname = vetSurname;
        this.vetID = vetID;
        this.telNumber = telNumber;
    }
    public Vet() {
        this.vetName = "Not Found";
        this.vetSurname ="Not Found";
        this.vetID = -1;
        this.telNumber = -1;
    }


}
