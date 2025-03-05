package com.meuprojeto.projetowebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projetowebservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
