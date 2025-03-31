package app.adapter.input;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class LoginInput {
    private final String MENU = "Ingrese la opción:" + " \n 1. Iniciar sesión." + " \n 2. Ver perfil de usuario." + " \n 3. Recuperar contraseña.";
    public void menu() {
        System.out.println(MENU);
        String option = getReader().nextLine();
        switch (option) {
            case "1": {
                try {
                    this.loginUser();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            default:
                System.out.println("Opción no válida");
        }
    }
    private void loginUser() throws Exception {
        Scanner scanner = getReader();
        System.out.println("Ingrese su nombre de usuario:");
        String username = scanner.nextLine().trim();
        System.out.println("Ingrese su contraseña:");
        String password = scanner.nextLine().trim();
        if ("admin".equals(username) && "password123".equals(password)) {
            System.out.println("Usuario autenticado correctamente.");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
    private Scanner getReader() {
        return new Scanner(System.in);
    }
}
