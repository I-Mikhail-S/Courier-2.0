package org.example.checkOrder;

import org.example.abstractOrder.Order;

public interface ICheckOrder {
    boolean checkOrderLight (Order order) throws Exception;
    boolean checkOrderMedium (Order order) throws Exception;
    boolean checkOrderHard (Order order) throws Exception;
}
