package com.jerry.ecommerce.service.user;

import com.jerry.ecommerce.dto.UserDto;
import com.jerry.ecommerce.model.User;
import com.jerry.ecommerce.request.CreateUserRequest;
import com.jerry.ecommerce.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
