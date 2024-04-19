package it.epicode.MediaPlayer;

import java.sql.SQLOutput;

public class Video extends Riproducibile implements ElementiVisualizzabili{

    private int luminosita;

    public Video(String titolo, int durata){
        this.setTitolo(titolo);
        this.setDurata(durata);
        this.setLuminosita(50);
        this.setVolume(50);

    }


    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.print(this.getTitolo());

        for (int i = 0;  i<this.getLuminosita(); i++){

            System.out.print("*");
        }

    }
    @Override
    public void play() {
        for (int i=0; i<this.getDurata(); i++){
            System.out.print(this.getTitolo() + " - ");
            for (int j = 0; j <this.getVolume(); j++){
                System.out.print("!");
            }
            System.out.print(" - ");
            for (int k=0; k<this.getLuminosita(); k++){
                System.out.print("*");
            }
            System.out.println(".");
        }

    }

    @Override
    public void alzaLum() {
        if (this.getLuminosita()<100){
            luminosita++;
        }
        else {
            System.out.println("Luminosità al massimo");
        }

    }

    @Override
    public void abbassaLum() {
        if (this.getLuminosita()>0){
            luminosita--;
        }
        else {
            System.out.println("Luminosità al minimo");
        }
    }
}
