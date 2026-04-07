package com.projetovendas.vendas.repositories;

import com.projetovendas.vendas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
