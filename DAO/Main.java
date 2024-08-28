import java.util.Scanner;
import Controller.controller;
import Model.DAO.DAOPerson;
import View.console;
public class Main {
    public static void main(String[] args) {
        console Console = new console();
        DAOPerson daoPerson = new DAOPerson();
        controller Controller = new controller(daoPerson,Console);
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("(1) Añadir persona (2) Actualizar datos de una persona (3) Mostrar todas las personas en la lista (4)Buscar una persona por id (5) Borrar una persona" );
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Controller.addPerson();
                    break;
                case 2:
                    Controller.updatePerson();
                    break;
                case 3:
                    Controller.showAllPeople();;
                    break;
                case 4:
                    Controller.showById();
                    break;
                case 5:
                    Controller.delete();
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        } while (opcion > 1 || opcion < 5);
        teclado.close();
    }
}