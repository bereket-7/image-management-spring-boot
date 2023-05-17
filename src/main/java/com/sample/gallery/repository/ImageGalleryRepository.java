package com.sample.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageGalleryRepository extends JpaRepository<ImageGallery,Integer>{
    
}
