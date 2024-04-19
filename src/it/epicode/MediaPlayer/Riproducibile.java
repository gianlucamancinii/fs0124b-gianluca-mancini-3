package it.epicode.MediaPlayer;
// Definizione della classe astratta Riproducibile che estende Media e implementa ElementiRiproducibili
public  abstract class Riproducibile  extends Media implements ElementiRiproducibili{
    // Attributi privati per memorizzare la durata e il volume del media riproducibile

    private int durata;  // Durata del media
    private int volume = 5;   // Volume di riproduzione predefinito


    // Metodo per ottenere il volume corrente del media riproducibile
    public int getVolume() {
        return volume;  //restituisce volume attuale
    }

    // Metodo per impostare la durata del media riproducibile
    public void setDurata(int durata) {
        this.durata = durata;  // Imposta la durata del media
    }
    // Metodo per ottenere la durata del media riproducibile
    public int getDurata() {
        return durata;  // Restituisce la durata del media
    }

    // Implementazione del metodo per abbassare il volume del media riproducibile
    @Override
    public void abbassaVol() {
// Verifica se il volume è maggiore di 0
        if (volume>0){
            // Decrementa il volume

            volume--;
        }
        else {
            // Stampa un messaggio se il volume è già al minimo
            System.out.println("Volume al minimo");
        }

    }
    // Implementazione del metodo per aumentare il volume del media riproducibile
    @Override
    public void alzaVol() {
        // Verifica se il volume è minore di 100

        if (volume<100){
            // Incrementa il volume

            volume++;
        }
        else {
            // Stampa un messaggio se il volume è già al massimo
            System.out.println("Volume al massimo");
        }

    }

    @Override
    public void play() {

    }

}
