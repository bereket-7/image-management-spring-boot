package com.sample.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.gallery.entity.ImageGallery;

public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{
    
}
