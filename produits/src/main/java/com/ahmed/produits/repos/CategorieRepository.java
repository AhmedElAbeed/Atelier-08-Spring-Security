package com.ahmed.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.produits.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}