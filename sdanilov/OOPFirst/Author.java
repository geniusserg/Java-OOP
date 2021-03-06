package sdanilov.OOPFirst;

/**
 * Class: Author
 * 
 * Author: Danilov Sergey
 * 
 * Date: 3/22/2021
 */

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Author[name=%s,email%s,gender=%c]", name, email, gender);
    }

}
