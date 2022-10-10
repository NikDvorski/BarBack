
import controller.UserController;
import repository.UserRepository;
import service.UserConverter;
import service.UserService;
import service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        UserRepository userRepository = new UserRepository();
        UserConverter userConverter = new UserConverter();
//        UserService userService = new UserServiceImpl(userRepository, userConverter);
//        UserController userController = new UserController(userService);
//        String a="3";
//        System.out.println(userController.getAllUsers());

    }
}