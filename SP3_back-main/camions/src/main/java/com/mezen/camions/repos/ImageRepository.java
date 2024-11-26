package com.mezen.camions.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mezen.camions.entities.Image;
public interface ImageRepository extends JpaRepository<Image , Long> {
}
