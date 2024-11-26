package com.mezen.camions.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import com.mezen.camions.entities.Image;
public interface ImageService {
 Image uplaodImage(MultipartFile file) throws IOException;
 Image getImageDetails(Long id) throws IOException;
 ResponseEntity<byte[]> getImage(Long id) throws IOException;
 void deleteImage(Long id) ;
 Image uplaodImageCam(MultipartFile file,Long idCam) throws IOException;
 List<Image> getImagesParCam(Long camId);

}

