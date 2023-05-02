package com.example.buyandsell.repositories;

import com.example.buyandsell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> { // JpaRepository позволяет вызывать методы GET,
    //SET, DELETE и т.д. из таблицы базы данных не создавая класс DAO. Т.е. репозиторий позволяет работать с объектом
    // в базе данных
    List<Product> findByTitle(String title);
}
