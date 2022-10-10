package service;

import controller.dto.UserDto;
import repository.entity.UserEntity;

public class UserConverter {

    public UserDto convertToUserDto(UserEntity userEntity) {
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setLogin(userEntity.getLogin());
        userDto.setName(userEntity.getName());
        userDto.setPassword(userEntity.getPassword());
        return userDto;
    }

    public UserEntity convertToUserEntity(UserDto userDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDto.getId());
        userEntity.setLogin(userDto.getLogin());
        userEntity.setName(userDto.getName());
        userEntity.setPassword(userDto.getPassword());
        return userEntity;
    }
}
