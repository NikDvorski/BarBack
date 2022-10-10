package controller;

import controller.dto.UserDto;
import repository.entity.UserEntity;
import service.UserService;

import java.util.List;


public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserDto getUser(Integer Id) {
        return userService.getUser(Id);
    }

    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    public void saveUser(UserDto userDto){
        userService.saveUser(userDto);
    }

    public void deleteUser(UserDto userDto){
        userService.deleteUser(userDto);
    }
}
