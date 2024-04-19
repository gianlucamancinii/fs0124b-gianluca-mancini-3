package it.epicode;

import it.epicode.MediaPlayer.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Video youtube = new Video("youtube",5);
        youtube.play();
    }
}