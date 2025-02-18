package com.meuprojeto.projetowebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projetowebservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
