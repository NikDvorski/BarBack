package service;


import controller.dto.UserDto;
import exception.BusinessException;
import repository.UserRepository;
import repository.entity.UserEntity;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserConverter userConverter;

    public UserServiceImpl(UserRepository userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }
    @Override
    public UserDto getUser(Integer id)  {
        return userConverter.convertToUserDto(userRepository.findById(id)
                .orElseThrow(()->new BusinessException("Не удалось найти юзера")));
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(UserDto userDto ) {
        userRepository.delete(userConverter.convertToUserEntity(userDto));
    }

    @Override
    public void saveUser (UserDto userDto){
        userRepository.save(userConverter.convertToUserEntity(userDto));

    }
}
