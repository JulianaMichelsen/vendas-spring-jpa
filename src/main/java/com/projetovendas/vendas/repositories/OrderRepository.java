package com.projetovendas.vendas.repositories;

import com.projetovendas.vendas.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
