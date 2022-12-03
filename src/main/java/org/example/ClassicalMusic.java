package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    private List<String> playlist = new ArrayList<>();

    {
        playlist.add("Hungarian Rhapsody");
        playlist.add("Symphony no. 5 in C Minor, op. 67");
        playlist.add("Night on Bald Mountain");
    }


    @Override
    public List<String> getSong() {
        return playlist;
    }
}
