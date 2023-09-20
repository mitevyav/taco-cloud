package com.springinaction.tacos.repository;

import com.springinaction.tacos.entity.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
