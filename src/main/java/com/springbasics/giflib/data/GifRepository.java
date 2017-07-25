package com.springbasics.giflib.data;

import com.springbasics.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("compiler-bot", 1, LocalDate.of(2017,07,23), "wiktor", true),
            new Gif("android-explosion", 2, LocalDate.of(2017,04,12), "alojz", false),
            new Gif("ben-and-mike", 3, LocalDate.of(2016,07,2), "ben", true),
            new Gif("book-dominos",2, LocalDate.of(2017,02,20), "janusz", false),
            new Gif("cowboy-coder",1, LocalDate.of(2017,04,28), "wiktor", true),
            new Gif("infinite-andrew",3, LocalDate.of(2017,01,05), "andrew", true)
    );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public Gif findByName(String name) {
        for(Gif gif : ALL_GIFS) {
            if(gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> findByCategoryId(int id) {
        List<Gif> gifs = new ArrayList<>();
        for(Gif gif : ALL_GIFS) {
            if(gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }
}
