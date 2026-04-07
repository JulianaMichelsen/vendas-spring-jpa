package com.projetovendas.vendas.repositories;

import com.projetovendas.vendas.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
