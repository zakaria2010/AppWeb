package demo.services.impl;

import demo.Shared.dto.UserDto;
import demo.entities.UserEntity;
import demo.repositories.UserRepository;
import demo.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        userEntity.setEncryptedPassword("test password");
        userEntity.setUserId("user test id");

        UserEntity newUser = userRepository.save(userEntity);
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(newUser, userDto);
        return userDto;
    }
}
