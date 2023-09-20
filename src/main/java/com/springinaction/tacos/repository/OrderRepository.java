package com.springinaction.tacos.repository;

import com.springinaction.tacos.entity.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
