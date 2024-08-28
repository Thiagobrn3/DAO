package Model.Entities;

public class Person {
    private String name;
    private int id;
    private long dni;
    
    public Person(String name, long dni) {
        this.name = name;
        this.dni = dni;
    }
    public Person() {
    }
    public Person(String name, int id, long dni) {
        this.name = name;
        this.id = id;
        this.dni = dni;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public long getDni() {
        return dni;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
}
