package app.domain.services;

import app.domain.models.User;
import app.ports.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserPort userPort;

    public User login(User user) throws Exception {
        User userValidate = userPort.findByUserName(user);
        if (userValidate == null || !user.getPassword().equals(userValidate.getPassword())) {
            throw new Exception("Invalid username or password.");
        }
        return userValidate;
    }
}
