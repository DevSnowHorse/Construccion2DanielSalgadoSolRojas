package app.adapter.input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.domain.models.Person;
import app.ports.PersonPort;
import java.util.Scanner;
@Component
public class GuestInput {
    @Autowired
    private PersonPort personPort;
    private final String MENU = "Ingrese la opción:" + " \n 1. Para registrarse como invitado." + " \n 2. Ver información pública del club." + " \n 3. Ver información pública de un socio.";
    public void menu() {
        System.out.println(MENU);
        String option = getReader().nextLine();
        switch (option) {
            case "1": {
                try {
                    this.registerAsGuest();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            default:
                System.out.println("Opción no válida");
        }
    }
    private void registerAsGuest() throws Exception {
        Scanner scanner = getReader();
        System.out.println("Ingrese su nombre:");
        String name = scanner.nextLine().trim();
        System.out.println("Ingrese su ID:");
        long id = Long.parseLong(scanner.nextLine().trim());
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        personPort.savePerson(person);
        System.out.println("Invitado registrado correctamente.");
    }
    private Scanner getReader() {
        return new Scanner(System.in);
    }
}
