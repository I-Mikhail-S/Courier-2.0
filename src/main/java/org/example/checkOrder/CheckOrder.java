package org.example.checkOrder;

import org.example.abstractOrder.Order;

public class CheckOrder implements ICheckOrder{
    @Override
    public boolean checkOrderLight(Order order) throws Exception {
        if (order.getWeight()>0.0 && order.getWeight()<3.0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkOrderMedium(Order order) throws Exception {
        if (order.getWeight()>0.0 && order.getWeight()<5.0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkOrderHard(Order order) throws Exception {
        if (order.getWeight()>0.0 && order.getWeight()<10.0) {
            return true;
        }
        return false;
    }
}
