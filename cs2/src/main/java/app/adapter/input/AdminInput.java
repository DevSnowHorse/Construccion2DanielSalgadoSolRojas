package app.adapter.input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.domain.models.Person;
import app.ports.PersonPort;
import java.util.Scanner;
@Component
public class AdminInput {
    @Autowired
    private PersonPort personPort;
    private final String MENU = "Ingrese la opción:" + " \n 1. Para crear Socios." + " \n 2. Ver facturas del club." + " \n 3. Ver facturas de un socio." + " \n 4. Ver facturas de una persona." + " \n 5. Promover socios.";
    public void menu() {
        System.out.println(MENU);
        String option = getReader().nextLine();
        switch (option) {
            case "1": {
                try {
                    this.createPartner();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            default:
                System.out.println("Opción no válida");
        }
    }
    private void createPartner() throws Exception {
        Scanner scanner = getReader();
        System.out.println("Ingrese el nombre del socio:");
        String name = scanner.nextLine().trim();
        System.out.println("Ingrese el ID del socio:");
        long id = Long.parseLong(scanner.nextLine().trim());
        System.out.println("Ingrese el número celular del socio:");
        long cellPhone = Long.parseLong(scanner.nextLine().trim());
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        PersonWithCellPhone personWithCellPhone = new PersonWithCellPhone(person, cellPhone);
        personPort.savePerson(personWithCellPhone.getPerson());
        System.out.println("Socio creado correctamente.");
    }
    private Scanner getReader() {
        return new Scanner(System.in);
    }
    public class PersonWithCellPhone {
        private Person person;
        private long cellPhone;
        public PersonWithCellPhone(Person person, long cellPhone) {
            this.person = person;
            this.cellPhone = cellPhone;
        }
        public Person getPerson() {
            return person;
        }
        public long getCellPhone() {
            return cellPhone;
        }
    }
}
