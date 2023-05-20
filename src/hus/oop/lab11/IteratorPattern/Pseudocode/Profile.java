package hus.oop.lab11.IteratorPattern.Pseudocode;

public class Profile {
    private String id;
    private String email;

    private String type;

    public Profile() {
    }

    public Profile(String id,String type) {
        this.id = id;
        this.type = type;
    }

    public Profile(String id, String email, String type) {
        this.id = id;
        this.email = email;
        this.type = type;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
