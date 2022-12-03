package org.example;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> music;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        Music genre = music.get(randomNumber);
        System.out.println(genre.getSong().get(randomNumber));
    }
}
