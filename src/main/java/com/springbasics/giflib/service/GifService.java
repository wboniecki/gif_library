package com.springbasics.giflib.service;


import com.springbasics.giflib.model.Gif;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface GifService {
    List<Gif> findAll();
    Gif findById(Long id);
    void save(Gif gif, MultipartFile file);
    void updateFavorite(Gif gif);
    void delete(Gif gif);
}
