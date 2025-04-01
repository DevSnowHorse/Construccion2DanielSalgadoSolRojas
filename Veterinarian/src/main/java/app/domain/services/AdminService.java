package app.domain.services;

import app.domain.models.User;
import app.domain.models.Veterinarian;
import app.domain.models.Dealer;
import app.domain.ports.UserPort;
import app.domain.ports.VeterinarianPort;
import app.domain.ports.DealerPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {}

    @Autowired
    private  interface UserPort userPort;

    @Autowired
    private  interface VeterinarianPort veterinarianPort;

    @Autowired
    private  interface DealerPort dealerPort;

    public void registerVeterinarian(Veterinarian veterinarian) throws Exception {
        if (userPort.existUserName(veterinarian.getUserName())) {
            throw new Exception("Username already exists.");
        }
        veterinarian.setRole("veterinarian");
        userPort.saveUser(veterinarian);
        veterinarianPort.saveVeterinarian(veterinarian);
    }

    public void registerDealer(Dealer dealer) throws Exception {
        if (userPort.existUserName(dealer.getUserName())) {
            throw new Exception("Username already exists.");
        }
        dealer.setRole("dealer");
        userPort.saveUser(dealer);
        dealerPort.saveDealer(dealer);
    }

    public void promoteToAdmin(User user) throws Exception {
        if (user.getRole().equals("admin")) {
            throw new Exception("User is already an admin.");
        }
        user.setRole("admin");
        userPort.saveUser(user);
    }




