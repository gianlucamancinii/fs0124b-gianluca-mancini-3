package it.epicode.MediaPlayer;

public  abstract class Riproducibile  extends Media implements ElementiRiproducibili{

    private int durata;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }


    @Override
    public void abbassaVol() {

    }

    @Override
    public void alzaVol() {

    }

    @Override
    public void play() {

    }
}
