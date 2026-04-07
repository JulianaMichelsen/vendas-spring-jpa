package com.projetovendas.vendas.repositories;

import com.projetovendas.vendas.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
