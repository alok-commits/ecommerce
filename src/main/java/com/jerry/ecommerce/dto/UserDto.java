package com.jerry.ecommerce.dto;

import com.jerry.ecommerce.model.Cart;
import com.jerry.ecommerce.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
}
