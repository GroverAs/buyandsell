package com.example.buyandsell.repositories;

import com.example.buyandsell.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
