package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {

    List<String> playlist = new ArrayList<>();

    {
        playlist.add("Wind cries Mary");
        playlist.add("Paint it black");
        playlist.add("Can't seem to make you mine");
    }

    @Override
    public List<String> getSong() {
        return playlist;
    }
}
