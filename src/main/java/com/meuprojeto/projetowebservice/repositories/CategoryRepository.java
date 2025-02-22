package com.meuprojeto.projetowebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projetowebservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
