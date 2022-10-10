package service;

import controller.dto.UserDto;
import repository.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserDto getUser(Integer id) ;

    List<UserEntity> getAllUsers();

    void deleteUser(UserDto userDto);

    void saveUser (UserDto userDto);

}
