package org.example;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
    List<String> playlist = new ArrayList<>();

    {
        playlist.add("Jazz one");
        playlist.add("Jazz two");
        playlist.add("Jazz three");
    }

    @Override
    public List<String> getSong() {
        return playlist;
    }
}
