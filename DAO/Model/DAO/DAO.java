package Model.DAO;

import java.util.List;

import Model.Entities.Person;

public interface DAO<T> {

    public void create(T t);
    
    public void updateName(int id, int whatToUpdate,String newName);

    public void updateDNI(int id, int whatToUpdate,long newDNI);
    
    public void delete(int id);
    
    public List<Person> readAll();
    
    public Person readById(int id);
}



