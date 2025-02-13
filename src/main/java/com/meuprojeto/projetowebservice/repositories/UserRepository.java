package com.meuprojeto.projetowebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projetowebservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
