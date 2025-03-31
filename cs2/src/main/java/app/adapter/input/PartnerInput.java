package app.adapter.input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.domain.models.Person;
import app.ports.PersonPort;
import java.util.Scanner;
@Component
public class PartnerInput {
    @Autowired
    private PersonPort personPort;
    private final String MENU = "Ingrese la opción:" + " \n 1. Crear un socio." + " \n 2. Ver facturas de socio." + " \n 3. Ver información del socio.";
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
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        personPort.savePerson(person);
        System.out.println("Socio creado correctamente.");
    }
    private Scanner getReader() {
        return new Scanner(System.in);
    }
}
