package hw16.person;

public class Actor extends Person {


    public Actor(String fullName) {
        super(fullName);
    }


    public Actor(int id, String fullName, int dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.starFilms = starFilms;
    }


}
