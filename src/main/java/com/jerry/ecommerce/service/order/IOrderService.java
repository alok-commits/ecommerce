package com.jerry.ecommerce.service.order;

import com.jerry.ecommerce.dto.OrderDto;
import com.jerry.ecommerce.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
