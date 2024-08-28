package Model.DAO;

import java.util.ArrayList;
import java.util.List;

import Model.Entities.Person;

public class DAOPerson implements DAO<Person>{
    private List<Person> data = new ArrayList<Person>();
	private static int nextId = 1;
    @Override
	public void create(Person t){
		t.setId(nextId ++);
		this.data.add(t);
    }

    @Override
    public void updateName(int id, int whatToUpdate, String newName) {
        for (Person person : data) {
            if (person.getId() == id) {
                if (whatToUpdate == 1) {
                    person.setName(newName);
                }
            }
        }
    }

    @Override
    public void updateDNI(int id, int whatToUpdate, long newDNI){
        for (Person person : data) {
            if (person.getId() == id){
                if (whatToUpdate == 2) {
                    person.setDni(newDNI);
                }
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {
                data.remove(i);
                break; 
            }
        }
    }
    

    @Override
    public List<Person> readAll() {
        return data;
    }

    @Override
    public Person readById(int id) {
        for(int i = 0; i < data.size(); i++){
            Person person = data.get(i);
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
}
