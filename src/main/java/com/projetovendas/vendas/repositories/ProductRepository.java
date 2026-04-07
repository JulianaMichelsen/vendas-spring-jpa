package com.projetovendas.vendas.repositories;

import com.projetovendas.vendas.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
