package com.sample.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.gallery.entity.ImageGallery;

@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{
    
}
