package View;

import java.util.List;
import java.util.Scanner;

import Model.Entities.Person;

public class console {
    Scanner teclado = new Scanner(System.in);
    public Person addPerson(){
        teclado.nextLine();
        System.out.println("Ingrese el nombre de la persona a agregar");
        String name = teclado.nextLine();
        System.out.println("Ingrese el DNI");
        int dni = teclado.nextInt();
        Person p = new Person(name, dni);
        return p;
    }

    public int askID(){
        System.out.println("Ingrese el id de la persona");
        int id = teclado.nextInt();
        return id;
    }

    public int whatToUpdate(){
        System.out.println("¿Que desea actualizar?");
        System.out.println("(1) Nombre (2) DNI");
        int opcion = teclado.nextInt();
        return opcion;
    }

    public String askNewName(){
        teclado.nextLine();
        System.out.println("Ingrese el nuevo nombre");
        String newName = teclado.nextLine();
        return newName;
    }

    public long askNewDNI(){
        teclado.nextLine();
        System.out.println("Ingrese el nuevo DNI");
        long newDNI = teclado.nextLong();
        return newDNI;
    }

    public void succeedMessage(){
        System.out.println("Accion copletada exitosamente");
    }

    public void showAllPeople(List<Person> PersonList){
        System.out.println("Estas son todas las personas guardadas:");
        for(int i = 0; i < PersonList.size(); i++){
            Person person = PersonList.get(i);
            System.out.println("ID:" + person.getId() + " Nombre:" + person.getName() + " DNI:" + person.getDni());
        }
    }

    public void showById(Person p){
        System.out.println("Esta es la persona que buscas");
        System.out.println("Nombre: " + p.getName() + "DNI: " + p.getDni() );
    }
}
