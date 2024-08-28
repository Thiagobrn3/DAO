package Controller;
import java.util.List;
import Model.DAO.DAOPerson;
import Model.Entities.Person;
import View.console;

public class controller {
    private DAOPerson daoPerson;
    private console Console;

    public controller(DAOPerson daoPerson, console Console){
        this.Console = Console;
        this.daoPerson = daoPerson;
    }

    public void addPerson(){
        Person p = Console.addPerson();
        daoPerson.create(p);
    }

    public void updatePerson(){
        int id = Console.askID();
        int whatToUpdate = Console.whatToUpdate();
        if(whatToUpdate == 1){
            String newName = newName();
            daoPerson.updateName(id, whatToUpdate,newName);
        }
        if(whatToUpdate == 2){
            long newDNI = newDNI();
            daoPerson.updateDNI(id, whatToUpdate, newDNI);
        }
    }

    public String newName(){
        String newName = Console.askNewName();
        return newName;
    }

    public long newDNI(){
        long newDNI = Console.askNewDNI();
        return newDNI;
    }

    public void delete(){
        int id = Console.askID();
        daoPerson.delete(id);
    }

    public void showAllPeopleToConsole(List<Person> data){
        Console.showAllPeople(data);
    }

    public void showAllPeople(){
        List<Person> data = daoPerson.readAll();
        showAllPeopleToConsole(data);
    }

    public void showById(){
        int id = Console.askID();
        Person p = daoPerson.readById(id);
        showByIdToConsole(p);
    }

    public void showByIdToConsole(Person p){
        Console.showById(p);
    }
}