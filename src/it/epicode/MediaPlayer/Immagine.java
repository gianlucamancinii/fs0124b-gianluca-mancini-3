package it.epicode.MediaPlayer;

public class Immagine extends Media implements ElementiVisualizzabili{

    private int luminosita;

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
