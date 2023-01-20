package lomayd.springstudy02.domain.order.service;

import lomayd.springstudy02.domain.order.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
